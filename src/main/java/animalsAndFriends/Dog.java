package animalsAndFriends;

import java.util.List;

public class Dog extends Animal {
    String bread;

    public Dog() {}

    public Dog(String bread, String name, int age) {
        super(name, age);
        this.bread = bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }

    @Override
    public void printName() {
        System.out.println("Dogs family");
    }

    @Override
    public void doCall() {
        System.out.println("Dog One with name " + getName());
    }

    @Override
    public int checkAge() {
        return getAge() * 7;
    }
}
