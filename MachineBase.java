import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.text.*;
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

    //Button1 b1;
    
    Vector<Screen> screens = new Vector<Screen>();
    int index=0;
    int printCount;
    String pinEntered ="";

    Key key=new Key();
    Keypad keypad=new Keypad();
    Button button = new Button();
    Message message1 = new Message();
    Util util = new Util();
    boolean cardInSlot = false;
    boolean validPin = false;
    
    Message message2=new Message();    
    Message message3 = new Message();     
    Message message4 = new Message();      
    Message message5 = new Message();
    public MachineBase(){
        GreenfootImage image = getImage() ;
        image.scale(550,350 ) ;
    }
    
    public void setMessage1(String s)
    {
        message1.setInstructions(s);
    }
    
    public void setMessage2(String s)
    {
        message2.setInstructions(s);
    }
    public void setMessage3(String s)
    {
        message3.setInstructions(s);
    }
    public void setMessage4(String s)
    {
        message4.setInstructions(s);
    }
    public void setMessage5(String s)
    {
        message5.setInstructions(s);
    }
    
    public void init() //initialising all screens 
    {
        ScreenLogin loginScreen= new ScreenLogin();
        loginScreen.setMachine(this);       
        
        CardSelection cardSel = new CardSelection();
        cardSel.setMachine(this);
        
        DebitCardScreen debitCard = new DebitCardScreen();
        debitCard.setMachine(this);
        
        CreditCardScreen creditCard = new CreditCardScreen();
        creditCard.setMachine(this);
        
        PinScreen pinScreen = new PinScreen();
        pinScreen.setMachine(this);
        
        FuelTypeSelectionScreen fuelType = new FuelTypeSelectionScreen();
        fuelType.setMachine(this);
        
        InstructionsScreen instructionScreen = new InstructionsScreen();
        instructionScreen.setMachine(this);
        
        RequestReceiptScreen receiptScreen = new RequestReceiptScreen();
        receiptScreen.setMachine(this);
        
        ThankYouScreen thankyouScreen = new ThankYouScreen();
        thankyouScreen.setMachine(this);
        
        screens.add(loginScreen);
        screens.add(cardSel);
        screens.add(debitCard);
        screens.add(creditCard);
        screens.add(pinScreen);//skipped
        screens.add(fuelType);//Screen 5
        screens.add(instructionScreen);
        screens.add(receiptScreen);
        screens.add(thankyouScreen); 
        
        
        FuelClass fuelA = new FuelClass();
         fuelA.setMachine(this);
         fuelA.setImage("images/GasolineGrade1.PNG");
             fuelA.getImage().scale(40, 80);
             getWorld().addObject(fuelA, 200,450);
            
            FuelClass fuelB = new FuelClass();
             fuelB.setMachine(this);
                      fuelB.setImage("images/GasolineGrade2.PNG");
                                   fuelB.getImage().scale(40, 80);
            getWorld().addObject(fuelB, 250,450);
            
            FuelClass fuelC = new FuelClass();
             fuelC.setMachine(this);
             fuelC.setImage("images/GasolineGrade3.PNG");
             fuelC.getImage().scale(40, 80);
            getWorld().addObject(fuelC, 300,450);
            

           
           
           

        loginScreen.execute();
    }
    
    public void addChildObjects()
    {
       getWorld().addObject(keypad,500,475);
       keypad.setMachine(this);
       keypad.addKeys();
       
       //getWorld().addObject(button,240,100);
       Button b1=new Button();
        getWorld().addObject(b1, getXLeftCorner()-20,(getYLeftCorner()+b1.getImage().getHeight()+40));
        
        Button b2=new Button();
        getWorld().addObject(b2, getXLeftCorner()-20,(getYLeftCorner()+b1.getImage().getHeight()+110));
        
        Button okButton=new Button();
        getWorld().addObject(okButton, getXLeftCorner()-20,(getYLeftCorner()+b1.getImage().getHeight()+180));
        okButton.setMachine(this);
        okButton.setMessage(1);
        
        Button cancelButton=new Button();
        getWorld().addObject(cancelButton,getXLeftCorner()-20,(getYLeftCorner()+b1.getImage().getHeight()+250));
        cancelButton.setMessage(2);

        Button b5=new Button();
        getWorld().addObject(b5,getXLeftCorner()+570,(getYLeftCorner()+b1.getImage().getHeight()+40));
        
        Button b6=new Button();
        getWorld().addObject(b6, getXLeftCorner()+570,(getYLeftCorner()+b1.getImage().getHeight()+110));
        
        Button debitScreen=new Button();
        getWorld().addObject(debitScreen, getXLeftCorner()+570,(getYLeftCorner()+b1.getImage().getHeight()+180));
        debitScreen.setMachine(this);
        debitScreen.setMessage(3);
        
        Button creditScreen=new Button();
        getWorld().addObject(creditScreen,getXLeftCorner()+570,(getYLeftCorner()+b1.getImage().getHeight()+250));
        creditScreen.setMachine(this);
        creditScreen.setMessage(4);
      
         message1.setTextBox(400, 50);
         setMessage1("WELCOME");
         //message1.setInstructions("WELCOME");     
        getWorld().addObject(message1,getX(),  getY()-getImage().getHeight()/2+60);
        
        message2.setTextBox(100,50);
        setMessage2("WELCOME");
       // message2.setInstructions("TEST");
         getWorld().addObject(message2,getX()-getImage().getWidth()/2 +90, getY()+58);
         
               message3.setTextBox(100,50);
          setMessage3("WELCOME");  
        //message3.setInstructions("TEST");
         getWorld().addObject(message3,getX()-getImage().getWidth()/2 + 460, getY()+58);
         
               message4.setTextBox(100,50);
             setMessage4("WELCOME");
              // message4.setInstructions("TEST");
         getWorld().addObject(message4,getX()-getImage().getWidth()/2 +90, getY()+125);
        
               message5.setTextBox(100,50);
       setMessage5("WELCOME");
              // message5.setInstructions("TEST");
         getWorld().addObject(message5,getX()-getImage().getWidth()/2 + 460, getY()+125);
         
        nozzle nozzle = new nozzle();
        nozzle.setMachine(this);
        getWorld().addObject(nozzle, 800,500);
        
        CardSlot cs = new CardSlot();
        cs.setMachine(this);
        getWorld().addObject(cs, 890, 100);
        
        Card c1 = new Card();
        getWorld().addObject(c1, 890, 180);
        
        Card c2 = new Card();
        getWorld().addObject(c2, 890, 260);

        
        Card c3 = new Card();
        getWorld().addObject(c3, 890, 340);

        
       //create n screens and add to vector
    
    }
    
    public void Fuelling(float elapsedTime)
    {
        //index
        if(index==7)
        {
            DecimalFormat df= new DecimalFormat("0.00");
            elapsedTimeFinal = elapsedTime;
            setMessage1("Pumping gas..."+             df.format(elapsedTime/30000) +" Gallons");
            setMessage2("Done");
        }
    }
    
    public void notFuelling(float elapsedTime)
    {
        //index
        if(index==6)
        {
            DecimalFormat df= new DecimalFormat("0.00");
            //df.format(elapsedTime);
            setMessage1("Total Fuelled: "+ df.format(elapsedTime) +" Gallons");
        }
    }
    
    public int getXLeftCorner()
    {
        return (this.getX()- this.getImage().getWidth()/2);
    }

    public int getYLeftCorner()
    {
        return (this.getY()- this.getImage().getHeight()/2);
    }
    
    public void okPressed()
    {
        //Key key = new Key();
        //
        if(index==0)
        {
            //
            //validation 
            // return
            //
            index++;
            screens.get(index).execute();
            
            return;
        }
        
        else if(index==1)
        {
            //
            //
            //
            //don`t keep index here. hence if the user presses ok , nothing will happen.
            
            screens.get(index).execute();
        }
        
          
        else if(index==2)
        {
            //debit card logic
            //
            //
            if(validPin && cardInSlot)
            {
            
            
            //debit card screen needs to go past credit card screen, hence increment by 2.
            index++;
            index++;
            screens.get(index).execute();
        }
            //key.execute();
        }
        
        else if(index==3) // credit card
        {
            if(validPin && cardInSlot)
            {
            index++;
            screens.get(index).execute();
        }
            //key.execute();
        }
        
        else if(index==5) // fuel selection screen
        {
            
            
            screens.get(index).execute();

        }
        
        else if(index==6)
        {
            
            screens.get(index).execute();
            index++;
        }
        else if(index==7)
        {
            screens.get(index).execute();
            index++;
        }
        else if(index==8)
        {
            printReceipt();
            screens.get(index).execute();
            
        }
        
        //screens
    }
    
    public float elapsedTimeFinal;
    public void printReceipt()
    {
        Message receipt = new Message()
        {

    
            public void  act()
            {
                if(Greenfoot.mouseClicked(this))
                {
                    getWorld().removeObject(this);
                }
            }
            
                  public void setInstructions(String msg)
    {  
        gi = new GreenfootImage(300,200);
        setImage(gi);
        gi.clear();
        gi.setColor(greenfoot.Color.BLUE);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,50,20);

               
        
    }

        }

  
;
        receipt.setInstructions("Receipt Generated \n" + "Total Gallons : "+(elapsedTimeFinal/30000) +  "\n" + "Total Price : "+ (elapsedTimeFinal/30000)*2.8  );
      //  receipt.getImage().scale(250, 100);

        getWorld().addObject(receipt, 300, 300);
        getWorld().setPaintOrder(receipt.getClass(),Key.class);
    }

    public void setCard()
    {
        if(index==2)
        {
            setMessage1("Card Received, Enter Pin");
            cardInSlot=true;
            setMessage2("Next");
        }
    }
    
    
    public void creditCardPressed()
    {
      if(index==1)
      {
        index=3;
        screens.get(index).execute();
        //show the creditCardScreen
      }
    }
    
    public void debitCardPressed()
    {
        if(index==1)
        {
        index=2;
        screens.get(index).execute();
        //show debitCardScreen index=
     }
    }
    
    public void getPinScreen()
    {
        if(index==2 || index==3)
        {
            index=5;
            screens.get(index).execute();
            key.execute();
        }
    }
   
    public void fuelType()
    {
        index=4;
    }
    
    public void showKeypad()
    {
        
    }
    public void hideKeypad()
    {
        
    }
    
    public void function()
    {
    }

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
            setMessage1("Welcome \n Please insert card");
             //message1.setInstructions("Welcome \n Please insert card");
            //System.out.println("Welcome \n Please insert card");

            if(card_in_slot)
            {
                
                setMessage1("Debit card or Credit card");
                //System.out.println("Debit card or Credit card");
                setMessage2("Debit card?");
                setMessage3("credit card?");
               
                
                String card="123";
                
                if(card=="Debit card"){
                    debit_card=true;
                    credit_card=false;
                }
                // if credit card button pressed. 
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
    String fuelGrade;
    public void setFuelGrade(String value)
    {
        fuelGrade=value;
        
        if(index==5)
        {
            index=6;
            okPressed();
        }
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
    public void printNumber(String value)
    {
       
        String drawString="";
        
        
        if(index==2 && cardInSlot==true)//debit screen
        {
            
             printCount++;
             pinEntered=pinEntered+value;
             for(int i=0; i<printCount;i++)
             {
                 drawString=drawString +"*";
             }
        
             setMessage1(drawString);
        
             if(printCount==4)
             {
                 validPin = util.validateDebitCard(pinEntered);
                 pinEntered="";
                 printCount=0;
                 if (validPin == true)
                 {
                     index=5;// to skip PinScreen class.
                     okPressed();
                 }
                 else
                 {
                     setMessage1("Invalid Pin");
                     Greenfoot.delay(5);
                     index=1;
                 }
             }
   
        }
        
        else if( index==3 && cardInSlot==true)// credit screen
        {
             printCount++;
         pinEntered=pinEntered+value;
        for(int i=0; i<printCount;i++)
        {
            drawString=drawString +"*";
        }
        
        setMessage1(drawString);
        
        if(printCount==5)
        {
            validPin=util.validateCreditCard(pinEntered);
            pinEntered="";
            printCount=0;
            if (validPin == true)
            {
                index=5;
                //index++;
                screens.get(index).execute();
            }
            else
            {
                setMessage1("Invalid Zip");
                Greenfoot.delay(5);
                index=1;
            }
        }
        
    }
    }
} 
    