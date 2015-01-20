/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Frederic
 */
public class List {

    private ArrayList list;

    public ArrayList getList() {
        return list;
    }

    public List() {
        list = new ArrayList();
        list.clear();
    }

    ;
      public void addList(Object o) {
        if (list.size() == 15) {
            list.remove(0);
            list.trimToSize();
            comprobar(o);
        } else {
            comprobar(o);
        }

    }

    private void comprobar(Object o) {
        boolean res = true;
        int i = 0;

        while (i < list.size()) {
             
            if (list.get(i).equals(o)) {
            list.remove(i);
            list.trimToSize();
            list.add(o);
            res=false;    
            }
            i++;
        }
        if(res){
            list.add(o);
        }
        
        
        
    }

    @Override
    public String toString() {
        String res = new String();
        Iterator i = list.iterator();
        while (i.hasNext()) {
            res += i.next().toString();
        }
        return res;
    }

}
