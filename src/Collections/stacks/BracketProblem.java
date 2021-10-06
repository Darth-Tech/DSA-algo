package Collections.stacks;

import java.util.Stack;

public class BracketProblem {
    static int Prec(char ch)
    {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static String infixToPostfix(String exp){
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            System.out.println("Result: "+result+" Index: "+i+" Char: "+c);
            System.out.println("Stack: ");
            stack.forEach(System.out::println);
            System.out.println("------------------------------------------------------------");

            if (Character.isLetterOrDigit(c)){
                result+=c;
            }else if(c=='('){
                stack.push(c);
            }else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result+=stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && Prec(c)<=Prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }

        }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "INVALID";
            }
            result+=stack.pop();
        }
        return result;
    }
    public static void driverFunction(){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
