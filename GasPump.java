import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPump extends Actor
{

    MachineBase machine = new MachineBase();
    
    /**
     * Act - do whatever the GasPump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.



        //associate every gasPump with a machine
        if(Greenfoot.mouseClicked(this))
        {
            //getWorld().addObject(machine, 278,171);orl
            
         //MachineBase m=new MachineBase();
          
         
         getWorld().addObject(machine,500,180);
         
         machine.addChildObjects();
         machine.init();
        
         
         
         
         getWorld().removeObjects(getWorld().getObjects(Customer.class));
         getWorld().removeObjects(getWorld().getObjects(GasPump.class));
         

            //Button1 b1 = new Button1("hi"());
            //getWorld().addObject(b1,100, 100);

            //Keypad key = ;
            

        
        }
    }    

    public GasPump() {
        GreenfootImage image = getImage() ;
        image.scale( 250, 200 ) ;
    }

    public void
    setMachine(MachineBase m)
    {
        machine = m;
    }
    
}
