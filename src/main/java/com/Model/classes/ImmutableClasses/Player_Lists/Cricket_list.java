/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Player_Lists;

import com.Model.classes.ImmutableClasses.Players.Cricket_player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public final class Cricket_list {
    
     private final List<Cricket_player> crikect_Player_list;
    
    public Cricket_list(List crikect_Player_list){
        this.crikect_Player_list = crikect_Player_list;
    }
    
    public Cricket_list addToList(Cricket_player cricketPlayer)
    {
        List new_soccer_list = new ArrayList<Cricket_player>();               
        new_soccer_list.add(cricketPlayer); 
        
        return new Cricket_list(new_soccer_list);
    }
    
            
            
    public List<Cricket_player> getList()
    {
        return crikect_Player_list;
    }
}
