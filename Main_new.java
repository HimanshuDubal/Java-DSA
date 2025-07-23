
import java.util.Scanner;

class Main_new{
    public static void main(String[] args) {
        if (args.length > 0) {
            int size = Integer.parseInt(args[0]);
            System.out.println("Your prefered size is " + size);
            Stack s = new Stack(size);
            System.out.println("Enter any " +size+ " value");
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<size; i++){
                s.push(sc.nextInt());
            }
            System.out.print("The stack is -> ");
            s.display();
        }
        else{
            System.out.println("Enter any size");
        }
    }
}