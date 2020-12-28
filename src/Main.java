import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = input.nextLine();
        System.out.println(checkExpression(expression));
    }

    public static boolean checkExpression(String e) {
        boolean check = false;
        String[] arrayE = e.split("");
        Stack bracket = new Stack();
        for (int i = 0; i < arrayE.length; i++) {
            if (arrayE[i].equals("(")){
                bracket.add(arrayE[i]);
            }
            if (arrayE[i].equals(")")){
                if (bracket.empty()) {
                    return false;
                }
                else bracket.pop();
            }
        }
        if (bracket.empty()) check = true;


        return check;
    }
}
