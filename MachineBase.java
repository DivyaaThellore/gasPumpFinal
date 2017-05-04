import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class GasPump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MachineBase extends Actor
{
    /**
     * Act - do whatever the GasPump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    Button1 b1;
    Keypad keypad=new Keypad();
    Button button = new Button();
    Message message1 = new Message();
    
    Message message2=new Message();
    public MachineBase(){
        GreenfootImage image = getImage() ;
        image.scale(550,350 ) ;
    }
    
    public void setMessage1(String s)
    {
        message1.setInstructions(s);
    }
    
    public void addChildObjects()
    {
       getWorld().addObject(keypad,500,475);
       keypad.addKeys();
       
       //getWorld().addObject(button,240,100);
       Button b1=new Button();
        getWorld().addObject(b1, 240,50);
        Button b2=new Button();
        getWorld().addObject(b2, 240,150);
        Button b3=new Button();
        getWorld().addObject(b3, 240,250);
        Button b4=new Button();
        getWorld().addObject(b4, 240,350);

        Button b5=new Button();
        getWorld().addObject(b5, 750,50);
        Button b6=new Button();
        getWorld().addObject(b6, 750,150);
        Button b7=new Button();
        getWorld().addObject(b7, 750,250);
        Button b8=new Button();
        getWorld().addObject(b8, 750,350);
        
         message1.setTextBox(400, 50);
         message1.setInstructions("WELCOME");     
        getWorld().addObject(message1,getX(),  getY()-getImage().getHeight()/2+50);
        
        message2.setTextBox(500,300);
        message2.setInstructions("TEST");
        nozzle nozzle = new nozzle();
        getWorld().addObject(nozzle, 850,500);
       
       
    }
    
    public void showKeypad()
    {
    }
    public void hideKeypad()
    {
        
    }
    
    
    
    /*
    public void initTexts()

    {
    gi.drawString("test", 25, 25);

    }

    public void setTexts(String msg)
    {
    gi.clear();
    gi.setColor(greenfoot.Color.YELLOW);
    gi.fill();
    gi.setColor(greenfoot.Color.BLACK);
    gi.drawString(msg,0,25);
    }
     */

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            //  MessagePop messagePop = new MessagePop();
          
            

            //GreenfootImage image =  new GreenfootImage(200,200);
            //Keypad keypad = new Keypad();
            //getWorld().addObject(keypad,500,500);
        }

    }

    int gallons_available,card_n;
    boolean card_in_slot=true,balance_check=false,req_res=false,pin_OK=false,zip_OK=false,Help=false,Cancel=false,credit_card=false,debit_card=true;
    Bank bank = Bank.getBank();
    double price,cost_per_gallon_1=2.8,cost_per_gallon_2=3.1,cost_per_gallon_3=3.3;
    String fuel_type,req_res_str;
    String zip,pin;// making changes here
    int n,code,trial=0;
    int[] rejected_cards=new int[5];
    People people;
    CodeGenerator cg;
    Scanner scanner = new Scanner(System.in);

    public void blank_welcome()
    { 
        System.out.println("try a different card");
        welcome();
    }

    public void welcome()
    {
        // call those 5 message boxes.
        
        //message1.setInstructions("WELCOME")
        
        
        if(card_in_slot==true)
        {
             message1.setInstructions("Welcome \n Please insert card");
            //System.out.println("Welcome \n Please insert card");

            if(card_in_slot)
            {
                
                
                System.out.println("Debit card or Credit card");
                String card=scanner.nextLine();
                if(card=="Debit card"){
                    debit_card=true;
                    credit_card=false;
                }
                else if(card=="Credit Card")
                {
                    credit_card=true;
                    debit_card=false;
                }
                if(debit_card && !credit_card)
                    get_zip();

                if(credit_card && !debit_card)
                    get_pin();
                /*if(this.getClass().getName()=="Machine3.class")
                request_receipt();
                else
                {
                display_help_info();*/

            }

            //get_zip();
            /*if(this.getClass().getName()=="Machine3.class")
            request_receipt();
            else
            {
            display_help_info();*/

        }
        else
        {
            Greenfoot.playSound("beep.wav");
            System.out.println("Welcome \n Please insert card");
            //delay(1000);

        }
        return;
    }

    public void function()
    {
    }

    public void get_pin()
    {
        System.out.println("enter card number");

        card_n=scanner.nextInt();
        String x=scanner.nextLine();
        for(int i=0;i<=4;i++)
        {
            if(card_n==rejected_cards[i])
                blank_welcome();
        }

        System.out.println("your card # is: " +card_n);

        System.out.println("Enter the pin number");

        //System.out.println("1\t2\t3");
        //System.out.println("4\t5\t6");
        //System.out.println("7\t8\t9");
        pin=scanner.nextLine();
        System.out.println("you entered a pin number");

        if(pin == null)
        {
            System.out.println("blank input!");
            welcome();

        }
        else{
            pin_OK=bank.validate_pin(pin, card_n);
            if(pin_OK)
                return;
            else
            {
                System.out.println("Wrong pin. try again");
                trial+=1;
                rejected_cards[trial]=card_n;

                if(trial<=5)
                    welcome();
                else
                    System.out.println("you have exeeded your number of attempts.\n Please try in 24 hours again.");
                blank_welcome();
            }
        }

    }

    public void get_zip()
    {
        System.out.println("enter card number");
        card_n=scanner.nextInt();
        String x=scanner.nextLine();
        for(int i=0;i<=4;i++)
        {
            if(card_n==rejected_cards[i])
                blank_welcome();
        }
        System.out.println("your card # is: " +card_n);

        System.out.println("Enter the zip code");

        //System.out.println("1\t2\t3");
        //System.out.println("4\t5\t6");
        //System.out.println("7\t8\t9");
        zip=scanner.nextLine();
        System.out.println("you entered a zip code");

        if(zip == null)
        {
            System.out.println("wrong input!");
            welcome();
        }
        else{
            zip_OK=bank.validate_zip(zip, card_n);
            if(zip_OK)
                return;
            else
            {
                System.out.println("Wrong Zipcode");
                trial+=1;
                if(trial<=5)
                    welcome();
                else
                    System.out.println("you have exeeded your number of attempts.\n Please try in 24 hours again.");
                blank_welcome();

            }
        }
    }

    /*public void check_zip(String zp)
    {

    }*/

    public void display_help_info()
    {
        System.out.println("Enter the gallons you wish to pump");
        n= scanner.nextInt();
        String x=scanner.nextLine();
        System.out.println("Cancel \t Help");
        if(Cancel)
            System.out.println("Logged out");
        if(Help)
            System.out.println("Request for support");

        fuel_type_Selection();
        return;    

    }

    public void fuel_type_Selection()
    {
        System.out.println("Type A $2.8\tType B $3.1\tTypeC $3.3" );
        fuel_type = scanner.nextLine();
        return;
    }

    public void request_receipt()
    {
        System.out.println("Do you want a receipt for this transaction?");
        req_res_str=scanner.nextLine();
        if(req_res_str=="yes")
            req_res=true;
        // if(req_res)
        // {
        // generate_Receipt();
        // }
        return;

    }

    public void display_Instructions()
    {
        System.out.println("place the nozzle ....");
    }

    public void calculate_Price()
    {
        if(fuel_type=="A")
            price=n*cost_per_gallon_1;
        else if(fuel_type=="B")
            price = n*cost_per_gallon_2;
        else if(fuel_type=="C")
            price=n*cost_per_gallon_1;

        if(this.getClass().getName()=="Machine2")
        {
            System.out.println("enetr the car model");
            String car_mod=scanner.nextLine();
            double car_wash=cg.calculate_Tarrif(car_mod);
            price+=car_wash;
        }

        balance_check=bank.check_Balance(price,card_n);
        if(balance_check)
            display_Instructions();
        //wait(1000);   it involves synchronized and thread and all. this must be simpler in processing.
        else
            System.out.println("Sorry you do not have sufficient funds in your account. ");

    }

    public void update_inventory()
    {
        gallons_available-=n;
        return;
    }

    public void generate_Receipt()
    {
        if(req_res)
        {
            System.out.println("Gallons of gas\t" + n);
            System.out.println("Total cost\t" + price);
        }

        if(this.getClass().getName()=="Machine2")
        {
            int code=cg.generate_Code();
        }

        return;
    }

    public void update_Balance()
    {
        people.balance-=price;
        return;
    }

    public void thankyou()
    {
        System.out.println("Thank you, Have a great day!");
    }

}
