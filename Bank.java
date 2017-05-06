import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank extends Actor
{
    /**
     * Act - do whatever the Bank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    People people[] = new People[3] ;
  
  private static Bank bank;
  
  private Bank()
  {
    /*for (int i=0;i<=2;i++)
    {
      people[i].name=set_name(i);
      people[i].zip=set_zip(i);
      people[i].balance=set_balance(i);
      people[i].card_number=set_set_cardno(i);
    }*/
    
    
    for (int i =0 ; i< 3 ; i++)
    {
      people[i] = new People();
    }
    
      
    people[0].name="Jean";
    people[0].zip="52365";
    people[0].pin="5236";
    people[0].balance=123.00;
     people[0].credit_limit=0;
    people[0].card_type="debit";
    people[0].card_number=123445677;
    
    people[1].name="Alizee";
    people[1].zip="35987";
    people[1].pin="3598";
    people[1].balance=0.00;
    people[1].credit_limit=3000;
    people[1].card_type="credit";
    people[1].card_number=125789648;
    
    people[2].name="Adi";
    people[2].zip="56987";
    people[2].pin="5698";
    people[2].credit_limit=0.00;
    people[2].card_type="debit";
    people[2].balance=14.00;
    people[2].card_number=759642318;
    
    
    
        
  }
    

  
  public boolean validate_zip(String z,int card_num)
  {
    //People p= get_Person(z);
    
    /*if(card_num==people.get_CardNo(people))
      return true;
    else 
      return false;*/
    for(int i=0;i<=2;i++)
    {
      if(card_num==people[i].card_number && z==people[i].zip)
        return true;
      else
        return false;
    }
    //return false;
    return false;
  }
  public boolean validate_pin(String z,int card_num)
  {
    //People p= get_Person(z);
    
    /*if(card_num==people.get_CardNo(people))
      return true;
    else 
      return false;*/
    for(int i=0;i<=2;i++)
    {
      if(card_num==people[i].card_number && z==people[i].pin)
        return true;
      else
        return false;
    }
    //return false;
    return false;
  }
  
  
  public boolean check_Balance(double pr,int card)
  {
    for(int i=0;i<=2;i++){
      
      if(card==people[i].card_number)
      {
        if(pr>people[i].balance)
          return false;
        else 
          return true;
      }
      
      else
        return false;
    }
    return false;
  
  
  }
  
   public boolean check_Credit(double pr,int card)
  {
     for(int i=0;i<=2;i++){
      
      if(card==people[i].card_number)
      {
        if(pr>people[i].credit_limit)
          return false;
        else 
          return true;
      }
      
      else
        return false;
    }
    return false;
  
  
  }
  
  
  
  public static Bank getBank()
  {
      if(bank == null){
              bank = new Bank();
          }
          return bank;

    
  }
}
