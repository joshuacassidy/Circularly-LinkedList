public class Node<T> {
    public T data;
    public Node<T> next;

    public void displayNode(){
        System.out.println("data: " + data);
    }
}
