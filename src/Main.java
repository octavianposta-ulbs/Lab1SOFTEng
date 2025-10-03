import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Problema 1.7.1
        String list = "A inceput scoala";
        System.out.println(Inverted.invertedString(list));
        //Problema 1.7.2
        NumberList a = new NumberList(10,25);
        a.PrintList();
        a.modifyListByRange(10,20);
        a.PrintList();
        //Problema 1.7.3
        Rectangle.drawRectangle(5,10);
        System.out.println();
        Rectangle.drawRectangleWithDiagonals(10,10);
        //DEBUG cu break point FN + F8 Step Over, FN F7 Step In
        /*
        System.out.println("Hello world!");
        char c = 'a';
        int len = 'z' - 'a';
        for(int i=0; i<=len; i++) {
            int next = c + i;
            char nextChar = (char)next;
            System.out.println(nextChar);
         }
         */
    }
}