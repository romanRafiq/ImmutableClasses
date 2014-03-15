/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerList;

import com.Services.crud.PlayerList.SoccerList_Crud;
import com.models.soccer_list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class SoccerList_CrudImpl implements SoccerList_Crud{

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public soccer_list find(String id) {
        return (soccer_list) this.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public soccer_list persist(soccer_list entity) {
    return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public soccer_list merge(soccer_list entity) {
      
        if (entity == null) {            
             try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(SoccerList_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return entity;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public soccer_list remove(soccer_list entity) {
        return null;
    }

    @Override
    public List<soccer_list> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
