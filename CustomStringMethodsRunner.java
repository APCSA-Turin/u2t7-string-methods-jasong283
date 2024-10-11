import org.w3c.dom.html.HTMLTableRowElement;

public class CustomStringMethodsRunner {
    public static void main(String[]args) {

        CustomStringMethods methods = new CustomStringMethods();


        boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        bool = methods.longerThan("apple", 5);
        System.out.println(bool);
        bool = methods.longerThan("apple", 2);
        System.out.println(bool);
        bool = methods.longerThan("apple", 7);
        System.out.println(bool);

        // str = methods.funnyString("computer", 3);
        //System.out.println(str);
        //str = methods.funnyString("computer", 0);
        //.out.println(str);
        //str = methods.funnyString("computer", 7);
        //System.out.println(str);
        //str = methods.funnyString("apples", 1);
        //System.out.println(str);

        String str = methods.halvesReversed("computer");  //even # of letters
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




        //String str = methods.pigLatin("computer");
        //System.out.println(str);
        //str = methods.pigLatin("sky");
        //System.out.println(str);
        //str = methods.pigLatin("Brooklyn");
        //System.out.println(str);
        //str = methods.pigLatin("weekend");
        //System.out.println(str);

        String str2 = methods.removeCharacter("Halloween", 5);
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
        
     }
    
}
