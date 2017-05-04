import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    Message m=new Message();
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) 
        {
            m.setKeyText("*");
        }
    }    
    
    public Button() {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;
    }
}
