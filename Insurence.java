import java.util.Scanner;
public class Insurence{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insurence Eligiblity for Drivers");
        System.out.println("Maried or Unmarried M/U");
        char married_status = in.next().charAt(0);
        
        if(married_status=='u'||married_status=='U'){
            System.out.println("Enter your Gender M/F");
            char gender = in.next().charAt(0);
            System.out.println("Enter your Age");
            int age = in.nextInt();
            if((gender=='m'||gender=='M')&&age>=30){
                System.out.println("You are eligible for Insurence");
            }
            else if((gender=='f'||gender=='F')&&age>=25){
                System.out.println("You are eligible for Insurence");
            }
            else{
            System.out.println("You are Not eligible for Insurence");
            }
        }
        else if(married_status=='m'||married_status=='M'){
            System.out.println("You are eligible for Insurence");
        }
        else{
            System.out.println("You are Not eligible for Insurence / enter valid input");
        }
    }
}
