import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class CodeGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodeGenerator extends Actor
{
    /**
     * Act - do whatever the CodeGenerator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    int code;
  //String car_model;
  Random rand=new Random();
  
  public int generate_Code()
  {
    for (int i=0;i<=4;i++)
    code=rand.nextInt();
    return code;
  }

  public double calculate_Tarrif(String car_mode)
  {
    if(car_mode=="small")
      return 20.00;
    else if(car_mode=="medium")
      return 25.00;
    else
      return 30.00;
  }
}
