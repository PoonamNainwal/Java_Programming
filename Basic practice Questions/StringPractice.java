package first;

import java.util.*;

public class StringPractice {

    public static void main(String[] args) {
        String fav_animal;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your favourite animal:- ");
        fav_animal=sc.nextLine();
        
        System.out.println("Favourite Animal is" +name);
      
      //find if the data is Date format(dd/mm/yyyy)
      
       String d="29/03/2002";
     System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));  //[abc]is used for matching exactly given letters, {4} is used for 4number of times
      //output=true
      
      //Remove special characters from a string
      String str="a!b@c#1*2%3";
      System.out.println(str.replaceAll("[^a-z A-Z 0-9]"," "));
      // o/p= a b c 1 2 3
                          
    }
}
  
