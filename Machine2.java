import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Machine2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Machine2 extends MachineBase
{
    /**
     * Act - do whatever the Machine2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       // ((MyWorld) getWorld()).text().update("Instructions Screen");
        //GreenfootImage img=getImage();
        
    }    
    
    public Machine2(){
      super();
    }
    
    public void function()
  {
       //((MyWorld) getWorld()).text().update("This is Scenario - 2");
       Greenfoot.delay(30);
       //((MyWorld) getWorld()).text().update("Please follow the instructions");
        System.out.println("This is Scenario - 2 \" Request Receipt at th end\"");
        welcome();
        int count=0;
        if (card_in_slot == true){
            if(count==0)
            {
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
