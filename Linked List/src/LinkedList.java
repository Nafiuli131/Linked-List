public class LinkedList {

    ListNode head;

    void addNode(int value){
        ListNode node = new ListNode(value);
        if(head==null){
            head=node;
        }else {
            ListNode temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    void displayNode(){
        System.out.println("Show linked list -> ");
        ListNode temp = head;
        if(temp==null){
            System.out.println("Linked list is empty");
        }else{
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }

    void findMiddleAndLastElement(){
        System.out.println("Middle element -> ");
        if (head == null) {
            System.out.println("List is empty");
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
        System.out.println("Last element is -> ");
        ListNode end = head;
        while (end.next!=null){
            end=end.next;
        }
        System.out.println(end.val);
    }

}
