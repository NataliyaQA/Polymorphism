package animalsAndFriends;

public class Cat extends Animal {

    @Override
    public void printName() {
        System.out.println("Cats family");
    }

    @Override
    public void doCall() {
        System.out.println("Cat One with name " + getName());
    }

    @Override
    public int checkAge() {
        return getAge() * 5;
    }


}
