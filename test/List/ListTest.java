/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class ListTest {
    
    public ListTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
     public void testAddRemove(){
         ArrayList myList=new ArrayList();
         testAddRemove(myList);
     }

    private void testAddRemove(ArrayList myList) {
      final Object elt1 = new Object();
        myList.add(elt1);
        Assertion.assertTrue(myList.size() == 1);
        final Object elt2 = new Object();
        myList.add(elt2);
        Assertion.assertTrue(myList.size() == 2);
        final Object elt = myList.remove(1);
        Assertion.assertTrue(elt == elt2);
        Assertion.assertTrue(myList.size() == 1);
        final boolean isRemoved = myList.remove(elt1);
        Assertion.assertTrue(isRemoved);
        Assertion.assertTrue(myList.size() == 0);
    }
}
@Test 
