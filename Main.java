package com.company.lesson09;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "ser", "dfsfser");
        user.setName("Vasya");
        System.out.println(user.getName());

        User user1 = new User(5, "ser2", "asdfgf");
        System.out.println(user1.getAge());
    }
}
