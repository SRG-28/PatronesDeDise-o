/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author sofia
 */
public class MainObserver extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Observable class 
          AccountPublisher BankA = new AccountPublisher();
          //Observer class
          AccountSuscriberOne commision = new AccountSuscriberOne();
          commision.Type("comission");
          AccountSuscriberOne expense = new AccountSuscriberOne();
          expense.Type("expense");
          AccountSuscriberOne compensation = new AccountSuscriberOne();
          compensation.Type("compensation");
        
       //Attach Commision & compensation
        BankA.attach(commision);
        BankA.attach(expense);
        BankA.attach(compensation);
        
       //NotifyDebit
        System.out.println("Account 1 = 1000");
        System.out.println("Attach : Commission, expense and compensation");
        BankA.notifyDebit(new Account(1000));
        BankA.detach(commision);
        
        System.out.println("Account 2 = 4000");
         System.out.println("Attach : Expense and compensation");
        BankA.notifyDebit(new Account(4000));   
        BankA.detach(expense);
        BankA.detach(compensation);
 
        System.exit(0);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
