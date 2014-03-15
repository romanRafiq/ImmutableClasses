/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerRecords;

import com.Services.crud.PlayerRecords.GoalScorer_CrudService;
import com.models.goal_Scorers;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class GoalScorer_CrudImpl implements GoalScorer_CrudService{

    @Override
     @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public goal_Scorers find(String id) {
        return (goal_Scorers)this.find(id);
    }

    @Override
     @Transactional(propagation = Propagation.MANDATORY)
    public goal_Scorers persist(goal_Scorers entity) {
            return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public goal_Scorers merge(goal_Scorers entity) {
       
        if(entity == null)
        {
             try {
                 throw new Exception();
             } catch (Exception ex) {
              Logger.getLogger(goal_Scorers.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return entity;
    
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public goal_Scorers remove(goal_Scorers entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<goal_Scorers> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
