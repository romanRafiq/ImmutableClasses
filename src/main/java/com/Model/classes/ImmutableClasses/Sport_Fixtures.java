/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses;

import java.util.Date;

/**
 *
 * @author Roman
 */
public final class Sport_Fixtures {
    
    //Variables
    private Date date;
    private String division;
    private int age_group;
    private String opponents;
    private String status;
    private String sportType;            
    
    public Sport_Fixtures(Date date,String division,int age_group,String opponents,String status,String sportType)            
    {
        this.date = date;
        this.division = division;
        this.age_group = age_group;
        this.opponents = opponents;
        this.status = status;
        this.sportType = sportType;
    }
    
    
     public Sport_Fixtures updateDate(Date NewDate)            
    {
       return new Sport_Fixtures(NewDate,division,age_group,opponents,status,sportType);
    }
    
     public Sport_Fixtures updateStatus(String newStatus)            
    {
       return new Sport_Fixtures(date,division,age_group,opponents,newStatus,sportType);
    }
    
    
    public Date getDate()
    {
        return date;
    }
   
    public String getDivision()
    {
        return division;
    }
    
    public int getAgeGroup()
    {
        return age_group;
    }
    
    public String getOpponents()
    {
        return opponents;
    }
    
     public String getStatus()
    {
        return status;
    }
     
      public String getSportType()
    {
        return sportType;
    }
      
      @Override
      public String toString()
      {
          return date+"  "+division+"  "+age_group+"  "+opponents+"  "+status+"  "+sportType;
      }
      
}
