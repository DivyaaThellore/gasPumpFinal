import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MessagePop extends Actor
{
  
    public MessagePop() 
    {
        // Add your action code here.
        setImage(new GreenfootImage(200,100));
    }    
    
    public void update(String text)
    {
        GreenfootImage img=getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.drawString(text,5,10);
    }
}
