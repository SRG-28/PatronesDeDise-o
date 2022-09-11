/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author sofia
 */
public class BankManager extends Employee{
     int id;
    String name;
    double salary;
    BankManager(int idd,String nam,double money){
		   this.id=idd;
		   this.name=nam;
		   this.salary=money;
		   subEmployee = new ArrayList<>();
    }    
    @Override
    public int getId() {return id;}
    @Override
    public String getName() {return name;}
    @Override
    public double getSalary() {return salary;}
    
    @Override
    public void add(Employee employee){
        if(subEmployee.add(employee)){
            System.out.println("Employee added: " +  employee.getName());
        }
        else{
            System.out.println("Employee not added");
        }
        
    }
    @Override
    public void remove(Employee employee) {
        if(subEmployee.remove(id)!=null){
            System.out.println("Employee removed");
        } else {
            System.out.println("Employee not removed");
        }
    }
    @Override
    public Employee getChild(int id) {
        return subEmployee.get(id);
    }
    @Override
    public void print() {
        System.out.println("BankManager id : "+getId() + "\tName : " + getName() + " \tSalary : " + getSalary()+ "\tSubEmplyees : " );
        
    }
}
