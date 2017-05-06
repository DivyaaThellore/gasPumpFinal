import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    MachineBase machine ;
    Message m=new Message();
    
    int msg = 0;
    
   
    
    public void act()
    {
       
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) 
        {
            System.out.println("button pressed called");
            if(msg==1)
            {
                //ok. go to next screen
                machine.okPressed();
            }
            else if(msg==2)
            {
                //cancel. dont do anything
                
            } 
            else if(msg==3)
            {
                machine.debitCardPressed();
            }
            else if(msg==4)
            {
                machine.creditCardPressed();
            }
            else if(msg==5)
            {
                machine.getPinScreen();
            }
            
            m.setKeyText("*");
        }
        
    }    
    
    
    public void setMessage(int i)
    {
        msg = i;
    }
    
    public void setMachine(MachineBase mb)
    {
        machine=mb;
    }
    
    public Button()
    {
        GreenfootImage image = getImage() ;
        image.scale(50, 50) ;
    }
}
