/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.PlayerRecords;

import com.Model.Interfaces.playersInterface;

/**
 *
 * @author Roman
 */
public final class goal_Scorers implements playersInterface{

    //Variables
    private String name;
    private String surname;
    private int games_played;
    
    private int goals;
    
    
    public goal_Scorers(String name,String surname,int games_played,int goals)
    {
         this.name = name;
         this.surname = surname;
         this.games_played = games_played;
         this.goals = goals;
    }
    
     public goal_Scorers updateGamesPlayed(int newGames)
     {
         return new goal_Scorers( name, surname, newGames, goals);
     }
     
     public goal_Scorers updateGoals(int newGoals)
     {
         return new goal_Scorers( name, surname, games_played, newGoals);
     }
    
    
    
    public int getGoals()
    {
        return goals;
    }
    
    public String getName() {
       return name;
    }

    public String getSurname() {
       return surname;
    }

    public int getaGamesPlayed() {
        return games_played;
    } 
    
    @Override
    public String toString()
    {
        return (name+" "+surname+"  Goals: "+goals+" Games: "+games_played);
    }
    
}
