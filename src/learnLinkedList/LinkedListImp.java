package learnLinkedList;

public class LinkedListImp {
    public static void main(String args[]){
        System.out.println("linked list");
        Node head = new Node(10);
        head.next = new Node(20);
        head.pre = new Node(30);
//        System.out.println(head.next.value);
//        System.out.println(head.pre.value);
        head.print(head);
    }
}

class Node{
        int value;
        Node next;
        Node pre;
        Node(int d){
            this.value=d;
        }
        Node(){
            value=0;
        }
        void  print( Node head)
        {
            if(head==null)
                System.out.println("empty linked list");
            Node cur= head;
            while (cur!=null){
                System.out.print(cur.value+"  ");
                cur=cur.next;
            }
            System.out.println("\n");
        }
        }