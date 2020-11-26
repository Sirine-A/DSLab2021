/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import assg3Lab.NewInterface;

/**
 *
 * @author hp
 */
public interface Interface extends NewInterface {
    int size();
    
   void add(Object newElement);
    
   int indexOf(Object element);
    
   Object get(int index);
    
   boolean remove(Object element);
    
   Object remove(int index);
    
   boolean isEmpty();
}
