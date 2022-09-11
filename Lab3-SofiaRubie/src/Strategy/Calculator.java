/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author sofia
 */
public class Calculator {
    private IOperator operation;
    public void setStrategy(IOperator operation){this.operation=operation;}
    public IOperator getStrategy(){return operation;}
    public void getOperator(double numerator,double denominator){
        operation.executeOperator(numerator, denominator);
    }   
}
