import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Util here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Util extends Actor
{

    //test commit code
    /**
     * Act - do whatever the Util wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    
    
    MachineBase machineBase;

    public void  setMessage1(String s)
    {
        machineBase.setMessage1(s);
    }
    
    public boolean validateDebitCard(String pinEntered)
    {
        //valaidate debit card pin
        System.out.println(pinEntered);
            if(pinEntered.equalsIgnoreCase("5236") || pinEntered.equalsIgnoreCase("3598") || pinEntered.equalsIgnoreCase("5698"))
            {
                return true;
            }
            else
            {
                return false;
            }
       
    }
    
    public boolean validateCreditCard(String pinEntered)
    {
        if(pinEntered.equalsIgnoreCase("52365") || pinEntered.equalsIgnoreCase("35987") || pinEntered.equalsIgnoreCase("56987"))
            {
                return true;
            }
            else
            {
                return false;
            }
    }

}
