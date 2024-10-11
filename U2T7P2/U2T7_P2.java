package U2T7P2;
import java.util.Scanner;

public class U2T7_P2 {
    Scanner scan = new Scanner(System.in);

    private int wordCount = 0;
    private String str1;
    private String str2;
    private int totalPoints = 0;

    public void firstString() {
        System.out.print("Enter first word: ");
        str1 = scan.nextLine();
        wordCount++;
        System.out.print("Enter next word: ");
        str2 = scan.nextLine();
        wordCount++;
    }
    
    public void compare() {
        int comparison = str1.compareTo(str2);
        int x = (str1.length() - 2);
        String substring1 = str1.substring(x, str1.length());
        String substring2 = str2.substring(0, 2);  
        String firstLetter = str1.substring(0, 1);

        if(comparison < 0 && str1.equals(str2) == false) {
            totalPoints += 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + totalPoints);
        } else if (comparison > 0 && str1.equals(str2) == false) {
            totalPoints -= 5;
            System.out.println("-5 points: current word alphabetically before; SCORE: " + totalPoints); 
        } else {
            totalPoints -= 10;
            System.out.println("-10 points: current word identical; SCORE: " + totalPoints);
        }

        if(substring1.equals(substring2)); {
            totalPoints += 5;
            System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + totalPoints);
        }

        if(str2.contains(firstLetter)) {
            totalPoints += 3;
            System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + totalPoints);
        }

        if(str1.length() - str2.length() < 0) {
            totalPoints += 0;
        } else if(str1.length() - str2.length() > 0) {
            totalPoints += 0; 
        } else {
            totalPoints += 2;
            System.out.println("+2 points: both words are the same length; SCORE: " + totalPoints);
        }

        if(totalPoints < 50) {
            System.out.print("Enter next word: ");
            str1 = str2;
            str2 = scan.nextLine();
            wordCount++;
        } else if(totalPoints >= 50) {
            System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word count :)");
            System.exit(0);
        }
    }

}


