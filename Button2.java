import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button2 extends Actor
{
    public Machine2 machine2 = new Machine2();
    /**
     * Act - do whatever the Button2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObjects(getWorld().getObjects(MachineBase.class));
         //   ((MyWorld) getWorld()).text().update("Welcome");
            getWorld().addObject(machine2, 278,171);
            Greenfoot.delay(30);
            machine2.function();
        }
    }    
    
    public Button2() {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;
        //((MyWorld) getWorld()).text().update("Welcome");
    }
}
