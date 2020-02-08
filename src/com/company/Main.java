package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
        System.out.println(boss.defense);
        boss.setDefense(120);
        System.out.println(boss.defense);


    }
}
