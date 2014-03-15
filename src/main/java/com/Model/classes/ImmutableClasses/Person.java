/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Model.classes.ImmutableClasses;

import com.Model.Interfaces.PersonInterface;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Roman
 */
public  class Person implements PersonInterface{
   
    private String idNumber;
    private String name;            
    private String surname;
    private Date DoB;
    
     public Person(Person person)
    {
        this.idNumber = person.idNumber;
        this.name = person.name;            
        this.surname = person.surname;
        this.DoB = person.DoB;
        
    }
    public Person(String idNumber,String name, String surname,Date DoB)
    {
        this.idNumber = idNumber;
        this.name = name;            
        this.surname = surname;
        this.DoB = DoB;
    }
    
    ///////////////////////////////////
     public Person updateName(String newName)
    {
        return new Person(idNumber,newName,surname,DoB);
    }
    
     public Person updateSurname(String newSurname)
    {
        return new Person(idNumber,name,newSurname,DoB);
    }
     
     
    
    @Override
    public String getID() {
        return idNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public Date getDOB() {
        return DoB;
    }
    
    @Override
    public String toString()
    {
         SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
         
        return idNumber+" "+name+" "+surname+" "+dt1.format(DoB);
    }
}
