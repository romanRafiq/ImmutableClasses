/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Players;

import com.Model.classes.ImmutableClasses.Person;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Roman
 */
public final class Soccer_player extends Person{

    //variables
    private String division;
    private int age_group;
    private String position;
    private String preferred_Foot;
    
    
    public Soccer_player(String idNumber, String name, String surname, Date DoB, String division,int age_group,String position,String preferred_Foot)
        {
        super(idNumber, name, surname, DoB);
        
        this.division = division;
        this.age_group = age_group;
        this.position =  position;
        this.preferred_Foot = preferred_Foot;
    }
    
    
     public Soccer_player updateDivision(String newDivision)
     {                   
         return new Soccer_player(super.getID(),super.getName(),super.getSurname(),super.getDOB(), newDivision, age_group, position, preferred_Foot);
     }
     
      public Soccer_player updateAgeGroup(int newAgeGroup)
     {                   
         return new Soccer_player(super.getID(),super.getName(),super.getSurname(),super.getDOB(), division, newAgeGroup, position, preferred_Foot);
     }
     
      public Soccer_player updatePosition(String newPosition)
     {                   
         return new Soccer_player(super.getID(),super.getName(),super.getSurname(),super.getDOB(), division, age_group, newPosition, preferred_Foot);
     }
      
    @Override
       public Soccer_player updateSurname(String newSurname)
     {                   
         return new Soccer_player(super.getID(),super.getName(),newSurname,super.getDOB(), division, age_group, position, preferred_Foot);
     }
      
      
    public String getDivision()
    {
        return division;
    }
     
    public int getAgeGroup()
    {
        return age_group;
    }
     
    public String getPostion()
    {
        return position;
    }
    
         public String getFoot()
    {
        return preferred_Foot;
    }
         
    @Override
    public String toString()
    {        
        return (super.toString()+" "+division+" "+age_group+" "+position+" "+preferred_Foot);
    }
}
