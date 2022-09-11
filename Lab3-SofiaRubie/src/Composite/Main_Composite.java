/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author sofia
 */
public class Main_Composite extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Employee> maneger1 = new ArrayList<>();
        List<Employee> Accountant1 = null;
        List<Employee> Cashier1 = null;
        BankManager manager = new BankManager(119340934,"Pilar Villegas",350000);
        Accountant ambar = new Accountant(214540939,"Ambar Rubie", 50000);
        Accountant tobi = new Accountant(119440937,"Tobi Castro",48000);
        Cashier james = new Cashier(319340936, "James Rubie",69000);
        Cashier thomas = new Cashier(419340900,"Thomas Gomez",340000);
        manager.add(ambar);
        manager.add(james);
        manager.add(tobi);
        manager.add(thomas);
        manager.print();
         Build(manager);
        System.exit(0);
    }
    private static void Build(Employee teams) {
        teams.print();

        teams.subEmployee.forEach(a -> Build(a));
    }
       @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


/*Employee employee = new Cashier(119340934,"Pilar Villegas",350000);
        Employee employee1 = new Cashier(214540939,"Ambar Rubie", 5000);
        employee.subEmployee.add(employee1);
        Employee employee2 = new Cashier(319340936, "James Rubie",190000);
        employee.subEmployee.add(employee2);
        Employee employee3 = new Cashier(519440937,"Tobi Castro",200000);
        employee.subEmployee.add(employee3);
        Employee employee4 = new Accountant(519340902,"Fabiola Picado", 70000);
        employee.subEmployee.add(employee4);
        Employee employee5 = new Accountant(419340900,"Thomas Gomez",340000);
        employee.subEmployee.add(employee5);
        Employee employee6 = new BankManager(119340944,"Alejandro Mora",29000);
        employee.subEmployee.add(employee6);
        Employee employee7 = new BankManager(219340934,"Fiorella Selva",78000);
        employee.subEmployee.add(employee7);
        Employee employee8 = new BankManager(193409352,"Felipe Aguilar",55000);
        employee.subEmployee.add(employee8);
        Build(employee);
        System.out.println();*/