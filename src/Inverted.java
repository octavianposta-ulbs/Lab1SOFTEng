import java.util.ArrayList;

public class Inverted {
    public static String invertedString(String input) {
        ArrayList<Character> inverted = new ArrayList<Character>();
        for(int i = 0; i < input.length(); i++) {
            inverted.add(input.charAt(i));
        }
        return inverted.reversed().toString();
    }
}
