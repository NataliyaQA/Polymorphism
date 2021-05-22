package animalsAndFriends;

public class Bird extends Animal { //inheritance

    @Override //polymorphism
    public void printName() {
        System.out.println("Birds family");
    }

    @Override
    public void doCall() {
        System.out.println("Bird One with name " + getName());
    }

    @Override
    public int checkAge() {
        return getAge() * 20;
    }
}
