import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardSlot extends Actor
{
    MachineBase machine=null;
    /**
     * Act - do whatever the CardSlot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Card intersectingCard =(Card)getOneObjectAtOffset(10, 10,Card.class);
        
        if(intersectingCard !=null)
        {
            machine.setCard();

            intersectingCard.setLocation(890, 200);

        }
        
    }  
    
    public void  setMachine(MachineBase m)
    {
        machine = m;
    }
    
    
    
}
