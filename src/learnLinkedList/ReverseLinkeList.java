package learnLinkedList;

public class ReverseLinkeList {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50,60,70,80,90};
        Node head=new Node(1);
        Node cur =head;
        for(int i=0;i<arr.length;i++) {
            cur.next = new Node(arr[i]);
            cur=cur.next;
        }
        head.print(head);
        System.out.println("\nworking");
        Node rh = reverseList(head);
        head.print(rh);

    }

    public static Node reverseList(Node head){
        Node cur=head;
        Node pre=null;
        while(cur!= null){
            Node next= cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
