import java.util.*;
import java.lang.*;
class LeapYear{
  public static void main(String agrs[]){
     Scanner sc=new Scanner(System.in);
        int year;
         System.out.println("Enter a year");
         year=sc.nextInt();
        
         if(year%4==0)
         {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("This year is Leap year");
                }
                else
                {
                    System.out.println("This year is Not Leap Year ");
                }
            }
            else
                {
                    System.out.println("This year is Leap Year ");
                }
         }
         else
         {
            System.out.println("This year is not a Leap year");
         }
  }
}
