// string example
public class StringManipulations {
    public static void main(String[] args) {
        String text = "mister";
        int age = 30;
        System.out.println("Original String : " + text);
        System.out.println("Concatenated String: " + text + " Java!");
        System.out.println("Length of the string: " + text.length());
        System.out.println("Substring: " + text.substring(3));
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Character at index 0: " + text.charAt(0));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("text is equal to str3: " + text.equals("mister Java!"));
        System.out.println("text is equal to str4 (case insensitive): " + text.equalsIgnoreCase("MISTER Java!"));
        System.out.println("text is not equal to str5: " + !text.equals("Mister Java!"));
        System.out.println("Trimmed String: '" + "    Mister    ".trim() + "'");
        String sentence = "Mister is coding Java";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Replaced String: " + "I like cats, but cats are cute.".replace("cats", "dogs"));
        System.out.println(String.format("My name is %s and I am %d years old.", text, age));
    }
}