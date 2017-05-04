import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class nozzle extends Actor
{
   public boolean nozzle_check=false;
     Message m=new Message();
    public void setMessage(String msg)
           {
             
               World world=getWorld();
                world.addObject(m,480,50);
                m.setInstructions(msg);
              
            }
            
            
    public void act() 
    {
        
         if(Greenfoot.mousePressed(this))
        {
            setMessage("this is a test");
            if(nozzle_check==false)
            {
              nozzle_check=true;  
            }
        }
        
          
         
       
    }    
}
