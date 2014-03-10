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
public final class Batsman_runs implements playersInterface{
     //Variables
    private String name;
    private String surname;
    private int games_played;
    
    private int runs;
    
    
     public Batsman_runs(String name,String surname,int games_played,int runs)
    {
         this.name = name;
         this.surname = surname;
         this.games_played = games_played;
         this.runs = runs;
    }
    
     public Batsman_runs updateGamesPlayed(int newGames)
     {
         return new Batsman_runs( name, surname, newGames, runs);
     }
     
     public Batsman_runs updateRuns(int newRuns)
     {
         return new Batsman_runs( name, surname, games_played, newRuns);
     }
     
     
      public int getRuns() {
        return runs;
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
        return (name+" "+surname+"  Runs: "+runs+" Games: "+games_played);
    }
    
}
