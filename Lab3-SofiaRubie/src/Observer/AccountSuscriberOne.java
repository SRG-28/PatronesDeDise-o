/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author sofia
 */
public class AccountSuscriberOne implements Observer{
    private String Type = "";
    
    public void Type(String t){
        Type = t;
    }
    
     @Override 
    public void debit(Account a) {
        double value;
        double sum;
        if(Type == "comission"){
            value=0.11*a.getMoney();
            sum=a.getMoney()+ value;
            System.out.println("Commission of\t"+a.getMoney()+ "\t is  "+ value+ 
                    "\tBank balance for Account is:\t"+ sum);
     }
        else if (Type == "expense"){
             value=0.22*a.getMoney();
              sum=a.getMoney()+ value;
              System.out.println("Expense of\t"+a.getMoney()+ "\t is  "+ value+ 
                    "\tBank balance for Account is:\t"+ sum);
        }
        else if (Type == "compensation"){
        value=0.33*a.getMoney();
              sum=a.getMoney()+ value;
              System.out.println("Compensation of\t"+a.getMoney()+ "\t is  "+ value+ 
                    "\tBank balance for Account is:\t"+ sum);
        }
        else {
            System.out.println("Error, acción no se pudo ejecutar");
        }
    }
}
