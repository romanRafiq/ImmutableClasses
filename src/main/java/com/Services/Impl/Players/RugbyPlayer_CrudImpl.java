/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.Players;

import com.Model.classes.ImmutableClasses.Players.Rugby_player;
import com.Services.crud.Players.RugbyCrudService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Roman
 */
public class RugbyPlayer_CrudImpl implements RugbyCrudService{

    @Override
     @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)   
    public Rugby_player find(String id) {
        return (Rugby_player) this.find(id);
    }

    @Override
     @Transactional(propagation = Propagation.MANDATORY)
    public Rugby_player persist(Rugby_player entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Rugby_player merge(Rugby_player entity) {
        if(entity == null)
        {
            try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(RugbyCrudService.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return entity;
    }

    @Override
    public Rugby_player remove(Rugby_player entity) {
        return null;
    }

    @Override
    public List<Rugby_player> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
