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
public  class LinkedList implements NewInterface {
   private class Node{
       Object value;
       Node next;
       public Node(Object value){
           this.value=value;
       }

        private void next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
   } 
private Node head;
    @Override
    public int size() {
    int size=0;
    Node currentNode=head;
    while(currentNode!=null){
       currentNode.next=currentNode;
       size++;
    }
     return size;
    }

   @Override
    public void add(Object newElement) {
      if(head==null){
         head=new Node(newElement);}
         else{
           Node currentNode=head;
           while(currentNode!=null){
             currentNode=currentNode.next;
                 }
           currentNode.next =new Node(newElement);
                 }
      } 
    

    @Override
    public int indexOf(Object element) {
      Node currentNode=head;
      int index=0;
     while(currentNode!=null){
         if(currentNode.value.equals(element)){
             return index;
         }
         index++;
         currentNode.next=currentNode;
     }
     return -1;
    }

    @Override
    public Object get(int index) {
      Node currentNode =head;
      int count=0;
      while(currentNode!=null){
          if(count==index){
              return currentNode.value;
          }
          currentNode.next=currentNode;
          count++;
      }
      throw new RuntimeException("Object at give index is not found");
    }

    @Override
    public boolean remove(Object element) {
       final int indexOfElementToRemove=indexOf(element);
       if(indexOfElementToRemove==-1){
           return false;
       }
        remove(indexOfElementToRemove);
        return true;
    }

    @Override
    public Object remove(int index) {
        if(index==0){
        final Object ValueToRemove=head.value;
        return ValueToRemove;}
        else{
        Node parentNode=head;
       Node currentNode=head.next;
       int currentindex=0;
       while(parentNode!=null){
           currentindex++;
           parentNode=currentNode;
           currentNode=currentNode.next;}
       throw new RuntimeException("Object at give index is not found");
       }
    }

    @Override
    public boolean isEmpty() {
    return head==null;
    }
    public Node getNode(int index){
        Node currentNode=head;
        int i=0;
        while(currentNode!=null){
            if(i==index){
                return currentNode;
            }
            i++;
            currentNode=currentNode.next;
        }
        throw new RuntimeException("Object at given index is not found");
    }
    public Node getHeadNode(){
        if(isEmpty()){
            throw new RuntimeException("list is empty!cant fetch head");
        }
        else{
            return this.head;
        }
    }
    public Object getHeadValue(){
        return this.getHeadNode().value;
    }
    public Node getTailNode(){
        if(isEmpty()){
            throw new RuntimeException("list is empty!cant fetch tail");
        }
        else{
            Node currentNode=head;
            while(currentNode!=null){
                currentNode.next=currentNode;
            }
            return currentNode;
        }
    }
    public Object getTailValue(){
        return this.getTailNode().value;
    }
    public static LinkedList merge(LinkedList list1,LinkedList list2){
        if(list1.head==null){
            return list2;
        }
        if(list2.head==null){
            return list2;
        }
        if(list1.head==null&&list2.head==null){
            throw new RuntimeException();
        }
        LinkedList mergedList2=list1;
        mergedList2.getTailNode().next();
        return mergedList2;
    }
    void print(){
        if(isEmpty()){
            throw new RuntimeException("the list is empty");
        }
        else{
            Node currentNode=head;
            while(currentNode!=null){
                currentNode=currentNode.next;
            }
            System.err.println("");
        }
    }
    
}
