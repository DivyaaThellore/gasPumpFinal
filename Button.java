import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    //MachineBase machine = new MachineBase();
    Message m=new Message();
    
    int msg = 0;
    
    public void act()
    {
    }
    
    public void buttonPressed(int messageNum) 
    {
        msg = messageNum;
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) 
        {
            if(msg==1)
            {
                //ok. go to next screen
                //machine.okPressed();
            }
            else if(msg==2)
            {
                //cancel. dont do anything
            }
            else if(msg==3)
            {
                //debit card selection. do debitCard functions
            }
            else if(msg==4)
            {
                //credit card selection. do creditCard functions
            }
            else
            {
                //do nothing
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
        //machine=mb;
    }
    
    public Button()
    {
        GreenfootImage image = getImage() ;
        image.scale(50, 50) ;
    }
}
