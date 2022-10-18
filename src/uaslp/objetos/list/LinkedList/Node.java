package uaslp.objetos.list.LinkedList;

public class Node {
    private Node next;
    private Node previous;
    private String data;

    public Node(String data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }
    public Node getPrevious() {
        return previous;
    }
    public String getData() {
        return data;
    }
}
