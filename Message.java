import greenfoot.*; 
import greenfoot.Color;




public class Message extends Actor
{
     GreenfootImage gi;
     String valueMsg="*";
    public Message()
    {
        gi=new GreenfootImage(400,50);
        setImage(gi);
    }
    
    
    
 public void setInstructions(String msg)
    {   gi.clear();
        gi.setColor(greenfoot.Color.YELLOW);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,0,25);
               
        
    }
    
    public void setKeyText(String msg)
    {   gi.clear();
        gi.setColor(greenfoot.Color.YELLOW);
        
        //gi.fill();
        
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,this.getImage().getWidth()/2,this.getImage().getHeight()/2);
        valueMsg=msg;
        
        
    }
    
    public String getKeyText()
    {
        return valueMsg;
    }
    
      public void setTextBox(int x , int y)
    {  
        gi=new GreenfootImage(x,y);
        setImage(gi);
        gi.setColor(greenfoot.Color.YELLOW);
 
        
    }
    
   
    
    
   public void setMessage(String msg, int x, int y)
   {
       gi.clear();
        gi.setColor(greenfoot.Color.YELLOW);
        gi.fill();
        
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,x,y);
    }
    
    
    


}
