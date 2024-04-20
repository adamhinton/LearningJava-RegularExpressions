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

        System.out.println("-------------------");

        String paragraph = """
                Double, double toil and trouble;
                Fire burn and caldron bubble.
                Fillet of a fenny snake,
                In the caldron boil and bake
                Eye of newt and toe of frog,
                Wool of bat and tongue of dog,
                Adder's fork and blind-worm's sting,
                Lizard's leg and howlet's wing,
                For a charm of powerful trouble,
                Like a hell-broth boil and bubble.
                """;

        // Splitting by new line characters
        String[] lines = paragraph.split("\\R");
        System.out.println("This paragraph has " + lines.length + " lines");
        // count whitespace
        // \s is whitespace including new lines and spaces
        String[] words = paragraph.split("\\s");
        System.out.println("This paragraph has " + words.length + " words");
        System.out.println(paragraph.replaceAll("[a-zA-z]+ble", "[GRUB]"));
    }

    private static String format(String regexp, String... args){

        int index = 0;
        while(regexp.matches(".*%s.*")){
            regexp = regexp.replaceFirst("%s", args[index++]);
        }

        return regexp;
    }
}