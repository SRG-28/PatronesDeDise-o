/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sofia
 */
public class AccountPublisher implements Subject{
      
    private final List<Observer> observer = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observer.add(o);
    }
    @Override
    public void detach(Observer o) {
        observer.remove(o);
    }
    @Override
    public void notifyDebit(Account a) {
        observer.forEach((o) -> {
            o.debit(a);
        });
    }
}
