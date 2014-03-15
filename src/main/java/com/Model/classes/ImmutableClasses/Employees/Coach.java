/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Employees;

import com.Model.classes.ImmutableClasses.Person;
import java.util.Date;

/**
 *
 * @author Roman
 */
public final class Coach extends Person{
    //variables
    private String sport;
    private String division;
    private int age_group;
    
    public Coach(String idNumber, String name, String surname, Date DoB,String sport, String division,int age_group) {
        super(idNumber, name, surname, DoB);
        
        this.sport = sport;
        this.division = division; 
        this.age_group = age_group;
    }
    
    public Coach updateSport(String newSport)
    {
        return new Coach(super.getID(),super.getName(),super.getSurname(),super.getDOB(),newSport,division,age_group);
    }
    
     public Coach updateDivision(String newDivision)
    {
        return new Coach(super.getID(),super.getName(),super.getSurname(),super.getDOB(),sport,newDivision,age_group);
    }
        
      public Coach updateAgeGroup(int newAgeGroup)
    {
        return new Coach(super.getID(),super.getName(),super.getSurname(),super.getDOB(),sport,division,newAgeGroup);
    }
     
     
    public String getSport()
    {
        return sport;
    }
            
     public String getDivision()
    {
        return division;
    }
     public int getAgeGroup()
     {
         return age_group;                 
     }
     
       @Override
    public String toString()
    {
        return (super.toString()+" "+division+" "+sport+" ");
    }
    
    
}
