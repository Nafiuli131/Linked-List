public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.findMiddleAndLastElement();
        linkedList.remove(1);
        linkedList.displayNode();
    }
}