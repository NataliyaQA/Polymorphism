package animalsAndFriends;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printName() {
        System.out.println("Kind of animal is");
    }

    public void doCall() {
        // nothing to do
        System.out.println("hello pet");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int checkAge() {
        return getAge();
    }
}


