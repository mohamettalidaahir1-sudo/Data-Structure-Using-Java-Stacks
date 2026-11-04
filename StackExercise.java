package DataSturucture_L1;

import java.util.Stack;

public class StackExercise {


// Exercise: Stack Operations
// Learn how to use the Stack data structure - Last In, First Out (LIFO).

        public static void main(String[] args) {

            // TODO: 1 - Create a Stack of Strings called 'stack'

            Stack<String>stack=new Stack<>();

            // TODO: 2 - Push 5 elements onto the stack: "Java", "Python", "C++", "JavaScript", "Go"

            stack.push("Java");
            stack.push("Python");
            stack.push("C++");
            stack.push("JavaScript");
            stack.push("Go");

            // TODO: 3 - Peek at the top element without removing it
            //           Print the result (should be "Go")

            System.out.println("Top Element: "+stack.peek());
            System.out.println();
            System.out.println();
            // TODO: 4 - Pop an element from the stack and print it
            //           Then print the stack to see the remaining elements

            System.out.println("Remove Element: "+stack.pop());
            System.out.println("Remaining Elements: "+stack.toString());
            System.out.println();
            System.out.println();

            // TODO: 5 - Check if the stack is empty using isEmpty()
            //           Print the result

            System.out.println("is the stack is Empty: "+stack.isEmpty());

            // --- String Reversal ---
            System.out.println("\n--- String Reversal ---");
            String original = "Hello World";
            // TODO: 6 - Use a Stack to reverse the string 'original'
            //           Push each character onto a stack, then pop them all to build the reversed string
            //           Print both original and reversed strings

            Stack<String>origanalStack=new Stack<>();
            for (int i=0;i<original.length();i++){
                String letter=String.valueOf(original.charAt(i));
                origanalStack.push(letter);
            }
            System.out.println(origanalStack.toString());
            System.out.println();

            Stack<String>reversedStack=new Stack<>();
            int size=origanalStack.size();
            for (int i=0;i<size;i++){
                reversedStack.push(origanalStack.pop());
            }
            System.out.println("--- Reversed Stack ---" );
            System.out.println(reversedStack.toString());

            // --- Balanced Brackets ---
            System.out.println("\n--- Balanced Brackets ---");
            String balanced = "({[()]})";
            String unbalanced = "({[})";
            // TODO: 7 - Implement a balanced brackets checker
            //           Use a Stack to check if a string of brackets is balanced
            //           For each char: if opening bracket, push it; if closing bracket, check
            //           that the top of stack is the matching opening bracket
            //           Test with both 'balanced' and 'unbalanced' strings
            //           Print whether each string is balanced or not

            Stack<String>balancedStack=new Stack<>();
            System.out.println("----");
            boolean isbalanced=true;
            for (int i = 0; i < balanced.length(); i++) {
                String current = String.valueOf(balanced.charAt(i));

                if (current.equals("(") ||
                        current.equals("{") ||
                        current.equals("[")) {

                    balancedStack.push(current);

                } else {
                    if (balancedStack.isEmpty()) {
                        isbalanced = false;
                        break;
                    }

                    String top = balancedStack.peek();

                    if ((current.equals(")") && top.equals("(")) ||
                            (current.equals("}") && top.equals("{")) ||
                            (current.equals("]") && top.equals("["))) {

                        balancedStack.pop();

                    } else {
                        isbalanced = false;
                        break;
                    }
                }
            }
            if (isbalanced){
                System.out.println(balanced+" Balanced!");
                System.out.println(balancedStack.toString());
            }else {
                System.out.println(balanced+ " Unbalanced!");
                balancedStack.toString();
            }

            isbalanced=true;
            balancedStack.clear();

            for (int y=0;y<unbalanced.length();y++){
                String current=String.valueOf(unbalanced.charAt(y));
                if (current.equals("(")||current.equals("{")||current.equals("[")){
                    balancedStack.push(current);
                }else {
                    if (balancedStack.isEmpty()){
                        System.out.println("Stack is Empty!");
                        isbalanced=false;
                        break;
                    }else {
                        String top=balancedStack.peek();
                        if ((current.equals(")")&&top.equals(")"))||(current.equals("}")&&top.equals("{"))||(current.equals("]")&&top.equals("["))){
                            balancedStack.pop();
                        }else {
                            isbalanced=false;
                            break;
                        }
                    }

                }
            }
            if (isbalanced){
                System.out.println(unbalanced+" Balanced!");
                System.out.println(balancedStack.toString());
            }else {
                System.out.println(unbalanced+ " Unbalanced!");
                System.out.println(balancedStack.toString());
            }

        }
    }



