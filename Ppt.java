import java.util.Scanner;

public class Ppt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the paragraph in present continuous tense: ");
        String presentParagraph = input.nextLine();
        
        String[] words = presentParagraph.split(" ");
        StringBuilder pastParagraphBuilder = new StringBuilder();
        boolean isVerb = false;
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.endsWith("ing")) {
                if (!isVerb) {
                    pastParagraphBuilder.append("was ");
                    isVerb = true;
                }
                pastParagraphBuilder.append(word.substring(0, word.length() - 3)).append("ing ");
            } else {
                pastParagraphBuilder.append(word).append(" ");
                isVerb = false;
            }
        }
        
        String pastParagraph = pastParagraphBuilder.toString();
        System.out.println("The paragraph in past continuous tense is:");
        System.out.println(pastParagraph);
    }
}
