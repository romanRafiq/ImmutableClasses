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
public final class Try_Scorers implements playersInterface{

    //Variables
    private String name;
    private String surname;
    private int games_played;
    
    private int tries;
    
    
    public Try_Scorers(String name,String surname,int games_played,int tries)
    {
         this.name = name;
         this.surname = surname;
         this.games_played = games_played;
         this.tries = tries;
    }
    
     public Try_Scorers updateGamesPlayed(int newGames)
     {
         return new Try_Scorers( name, surname, newGames, tries);
     }
     
     public Try_Scorers updateTries(int newTries)
     {
         return new Try_Scorers( name, surname, games_played, newTries);
     }
    
    
    
    public int getTries()
    {
        return tries;
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
        return (name+" "+surname+"  Tries: "+tries+" Games: "+games_played);
    }
}
