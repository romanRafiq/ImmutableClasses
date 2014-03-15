/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Players;

import com.Model.classes.ImmutableClasses.Person;
import java.util.Date;

/**
 *
 * @author Roman
 */
public final class Cricket_player extends Person{
    private String division;
    private int age_group;
    private String handed;
    
    public Cricket_player(String idNumber, String name, String surname, Date DoB,String division,int age_group,String handed) {
        super(idNumber, name, surname, DoB);
        
    this.division = division;
    this.age_group = age_group;
    this.handed = handed;        
    }
    
    
     public Cricket_player updateDivision(String newDivision) {
         
         return new Cricket_player(super.getID(), super.getName(),super.getSurname(),super.getDOB(), newDivision, age_group, handed);         
     }
    
     public Cricket_player updateAgeGroup(int newAgeGroup) {
         
         return new Cricket_player(super.getID(), super.getName(),super.getSurname(),super.getDOB(), division, newAgeGroup, handed);         
     }
    
    
     public String getDivision()
    {
        return division;
    }
     
    public int getAgeGroup()
    {
        return age_group;
    }
    
    public String getHanded()
    {
        return handed;
    }
    
     @Override
    public String toString()
    {
        return (super.toString()+" "+division+" "+age_group+" "+handed);
    }
    
}
