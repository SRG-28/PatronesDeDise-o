/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author sofia
 */
import java.util.List;
public abstract class Employee {
    public abstract int getId();
	public abstract String getName();
	public abstract double getSalary();
	public abstract void print();
	public abstract void add(Employee employee);
	public abstract void remove(Employee employee);
	public abstract Employee getChild(int id);
	public  List<Employee> subEmployee ;
}
