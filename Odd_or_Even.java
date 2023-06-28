//odd or even using if condition
import java.util.Scanner;
class Odd_or_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter anyone number");
        int val = in.nextInt();
        if (val%2==0){
            System.out.println(val+" is Even number");
        }
        else{
        System.out.println(val+" is Odd number");
        }
    }
}
