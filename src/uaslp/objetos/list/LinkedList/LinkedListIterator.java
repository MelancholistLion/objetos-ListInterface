package uaslp.objetos.list.LinkedList;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {
    Node node;

    public LinkedListIterator(Node node){
        this.node = node;
    }

    public boolean hasNext(){
        return node != null;
    }

    public String next(){
        String data = node.getData();
        node = node.getNext();
        return data;
    }
}
