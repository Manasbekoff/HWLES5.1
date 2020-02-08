package com.company;

 class MagicDoor {
    Heroes[] createHeroes = new Heroes[4];

    public void main (String[] args){
    createHeroes[0] = new Heroes("Sniper");
    createHeroes[1] = new Heroes("Zeus");
    createHeroes[2] = new Heroes("Spectre");
    createHeroes[3] = new Heroes("Lion");
        for (int i = 0; i < 3; i++) {
            System.out.println(createHeroes[i].name);

        }
}

class Heroes{
    String name;

    public Heroes (String name){
        this.name = name;
    }


}}
