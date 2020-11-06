package com.jackyoung.link;

public class LinkTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.add(123);
        link.add(321);
        link.add(500);
        System.out.println(link.size());
    }
}
