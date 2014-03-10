/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Player_Lists;

import com.Model.classes.ImmutableClasses.Players.Soccer_player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public final class soccer_list {
    
    private final List<Soccer_player> soccer_Player_list;
    
    public soccer_list(List soccer_Player_list){
        this.soccer_Player_list = soccer_Player_list;
    }
    
    public soccer_list addToList(Soccer_player soccerPlayer)
    {
        List new_soccer_list = new ArrayList<Soccer_player>();               
        new_soccer_list.add(soccerPlayer); 
        
        return new soccer_list(new_soccer_list);
    }
    
            
            
    public List<Soccer_player> getList()
    {
        return soccer_Player_list;
    }
    
}
