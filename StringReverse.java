package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Java";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        String name = "Hakan Ozdemir";

        reverse(name);
    }

    public static String reverse(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}