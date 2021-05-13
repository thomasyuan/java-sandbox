package ca.learnprogramming;

public class CloneableExample implements Cloneable {

    private final String name;

    CloneableExample(final String arg) {
        name = arg;
    }

    public static void main(String[] args) {
        CloneableExample a = new CloneableExample("Hello");
        try {
            CloneableExample b = (CloneableExample) a.clone();
            System.out.println(b);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(a);
    }
}
