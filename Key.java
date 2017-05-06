import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    Message m=new Message();
    int x,y;
    MachineBase machine;
    GreenfootImage gi;
    String value;
    


    public Key()
    {
        gi=new GreenfootImage(400,400);

        setImage(gi);
    }
    
    public Key(String s)
    {
//        x=this.getX();
  //      y=this.getY();
       value=s;
    //    valueOfKey = Integer.getInteger(s);
        m.setKeyText(s); 
                
    }
    
    public void setText(String s)
    {
      
        m.setKeyText(s); 
    }
    
    
    
    public void addMsg()
    {
        getWorld().addObject(m, this.getX(),this.getY());
    }
    
    public void act(){
    

     if(Greenfoot.mouseClicked(this))
        {
           
            execute();
        }
        
    
    }
    public void setMachine(MachineBase m)
    {
        

    machine = m;
    }
    
    public void execute() 
    {
        //
      
       machine.printNumber(value);
          
           
        
    }    
}
