import java.util.Scanner;
import java.util.Stack;

public class acmicpc10828 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int countOfCommand = Integer.parseInt(sc.nextLine());
        Stack stack = new Stack();
        for(int i=0;i<countOfCommand;i++){
            String[] command = sc.nextLine().split(" ");

            switch(command[0]){
                case "push" :
                    stack.push(command[1]);
                    break;
                case "pop" :
                    if (stackIsEmpty(stack)) break;
                    System.out.println(stack.pop());
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if(stack.empty()){
                        System.out.println(1);
                        break;
                    }
                    System.out.println(0);
                    break;
                case "top" :
                    if (stackIsEmpty(stack)) break;
                    System.out.println(stack.get(stack.size()-1));
                    break;
            }
        }
    }

    public static boolean stackIsEmpty(Stack stack) {
        if(stack.isEmpty()){
            System.out.println(-1);
            return true;
        }
        return false;
    }
}
