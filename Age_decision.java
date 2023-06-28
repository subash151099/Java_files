//age decesion using if-else condition
import java.util.Scanner;
class Age_decision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = in.nextInt();

        if (age>=0&&age<18){
            System.out.println("Minor");
        }
        else if (age>=18&&age<=59){
            System.out.println("Major");
        }
        else if (age>=60&&age<=79){
            System.out.println("Senior");
        }
        else if(age>=80&&age<=110){
            System.out.println("Super Senior");
        }
        else{
            System.out.println("Enter correct Age");
        }
    }
}
