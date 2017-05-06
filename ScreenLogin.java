import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenLogin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenLogin extends Screen
{
    /**
     * Act - do whatever the ScreenLogin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void execute()
    
    {
        m.setMessage1("Welcome! Click Next to proceed.");
        m.setMessage2("Next");
        m.setMessage3(" ");
        m.setMessage4(" ");
        m.setMessage5(" ");
        return;
    }
    
    
    public boolean isValid()
    {
        return true;
    }
}
