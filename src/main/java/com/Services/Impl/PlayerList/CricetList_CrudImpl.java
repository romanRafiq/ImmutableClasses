/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerList;

import com.Services.crud.PlayerList.CrickList_Crud;
import com.Model.classes.ImmutableClasses.Player_Lists.Cricket_list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roman
 */
public class CricetList_CrudImpl implements CrickList_Crud{

    @Override
      @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Cricket_list find(String id) {
        return (Cricket_list)this.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Cricket_list persist(Cricket_list entity) {
        return null;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Cricket_list merge(Cricket_list entity) {
     if(entity ==null)
     {
          try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(CricetList_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);                 
             }
     }
     return entity;
    }

    @Override
     @Transactional(propagation = Propagation.REQUIRED)
    public Cricket_list remove(Cricket_list entity) {
        return null;
    }

    @Override
    public List<Cricket_list> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
