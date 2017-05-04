import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RequestReceiptScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RequestReceiptScreen extends Screen
{
    /**
     * Act - do whatever the RequestReceiptScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
     public void execute()
    {
        m.setMessage1("Do you want a receipt?");  
        m.setMessage2("Yes");
        m.setMessage3("No");
        m.setMessage4(" ");
        m.setMessage5(" ");
        
        //if Yes, change message1 to Collect you receipt.
    }
}
