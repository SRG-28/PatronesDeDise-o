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
public class AddOperator implements IOperator{
    double denominator = 0;
    double numerator = 0;
    @Override
    public void executeOperator(double numerator, double denominator) {
        double operator;
        operator= numerator+denominator;
        System.out.print("Sum value is:\t"+ operator+"\n");
    }
        @Override
    public double getNumerator() {return numerator;   }

    @Override
    public void setNumerator(double numerator) {this.numerator=numerator;}

    @Override
    public double getDenominator() {return denominator;    }

    @Override
    public void setDenominator(double denominator) {this.denominator=denominator;}
}
