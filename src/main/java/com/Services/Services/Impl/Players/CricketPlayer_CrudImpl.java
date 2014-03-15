/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.Players;

import com.Services.crud.Players.CricketCrudService;
import com.models.Cricket_player;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class CricketPlayer_CrudImpl implements CricketCrudService{

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Cricket_player find(String id) {
        return (Cricket_player) this.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Cricket_player persist(Cricket_player entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Cricket_player merge(Cricket_player entity) {
        if(entity == null)
        {
          try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(CricketPlayer_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }  
        }
        return entity;
    }

    @Override
      @Transactional(propagation = Propagation.REQUIRED)
    public Cricket_player remove(Cricket_player entity) {
    return null;
    }

    @Override
    public List<Cricket_player> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
