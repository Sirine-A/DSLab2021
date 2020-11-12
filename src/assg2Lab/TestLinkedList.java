/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg2Lab;

import com.sun.javafx.font.FontConstants;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author hp
 */
public class TestLinkedList {
    private class LinkedList{
        int val;
        LinkedList next;

        private LinkedList add(int i, LinkedList head1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public LinkedList mergeTwoLists(LinkedList l1,LinkedList l2){
        LinkedList list1=l1;
        LinkedList list2=l2;
        LinkedList head=new LinkedList();
        LinkedList merge=head;
        if(l1==null&&l2!=null){
            return l2;
        }
        if{l1!=null&&null==l2){
            return l1;
        }
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                merge.next=list1;
                list1=list1.next;
            }
            else{
             merge.next=list2;
             list2=list2.next;
            }
            merge.next=merge;
        }
    }
    public static void main(String[]args){
        LinkedList myList=new LinkedList();
        LinkedList head1=null;
      head1= myList.add(12,head1);
      head1 = myList.add(8,head1);
        LinkedList head2=null;
        head2=myList.add(9, head2);
        head2=myList.add(21, head2);
        System.out.println(head1);
        System.out.println(head2);
    }
    
}
