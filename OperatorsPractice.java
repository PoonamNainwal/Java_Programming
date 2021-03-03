import java.lang.*;
import java.util.*;

public class OperatorsPractice {

   
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       
       int a,b,c;
       double r1,r2;
       
       System.out.println("Enter the values of a ,b and c");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       
       r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
       r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
       
       System.out.println("Roots are "+r1+" "+r2 );
      
      //bitwise operator
       int x=10, y=6,z;
       z=x&y;
       System.out.println(z);
        
        
       int x=0b1010, y=0b0110,z;
       z=x|y;  //x^y
       System.out.println(z);*/
        
        
        int x=0b1000;
        int y;
        y=x<<1; //x<<2 //x>>1 //x>>2
        System.out.println(y);
      
      //increment and decrement operator 
        float x=3.5f
        char x='A'
        byte x=5
        
        int x=5;
        x++;  //++x
        System.out.println(x);
        
       /* int x=5,y;
        y=x++; //++x
        System.out.println(x+" "+y);
       */
        int a=5,b=4,c;
        c=2 * a++ + 3 * ++b;
        System.out.println(c);
      
    }
    
}
