package LinkedLists;

public class LinkedList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void addFirst(Node node){

    }

    public void addLast(int item){
        var node = new Node();
        node.setValue(item);
    }

    public void deleteFirst(Node node){

    }

    public void deleteLast(Node node){

    }

    public void contains(Object item){

    }

    public void indexOf(int item){

    }
}
