/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Services.Impl.PlayerList;

import com.Services.crud.PlayerList.RugbyList_Crud;
import com.Model.classes.ImmutableClasses.Player_Lists.Rugby_list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roman
 */
public class RugbyList_CrudImpl implements RugbyList_Crud{

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(propagation = Propagation.SUPPORTS)
    public Rugby_list find(String id) {
        return (Rugby_list) this.find(id);
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Rugby_list persist(Rugby_list entity) {
        return null;
    }

    @Override
        @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Rugby_list merge(Rugby_list entity) {

        if( entity ==null)
        {
             try {
                 throw new Exception();
             } catch (Exception ex) {
                 Logger.getLogger(RugbyList_CrudImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Rugby_list remove(Rugby_list entity) {
        return null;
    }

    @Override
    public List<Rugby_list> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
