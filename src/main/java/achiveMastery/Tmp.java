package achiveMastery;

class Singletony {
    private static Singletony instance = null;

    private Singletony(String newy) { // constructor
        String first = newy;
    }

    private Singletony() { //empty constructor
    }

    public static Singletony check() {
        if (instance == null) {
            instance = new Singletony();
        }
        return instance;
    }
}
