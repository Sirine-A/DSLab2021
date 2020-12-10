/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_linked_list;

/**
 *
 * @author hp
 */
public class CDLL implements DLLInterface{
private DLLNode head;
    private DLLNode tail;
private int size;
    public CDLL() {
        this.head = null;
        this.tail = null;
        this.size=0;
    }

    public CDLL(DLLNode head) {
        this.head = this.tail = head;
        this.size=1;
    }

    public CDLL(Object headValue) {

        this.head = this.tail = new DLLNode(headValue);
        this.size=1;
    }
    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
            
        } else {
            DLLNode currentNode = this.head;
            int count = 1; 
            while (!currentNode.equals(this.tail)) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        } 
    }

    @Override
    public boolean isEmpty() {
         return this.head == null;
    }
    public void makeEmpty() {
        this.head = this.tail = null;
    }

    public DLLNode getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public DLLNode getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        } else {
            return this.tail;
        }
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    //same as DLL without tail
    public DLLNode getNode(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (isEmpty()) {
            throw new RuntimeException("Cannot fetch node, list is empty!");
        } else {
            DLLNode currentNode = this.head;
            int i = 0;
            while (currentNode != null) { //not necessarily to use .equals to compare with null
                if (i == index) {
                    return currentNode;
                }
                i++;
                currentNode = currentNode.getNext();
            }
            throw new RuntimeException("Object at given index is not found!");
        }
    }


    @Override
    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    @Override
    public int indexOf(Object element) {
        DLLNode currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1; 
    }

    @Override
    public void insertAtBack(Object newElement) {
      if(isEmpty()) {
          this.head=this.tail=new DLLNode(newElement);
      } 
      else{
          DLLNode nodeToAdd = new DLLNode(newElement, null, this.tail); 
            this.tail.setNext(nodeToAdd); 
            this.tail = nodeToAdd;
            this.tail.setNext(this.head);
            this.head.setPrevious(this.tail);
      }
      this.size++;
    }

    @Override
    public void insertAtFront(Object newElement) {
         if (isEmpty()) {
            this.head = this.tail = new DLLNode(newElement);
        } else {
            DLLNode nodeToAdd = new DLLNode(newElement, head, null);
            this.head.setPrevious(nodeToAdd); 
            this.head = nodeToAdd;
             this.tail.setNext(this.head);
            this.head.setPrevious(this.tail);     
    }
        this.size++;
    }

    @Override
    public void removeFromBack() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { 
            makeEmpty();
        } else {

            DLLNode nodeBeforeTail = this.tail.getPrevious();
            nodeBeforeTail.setNext(this.head);
            this.head.setPrevious(nodeBeforeTail);
            this.tail = nodeBeforeTail; 
            this.size--;
    }}

    @Override
    public void removeFromFront() {
         if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { 
            makeEmpty();
        } else {
            this.head = this.head.getNext(); 
            this.head.setPrevious(this.tail);
            this.tail.setNext(this.head);
            this.size--;
        } 
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            DLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            DLLNode currentNode = this.getTailNode();
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " <-- ");
                currentNode = currentNode.getPrevious();
            }
            System.out.println("");
        }
    } 
}
