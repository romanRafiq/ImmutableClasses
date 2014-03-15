/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.Players;

import com.Services.crud.Players.SoccerCrudService;
import com.models.Soccer_player;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class SoccerPlayer_CrudImpl implements SoccerCrudService{

    @Override
      @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Soccer_player find(String id) {
            return (Soccer_player)this.find(id);
    }

    @Override
      @Transactional(propagation = Propagation.MANDATORY)
    public Soccer_player persist(Soccer_player entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Soccer_player merge(Soccer_player entity) {
        if(entity ==null)
        {
           try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(SoccerPlayer_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             } 
        }
        return entity;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Soccer_player remove(Soccer_player entity) {
        return null;
    }

    @Override
    public List<Soccer_player> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
