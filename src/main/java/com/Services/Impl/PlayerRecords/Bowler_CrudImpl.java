/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerRecords;

import com.Model.classes.ImmutableClasses.PlayerRecords.BowlerWickets;
import com.Services.crud.PlayerRecords.BowlerCrud_service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Roman
 */
public class Bowler_CrudImpl implements BowlerCrud_service{

    @Override
      @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public BowlerWickets find(String id) {
        return (BowlerWickets)this.find(id);
                
    }

    @Override
     @Transactional(propagation = Propagation.MANDATORY)
    public BowlerWickets persist(BowlerWickets entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BowlerWickets merge(BowlerWickets entity) {
        if(entity == null)
        {
         try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(Bowler_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }   
        }
        return entity;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public BowlerWickets remove(BowlerWickets entity) {
        return null;
    }

    @Override      
    public List<BowlerWickets> findAll() {
        return null;
    }
    
}
