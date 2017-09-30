public class CircularlyLinkedList {
    private Node first;
    private Node last;

    public CircularlyLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            // if the list is empty setting the last node also to this node
            last = node;
        }
        // node is being assigned old first node (null when the list is empty.
        node.next = first;
        // the new node is now in the first space.
        first = node;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertLast(int data){
        Node node = new Node();
        node.data = data;
        // when the list is empty set the node we just created to be the first (first point to this node)
        if(isEmpty()){
            first = node;
        } else {
            // point the old last node to this node
            last.next = node;
        }
        // set the last to the new node we just added
        last = node;
    }

    public int deleteFirst(){
        int temp = first.data;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }


    public void  displayList(){
        System.out.println("Printing list first to last:");
        while(first != null){
            first.displayNode();
            first = first.next;
        }
    }

}
