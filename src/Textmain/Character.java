package Textmain;

public abstract class Character {
    //Variables / Attributes all characters have
    public String name;
    public int maxHp, hp, xp;

    //constructor for character


    public Character(String name, int maxHp, int hp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.xp = xp;
    }

    //methods every character has
    public abstract int attack();
    public abstract int defend();

}
