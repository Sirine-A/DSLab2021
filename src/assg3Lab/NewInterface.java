/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg3Lab;

import java.util.List;

/**
 *
 * @author hp
 */
public interface NewInterface {
   int size();
    
   void add(Object newElement);
    
   int indexOf(Object element);
    
   Object get(int index);
    
   boolean remove(Object element);
    
   Object remove(int index);
    
   boolean isEmpty(); 
}
