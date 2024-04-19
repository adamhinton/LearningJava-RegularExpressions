package dev.lpa;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");

        String helloWorld2= String.format("%s %s", "Hello", "World");

        String helloWorld3 = Main.format("%s %s", "Hello", "World");


        String testString = "Anyone can Learn abc's, 123's, and any regular expression";
        String replacement = "(-)";
        
        String[] patterns = {
                "[a-zA-Z]*$",
                "^[a-zA-z]{3}",
                "[aA]ny\\b"
        };

        for (String pattern : patterns){
          String output = testString.replaceFirst(pattern, replacement);
          System.out.println("Pattern: " + pattern + " => " + output);
        }

    }

    private static String format(String regexp, String... args){

        int index = 0;
        while(regexp.matches(".*%s.*")){
            regexp = regexp.replaceFirst("%s", args[index++]);
        }

        return regexp;
    }
}