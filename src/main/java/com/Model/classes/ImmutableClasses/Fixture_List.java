/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses;

import com.Model.classes.ImmutableClasses.Sport_Fixtures;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public final class Fixture_List {
    
    private List <Sport_Fixtures> fixture_list;
    
    public Fixture_List(List fixture_list)
    {
        this.fixture_list = fixture_list;
    }
    
    
    public Fixture_List AddToList(Sport_Fixtures sport_Fixtures)
    {
        List new_fixture_list = new ArrayList<Sport_Fixtures>();
        new_fixture_list.add(sport_Fixtures);        
        
        return new Fixture_List(new_fixture_list);
    }
            
    public List <Sport_Fixtures> getList()
    {
        return fixture_list;
    }
}
