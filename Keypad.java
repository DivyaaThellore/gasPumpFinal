import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keypad extends Actor
{
    Key k1=new Key("1");
    Key k2=new Key("2");
    Key k3=new Key("3");
    Key k4=new Key("4");
    Key k5=new Key("5");
    Key k6=new Key("6");
    Key k7=new Key("7");
    Key k8=new Key("8");
    Key k9=new Key("9");
    Key k0=new Key("0");
    Vector<Key> keys = new Vector<Key>();
    MachineBase machine;
    
    public void keypad()
    {
        getImage().scale(150,150);
        
        //getWorld().addObject(new Screen(),385,340);
        

        //Keypad k=new Keypad();
        //getWorld().addObject(k,400,400);
        //k.act2();

        nozzle n = new nozzle();
        getWorld().addObject(n,880,300);

    }
    
    public void setMachine(MachineBase m)
    {
        machine=m;
    }

    public int getXLeftCorner()
    {
        return (this.getX()- this.getImage().getWidth()/2);
    }

    public int getYLeftCorner()
    {
        return (this.getY()- this.getImage().getHeight()/2);
    }

     
    public void addKeys() 
    {
        /*
        getWorld().addObject(k1,(getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()/6));        
        getWorld().addObject(k2, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()/6));  
        getWorld().addObject(k3, (getXLeftCorner() + this.getImage().getWidth()*5/6),( getYLeftCorner()+this.getImage().getHeight()/6));        
        getWorld().addObject(k4, (getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()*3/6));  
        getWorld().addObject(k5, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()*3/6));          
        getWorld().addObject(k6, (getXLeftCorner() + this.getImage().getWidth()*5/6),( getYLeftCorner()+this.getImage().getHeight()*3/6));
        getWorld().addObject(k7, (getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()*5/6));
        getWorld().addObject(k8, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()*5/6)); 
        getWorld().addObject(k9, (getXLeftCorner() + this.getImage().getWidth()*5/6),( getYLeftCorner()+this.getImage().getHeight()*5/6));
        getWorld().addObject(k0, (getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()*5/6));
        */

       k1.setImage("Images/key1.PNG");
        k2.setImage("Images/key2.PNG");
        k3.setImage("Images/key3.PNG");
        k4.setImage("Images/key4.PNG");
        k5.setImage("Images/key5.PNG");
        k6.setImage("Images/key6.PNG");
        k7.setImage("Images/key7.PNG");
        k8.setImage("Images/key8.PNG");
        k9.setImage("Images/key9.PNG");
        k0.setImage("Images/key0.PNG");
       
       
       getWorld().addObject(k1,(getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()/8));        
        getWorld().addObject(k2, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()/8));  
        getWorld().addObject(k3, (getXLeftCorner() + this.getImage().getWidth()*5/6),( getYLeftCorner()+this.getImage().getHeight()/8));        
        getWorld().addObject(k4, (getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()*3/8));  
        getWorld().addObject(k5, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()*3/8));          
        getWorld().addObject(k6, (getXLeftCorner() + this.getImage().getWidth()*5/6),( getYLeftCorner()+this.getImage().getHeight()*3/8));
        getWorld().addObject(k7, (getXLeftCorner() + this.getImage().getWidth()/6),( getYLeftCorner()+this.getImage().getHeight()*5/8));
        getWorld().addObject(k8, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()*5/8)); 
        getWorld().addObject(k9, (getXLeftCorner() + this.getImage().getWidth()*5/6),( getYLeftCorner()+this.getImage().getHeight()*5/8));
        getWorld().addObject(k0, (getXLeftCorner() + this.getImage().getWidth()*3/6),( getYLeftCorner()+this.getImage().getHeight()*7/8));
        
        keys.add(k1);
        keys.add(k2);
        keys.add(k3);
        keys.add(k4);
        keys.add(k5);
        keys.add(k6);
        keys.add(k7);
        keys.add(k8);
        keys.add(k9);
        keys.add(k0);
        
        k1.setMachine(machine);
        k2.setMachine(machine);
        k3.setMachine(machine);
        k4.setMachine(machine);
        k5.setMachine(machine);
        k6.setMachine(machine);
        k7.setMachine(machine);
        k8.setMachine(machine);
        k9.setMachine(machine);
        k0.setMachine(machine);
        

        for(int i = 0 ; i<keys.size();i++)
        {
            keys.get(i).addMsg();
        }
        
        getWorld().setActOrder(Key.class,Keypad.class);
        getWorld().setPaintOrder(Key.class,Keypad.class); 
    }
    public void act() 
    {
        
    }

}
