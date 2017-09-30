public class CircularlyLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;

    public CircularlyLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(T data){
        Node<T> node = new Node<T>();
        node.setData(data);

        if(isEmpty()){
            // if the list is empty setting the last node also to this node
            last = node;
        }
        // node is being assigned old first node (null when the list is empty.
        node.setNext(first);
        // the new node is now in the first space.
        first = node;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertLast(T data){
        Node<T> node = new Node<>();
        node.setData(data);
        // when the list is empty set the node we just created to be the first (first point to this node)
        if(isEmpty()){
            first = node;
        } else {
            // point the old last node to this node
            last.setNext(node);
        }
        // set the last to the new node we just added
        last = node;
    }

    public T deleteFirst(){
        T temp = first.getData();
        if(first.getNext() == null){
            last = null;
        }
        first = first.getNext();

        return temp;
    }


    public void  displayList(){
        System.out.println("Printing list first to last:");
        while(first != null){
            first.displayNode();
            first = first.getNext();
        }
    }

}
