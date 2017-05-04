import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Screen extends Actor
{
  
    MachineBase m;
    
    public void act() 
    {
       
                
    }    
    
    public void setMachine(MachineBase mIn)
    {
        m=mIn;
    }
    
   public abstract void execute();
}