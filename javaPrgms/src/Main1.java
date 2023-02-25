import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Text {
    private String txt;
    public Text() {
        txt = "";
    }
    
    public void readText() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the text: ");
            txt = scanner.nextLine();
        }
    }
    
    public char charAt(int i) {
        return txt.charAt(i);
    }
    
    public int length() {
        return txt.length();
    }
    
    public int noOfWhiteSpace() {
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ' || txt.charAt(i) == '\t') {
                count++;
            }
        }
        return count;
    }
    
    public int noOfWords() {
        int count = 0;
        boolean wordStarted = false;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) != ' ' && txt.charAt(i) != '\t') {
                if (!wordStarted) {
                    count++;
                    wordStarted = true;
                }
            } else {
                wordStarted = false;
            }
        }
        return count;
    }
    
    public void repeatedWords() {
        String[] words = txt.split("[\\s]+");
        Set<String> uniqueWords = new HashSet<>();
        Set<String> repeatedWords = new HashSet<>();
        for (String word : words) {
            if (!uniqueWords.add(word)) {
                repeatedWords.add(word);
            }
        }
        if (repeatedWords.isEmpty()) {
            System.out.println("No repeated words found.");
        } else {
            System.out.println("Repeated words:");
            for (String word : repeatedWords) {
                System.out.println(word);
            }
        }
    }
    
    public void pascalCase() {
        boolean newWord = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == ' ' || c == '\t') {
                newWord = true;
            } else if (newWord) {
                sb.append(Character.toUpperCase(c));
                newWord = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println("Pascal case: " + sb.toString());
    }
    
}
    
public class Main1 {
    public static void main(String[] args) {
        Text text = new Text();
        text.readText();
        System.out.println("Character at position 5: " + text.charAt(5));
        System.out.println("Length of the text: " + text.length());
        System.out.println("Number of white spaces: " + text.noOfWhiteSpace());
        System.out.println("Number of words: " + text.noOfWords());
        text.repeatedWords();
        text.pascalCase();
    }
}