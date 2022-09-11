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
public interface IOperator {
    public double getNumerator();
    public void setNumerator(double n);
    public double getDenominator();
    public void setDenominator(double d);
    public void executeOperator(double n, double d);
}
