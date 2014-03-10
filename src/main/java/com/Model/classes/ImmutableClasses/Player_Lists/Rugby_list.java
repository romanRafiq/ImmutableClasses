/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Player_Lists;

import com.Model.classes.ImmutableClasses.Players.Rugby_player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public final class Rugby_list {
      //Private variables list Passed through
    private final List<Rugby_player> rugby_list;
    
    public Rugby_list(List rugby_list){
        this.rugby_list = rugby_list;
    }
    
    public Rugby_list addToList(Rugby_player rugbyPlayer)
    {
        List new_rugby_list = new ArrayList<Rugby_player>();               
        new_rugby_list.add(rugbyPlayer);                
        return new Rugby_list(new_rugby_list);
    }
    
            
            
    public List<Rugby_player> getList()
    {
        return rugby_list;
    }
}
