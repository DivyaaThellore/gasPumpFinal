import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button3 extends Actor
{
    public Machine3 machine3 = new Machine3();
    /**
     * Act - do whatever the button3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
           getWorld().removeObjects(getWorld().getObjects(MachineBase.class));
           // ((MyWorld) getWorld()).text().update("Welcome");
            getWorld().addObject(machine3, 278,171);
            Greenfoot.delay(30);
            machine3.function();
        }
    }   
    
    public Button3() {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;
        //((MyWorld) getWorld()).text().update("Welcome");
    }
}
