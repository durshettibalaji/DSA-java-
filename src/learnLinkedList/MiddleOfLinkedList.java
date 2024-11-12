package learnLinkedList;

public class MiddleOfLinkedList {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50,60,70,80,90};
        Node head=new Node(1);
        Node cur =head;
        for(int i=0;i<arr.length;i++) {
            cur.next = new Node(arr[i]);
            cur=cur.next;
        }
        head.print(head);
        Node middle = middle(head);
        System.out.println(middle.value);
    }
    static Node middle(Node head){
        Node slow= head;
        Node fast= head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
