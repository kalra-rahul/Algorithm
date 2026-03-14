package DoubleLinkedList;


class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }
}

class MyLinkedList {
    Node head, tail;
    int size;

    public void addFirst(int val){
        Node n = new Node(val);
        if(head == null){
            head = tail = n;
            return;
        }
        head.prev = n;
        n.next = head;
        head = n;
    }

    public void addLast(int val){
        Node n = new Node(val);
        if(tail == null){
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    public void removeLast(){
        if(tail == null){
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void removeFirst(){
        if(head == null){
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}



public class DoubleLL {
    public static void main(String[] args) {
        MyLinkedList dll = new MyLinkedList();
        dll.addFirst(1);dll.addLast(2); dll.addLast(3);
        dll.reverse();
        dll.print();
    }
}
