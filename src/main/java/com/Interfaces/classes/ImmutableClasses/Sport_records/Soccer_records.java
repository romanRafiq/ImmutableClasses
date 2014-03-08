/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Interfaces.classes.ImmutableClasses.Sport_records;

import com.Interfaces.Sport_Records;

/**
 *
 * @author Roman
 */
public final class Soccer_records implements Sport_Records{

    //Varaibles
    private String division;
    private String ageGroup;
    private int wins;
    private int loses;
    private int draws;
            
    
     public Soccer_records(String division,String ageGroup,int wins,int loses,int draws)            
    {        
      this.division = division;
      this.ageGroup = ageGroup;
      this.wins = wins;
      this.loses = loses;
      this.draws = draws;      
    }
     
     //Updates--this doesnt update the variable but it returns a new object
     public Soccer_records updateWins(int newWins)
     {
         return new Soccer_records(division,ageGroup,newWins/*new value*/,loses,draws);
     }
     
      public Soccer_records updateLoses(int newLoses)
     {
         return new Soccer_records(division,ageGroup,wins,newLoses,draws);
     }
    
       public Soccer_records updateDraws(int newDraw)
     {
         return new Soccer_records(division,ageGroup,wins,loses,newDraw);
     }
    
    
    
    
    //Immutable
    @Override        
    public String getDivision() {
        return division;
    }

    @Override
    public String getAgeGroup() {
        return ageGroup;
    }
    @Override
    public int getWins() {
        return wins;
    }
    @Override
    public int getLoses() {
        return loses;
    }
    @Override
    public int getDraws() {
        return draws;
    }
    @Override
    public String toString()
    {
        return ageGroup+" "+division+" "+wins+" "+loses+" "+draws;
    }
    
}
