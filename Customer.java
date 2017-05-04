import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer extends Actor
{
    MouseInfo mouse = Greenfoot.getMouseInfo();
     
    /**
     * Act - do whatever the Customer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    if (this.getX()<getWorld().getWidth()/2*getWorld().getCellSize()) 
    {
            
            move(4);
        
    } 
   
}
    public Customer(){
       GreenfootImage image = getImage() ;
        image.scale(100, 150 ) ;
    }
}
