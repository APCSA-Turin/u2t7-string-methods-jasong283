import org.w3c.dom.html.HTMLTableRowElement;

public class CustomStringMethodsRunner {
    public static void main(String[]args) {

        CustomStringMethods methods = new CustomStringMethods();


        /*boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        bool = methods.longerThan("apple", 5);
        System.out.println(bool);
        bool = methods.longerThan("apple", 2);
        System.out.println(bool);
        bool = methods.longerThan("apple", 7);
        System.out.println(bool);
        bool = methods.longerThan("bananas", 12);
        System.out.println(bool);

        String str = methods.funnyString("computer", 3);
        System.out.println(str);
        str = methods.funnyString("computer", 0);
        System.out.println(str);
        str = methods.funnyString("computer", 7);
        System.out.println(str);
        str = methods.funnyString("apples", 1);
        System.out.println(str); 
        str = methods.funnyString("computers", 5);
        System.out.println(str);

        //String str = methods.halvesReversed("computer");  //even # of letters
        System.out.println(str);
        str = methods.halvesReversed("computers");        //odd # of letters
        System.out.println(str);
        str = methods.halvesReversed("sky");
        System.out.println(str);
        str = methods.halvesReversed("weekend");
        System.out.println(str);
        str = methods.halvesReversed("an");
        System.out.println(str);
        str = methods.halvesReversed("I");
        System.out.println(str);
        str = methods.halvesReversed("see you soon");
        System.out.println(str);
        str = methods.halvesReversed("see you later!");
        System.out.println(str);
        str = methods.halvesReversed("whats up!");
        System.out.println(str);

        /*String str = methods.pigLatin("computer");
        System.out.println(str);
        str = methods.pigLatin("sky");
        System.out.println(str);
        str = methods.pigLatin("Brooklyn");
        System.out.println(str);
        str = methods.pigLatin("weekend");
        System.out.println(str);
        str = methods.pigLatin("toilet");
        System.out.println(str);

        /*String str2 = methods.removeCharacter("Halloween", 5);
        System.out.println(str2);
        str2 = methods.removeCharacter("Halloween", 0);
        System.out.println(str2);
        str2 = methods.removeCharacter("Halloween", 8);
        System.out.println(str2);
        str2 = methods.removeCharacter("Halloween", 9);
        System.out.println(str2);
        str2 = methods.removeCharacter("Halloween", 20);
        System.out.println(str2);
        str2 = methods.removeCharacter("Hi friend", 0);
        System.out.println(str2);
        str2 = methods.removeCharacter("Hi friend", 1);
        System.out.println(str2);
        str2 = methods.removeCharacter("Hi friend", 2);
        System.out.println(str2);
        str2 = methods.removeCharacter(" Hi friend", 0);
        System.out.println(str2);
        str2 = methods.removeCharacter("A", 0);
        System.out.println(str2);
        str2 = methods.removeCharacter("A ", 0);
        System.out.println(str2);
        str2 = methods.removeCharacter("A", 1);
        System.out.println(str2);
        str2 = methods.removeCharacter("A ", 1);
        System.out.println(str2);
        str2 = methods.removeCharacter("Christmas", 3);
        System.out.println(str2);
        
        /*String str = methods.insertAt("ghost", "BOO!", "o");
        System.out.println(str);
        str = methods.insertAt("ghost", "BOO!", "st");
        System.out.println(str);
        str = methods.insertAt("ghost", "BOO!", "m");
        System.out.println(str);
        str = methods.insertAt("spooooky!", "YIKES", "o");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "y");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "birthday");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", " ");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", " 18th", " ");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th ", "bir");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "!");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "z");
        System.out.println(str);
        str = methods.insertAt("a", "m", "a");
        System.out.println(str);
        str = methods.insertAt("a", "m", "p");
        System.out.println(str);
        str = methods.insertAt("w", "g", "h");
        System.out.println(str);


        //String str = methods.endUp("It's Thursday", 3);
        System.out.println(str);
        str = methods.endUp("hello friend", 3);
        System.out.println(str);
        str = methods.endUp("hello friend!", 3);
        System.out.println(str);
        str = methods.endUp("Shhhh! Be quiet", 3);
        System.out.println(str);
        str = methods.endUp("Yes", 3);
        System.out.println(str);
        str = methods.endUp("Yess", 3);
        System.out.println(str);
        str = methods.endUp("Yesss", 3);
        System.out.println(str);
        str = methods.endUp("no", 3);
        System.out.println(str);
        str = methods.endUp("no!", 3);
        System.out.println(str);
        str = methods.endUp("noo!", 3);
        System.out.println(str);
        str = methods.endUp("noo!!", 3);
        System.out.println(str);
        str = methods.endUp("ALREADY UPPERCASE", 3);
        System.out.println(str);
        str = methods.endUp("hello friend", 1);
        System.out.println(str);
        str = methods.endUp("hello friend", 6);
        System.out.println(str);
        str = methods.endUp("hello friend", 20);
        System.out.println(str); 
        str = methods.endUp("It's Tuesday!", 4);
        System.out.println(str);      

        
        /*/String str = methods.yellOrWhisper("Hello James!");
        System.out.println(str);
        str = methods.yellOrWhisper("hello James!");
        System.out.println(str);
        str = methods.yellOrWhisper("aBCDEFGHIJK");
        System.out.println(str);
        str = methods.yellOrWhisper("Abcdefghijk");
        System.out.println(str);
        str = methods.yellOrWhisper("B");
        System.out.println(str);
        str = methods.yellOrWhisper("b");
        System.out.println(str);
        str = methods.yellOrWhisper("IT'S SUNNY!");
        System.out.println(str);
        str = methods.yellOrWhisper("it's rainy");
        System.out.println(str);
        str = methods.yellOrWhisper("The sun is out!");
        System.out.println(str);
        

     }
    
}
