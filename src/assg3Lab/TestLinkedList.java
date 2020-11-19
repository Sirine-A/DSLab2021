/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg3Lab;

/**
 *
 * @author hp
 */
public class TestLinkedList {
    public void main(String[] args){
        LinkedList myList=new LinkedList();
        myList.add("omar");
        myList.add("sirine");
        myList.add("kayed");
        LinkedList secondList=new LinkedList();
        myList.add("samira");
        myList.add("jad");
        myList.add("amar");
        LinkedList mergedList=LinkedList.merge(myList,secondList);
        mergedList.print();
    }
    
}
