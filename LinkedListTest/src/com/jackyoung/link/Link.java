package com.jackyoung.link;

public class Link {
    Node head;
    int size;
    public int size(){
        return size;
    }
    private static Node findLast(Node node){
        if(node.next == null) return node;
        return findLast(node.next);
    }
    public void add(Object obj){
        Node node = new Node(obj);
        Node tmp = head;
        if(head == null){
            head = node;
        }else{
            tmp = findLast(tmp);
            tmp.next = node;
        }
        size++;
    }
    public void remove(Object obj){
        Node pre = new Node(0);
        Node tmp = head;
        pre.next = head;
        while(tmp != null){
            if(obj == tmp.val){
                pre.next = tmp.next;
                break;
            }
            pre = pre.next;
            tmp = tmp.next;
        }
        size--;
    }
    public void modify(Object oldObj, Object newObj){
        Node tmp = head;
        while(tmp != null){
            if(oldObj == tmp.val) {
                tmp.val = newObj;
                break;
            }
            tmp = tmp.next;
        }
    }
}
