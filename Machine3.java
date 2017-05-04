import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Machine3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Machine3 extends MachineBase
{

    /**
     * Act - do whatever the Machine3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Instructions instruction = new Instructions();
        //instruction.update("Instructions Screen");
       // ((MyWorld) getWorld()).text().update("Instructions Screen");
    }   
    
    public Machine3(){
       super();
    }
    public void function()
    {
       int count=0;
       //((MyWorld) getWorld()).text().update("This is Scenario - 3");
       Greenfoot.delay(30);
       //((MyWorld) getWorld()).text().update("Please follow the instructions");

        System.out.println("This is Scenario - 3 \" Request Receipt at th end\"");
        welcome();
        if (card_in_slot == true){
            if(count==0){
                request_receipt();
                display_help_info();
                display_Instructions();
                calculate_Price();
                update_Balance();
                update_inventory();   
                generate_Receipt();
                thankyou();
           }  
        }
         else{ 
             if(count==0){
                 thankyou();
                 count++;
            }
        }
    }
}
