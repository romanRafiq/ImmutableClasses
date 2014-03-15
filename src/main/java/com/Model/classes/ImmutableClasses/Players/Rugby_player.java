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
public final class Rugby_player extends Person{

    private String  division;
    private int age_group;
    private String position;
    
    //Constructed
    public Rugby_player(String idNumber, String name, String surname, Date DoB,String  division,int age_group,String position) {
        
        super(idNumber, name, surname, DoB);
        this.division = division;
        this.age_group = age_group;
        this.position =  position;
    }
    
    
     public Rugby_player updateDivision(String newDivision) {
        return new Rugby_player( super.getID(),super.getName(),super.getSurname(),super.getDOB(), newDivision,age_group, position);
    }
     
     public Rugby_player updateAgeGroup(int newAgeGroup) {
        return new Rugby_player( super.getID(),super.getName(),super.getSurname(),super.getDOB(), division,newAgeGroup, position);
    }
     
     public Rugby_player updatePosition(String newPosition) {
        return new Rugby_player( super.getID(),super.getName(),super.getSurname(),super.getDOB(), division,age_group, newPosition);
    }
     
        
    
    public String getDivision()
    {
        return division;
    }
    public int getAgeGroup()
    {
        return age_group;
    }
    public String getPosition()
    {
        return position;
    }
    
     @Override
    public String toString()
    {
        return (super.toString()+" "+division+" "+age_group+" "+position);
    }
    
    
}
