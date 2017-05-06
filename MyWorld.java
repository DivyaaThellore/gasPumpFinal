import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public GasPump gasPump1;

    //private MessagePop messagepop;
    public Machine1 machine1 = new Machine1();
    private Customer customer = new Customer();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
       
        prepare();
    }

     
    private void prepare()
    {

        MachineBase machine1 = new Machine1();
        MachineBase machine2 = new Machine2();
        MachineBase machine3 = new Machine3();

        gasPump1 = new GasPump();
        addObject(gasPump1, 367, 237);
        gasPump1.setLocation(200,288);
        gasPump1.setMachine(machine1);

        GasPump gasPump2 = new GasPump();
        addObject(gasPump2, 367, 237);
        gasPump2.setLocation(440,288);
        gasPump2.setMachine(machine2);

        GasPump gasPump3 = new GasPump();
        addObject(gasPump3, 367, 237);
        gasPump3.setLocation(675,288);
        gasPump3.setMachine(machine3);

        addObject(customer,50,500);
        //customer.setLocation

        //Greenfoot.playSound("beep.wav");

    }

   
}
