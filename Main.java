public class Main {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> circularlyLinkedList = new CircularlyLinkedList<>();

        circularlyLinkedList.insertFirst(1);
        circularlyLinkedList.insertLast(2);
        circularlyLinkedList.insertLast(3);
        circularlyLinkedList.insertLast(5);
        circularlyLinkedList.insertFirst(4);
        circularlyLinkedList.deleteFirst();



        circularlyLinkedList.displayList();
    }
}
