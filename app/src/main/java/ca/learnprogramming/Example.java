package ca.learnprogramming;

public final class Example {

    public String normalMethod(){
        return "I'm Final class";
    }

    public final int finalMethod(String name){
        return name.length();
    }

    public static int staticMethod() {
        return 1;
    }

    public static int staticMethod(int x) {
        return x;
    }
}
