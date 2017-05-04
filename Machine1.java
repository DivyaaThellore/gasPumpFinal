import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Machine1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Machine1 extends MachineBase
{
    /**
     * Act - do whatever the Machine1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Machine1(){
        super();
    }
    
    public void act(){
        
      //  ((MyWorld) getWorld()).text().update("Instructions Screen");
        
    }
    
    public void function() 
    {
        int count=0;
        // Add your action code here.
        //MachineBase MachineBase = new MachineBase();
       //((MyWorld) getWorld()).addObject(new Machine1(),367,237);
       //((MyWorld) getWorld()).text().update("This is Scenario - 1");
       //Greenfoot.delay(30);
        //((MyWorld) getWorld()).text().update("Please follow the instructions");
       // Greenfoot.delay(30);
        System.out.println("This is Scenario - 1 \" Request Receipt at the end\"");
        welcome();
        if (card_in_slot == true){
        if(count==0){
        display_help_info();
        //m.fuel_type_Selection();  
        display_Instructions();
        calculate_Price();
        update_Balance();
        update_inventory();
        request_receipt();
        generate_Receipt();
        thankyou();
        count++;
    }
    }
    else{ 
         if(count==0){
             thankyou();
             count++;
            }
    }
    //getWorld().removeObjects(getWorld().getObjects(Machine1.class));
    //getWorld().addObject(MachineBase, 278,171);
    }    
}
