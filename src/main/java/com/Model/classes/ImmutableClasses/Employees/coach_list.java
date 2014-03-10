/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses.Employees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public final class coach_list {
    
     private List <Coach> coaches;
    
    public coach_list(List coaches)
    {
        this.coaches = coaches;
    }
    
    
    public coach_list AddToList(Coach newCoach)
    {
        List newCoaches = new ArrayList<Coach>();
        newCoaches.add(newCoach);        
        
        return new coach_list(newCoaches);
    }
            
    public List <Coach> getList()
    {
        return coaches;
    }
    
}
