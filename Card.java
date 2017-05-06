import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
   int index;
   MachineBase m = new MachineBase();
   
    public void act() 
    {
         int mouseX, mouseY ;        
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY); 
        }
        
        CardSlot slot=(CardSlot)getOneIntersectingObject(CardSlot.class);
        if(slot!=null && Greenfoot.mouseClicked(this))
         { 
             
             m.setMessage1(" ");
             m.setMessage1("Card Swiped");
             
             System.out.println("Card Swiped");

             index=5;
             Greenfoot.delay(50);
             return;
        } 
    }

    
    /*public void swiped()
    {
        CardSlot slot=(CardSlot)getOneIntersectingObject(CardSlot.class);
        if(slot!=null || Greenfoot.mouseClicked(this))
         {  
         
      System.out.println("Card Swiped");
      m.setMessage1("Card Swiped");
        //gb.act();
        Greenfoot.delay(50);
        return;
    }
    }*/
 
}

