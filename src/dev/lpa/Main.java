package dev.lpa;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");

        String helloWorld2= String.format("%s %s", "Hello", "World");

        String helloWorld3 = Main.format("%s %s", "Hello", "World");

    }

    private static String format(String regexp, String... args){

        int index = 0;
        while(regexp.matches(".*%s.*")){
            regexp = regexp.replaceFirst("%s", args[index++]);
        }

        return regexp;
    }
}