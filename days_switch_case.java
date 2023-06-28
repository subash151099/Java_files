//find days (weekday/weekend) using Group switch
import java.util.Scanner;
class days_switch_case {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter anyone day ex:1-7");
       int day=in.nextInt();
       String days;
       switch (day){
           case 1:
           case 7:
               days="Weekend";
               System.out.println(days);
               break;
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
               days="Weekdays";
               System.out.println(days);
               break;
          default:
               System.out.println("Enter correct day");
               break;
       }
    }
}
