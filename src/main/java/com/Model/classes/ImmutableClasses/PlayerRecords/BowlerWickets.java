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
public final class BowlerWickets implements playersInterface{
     private String name;
     private String surname;
     private int games_played;
    
    private int wickets;
    
    
     public BowlerWickets(String name,String surname,int games_played,int wickets)
    {
         this.name = name;
         this.surname = surname;
         this.games_played = games_played;
         this.wickets = wickets;
    }
    
     public BowlerWickets updateGamesPlayed(int newGames)
     {
         return new BowlerWickets( name, surname, newGames, wickets);
     }
     
     public BowlerWickets updateWickets(int newWickets)
     {
         return new BowlerWickets( name, surname, games_played, newWickets);
     }

     
     
     public int getWickets()
     {
         return wickets;
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
        return (name+" "+surname+"  Wickets: "+wickets+" Games: "+games_played);
    }
}
