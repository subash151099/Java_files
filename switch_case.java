//switch case
import java.util.Scanner;
class switch_case {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter anyone day ex:1-7");
       int day=in.nextInt();
       String days;
       switch (day){
           case 1:
               days="Sunday";
               System.out.println(days);
               break;
           case 2:
               days="Monday";
               System.out.println(days);
               break;
          case 3:
               days="Tuesday";
               System.out.println(days);
               break;
          case 4:
               days="Wednesday";
               System.out.println(days);
               break;
          case 5:
               days="Thursday";
               System.out.println(days);
               break;
          case 6:
               days="Friday";
               System.out.println(days);
               break;
          case 7:
               days="Saturday";
               System.out.println(days);
               break;
          default:
               System.out.println("Enter correct day");
               break;
       }
    }
}
