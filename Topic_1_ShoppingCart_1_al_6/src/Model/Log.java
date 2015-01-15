/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 *
 * @author Frederic
 */
public class Log implements ISujeto{ //this class conteins a vector of ListManager 
  private ListManager listChange[];
  Set<IObserver> observer;
    public ListManager[] getListChange() {
        return listChange;
    }

    public void setListChange(ListManager[] listChange) {
        observer =new HashSet<IObserver>();
        this.listChange = listChange;
    }

    public Log(ListManager[] listChange) {
        this.listChange = listChange;
    }

    public Log() {
    }

   
    @Override
    public void notificar() {
        Iterator it = observer.iterator();
		while (it.hasNext()) {
                        IObserver ob=(IObserver) it.next();
                        ob.update();
			
                                }
        
        
    }

    @Override
    public void suscribe(IObserver o) {
        //This method add observadores 
        observer.add(o);
    }

    @Override
    public void removeSuscribe(IObserver o) {
        observer.remove(o);
    }
  
}
