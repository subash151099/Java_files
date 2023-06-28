//Find grade using if-else condition
import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = in.nextInt();

        if (mark>=90&&mark<=100){
            System.out.println("Grade-'A'");
        }
        else if (mark>=80&&mark<=89){
            System.out.println("Grade-'B'");
        }
        else if (mark>=70&&mark<=79){
            System.out.println("Grade-'C'");
        }
        else if(mark<70&&mark>=35){
            System.out.println("Grade-'D'");
        }
        else if(mark<35&&mark>=0){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter correct Mark");
        }
    }
}
