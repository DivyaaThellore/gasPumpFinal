import greenfoot.*;
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelClass extends Actor
{
    MouseInfo mouse = Greenfoot.getMouseInfo();

    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage gi = new GreenfootImage(20,20); 
    MachineBase machine = new MachineBase();
    String value="A";
    
    public void setValue(String val)
    {
        value=val;
    }
    
    public FuelClass(String text) {
        
       
        //setTexts(text);
          gi.setColor(greenfoot.Color.BLACK);
          gi.drawString(text,0,25);
         setImage(gi);
        //((MyWorld) getWorld()).text().update("Welcome");
    }
    
    public FuelClass(){
    }
    
    public void initTexts()
   
   {
      
       
    }
    
    public void setTexts(String msg)
    {
        gi.clear();
        gi.setColor(greenfoot.Color.YELLOW);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,0,25);
    }
    
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            machine.setFuelGrade(value);
           
        }
        
    }   
    
    public void setMachine(MachineBase m)
    {
        machine=m;
       
    }
    
}


