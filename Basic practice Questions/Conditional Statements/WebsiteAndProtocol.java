      //Find type of website and the protocol used.
   import java.lang.*;
   import java.util.*;

   class WebsiteAndProtocol
   {
     public static void main(String[] args)
     { 
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a URL: ");
       String url = sc.nextLine();
       
       String protocol=url.substring(0,url.indexOf(":"));
       
       if(protocol.equals("http"))
       {
           System.out.println(" Hypertext Transfer protocol ");
       }
       else if(protocol.equals("ftp"))
       {
           System.out.println("File Transfer protocol");
       }
           
       String ext = url.substring(url.lastIndexOf(".")+1);
       if(ext.equals("com"))
       {
           System.out.println("Commercial website");
       }
       else if(ext.equals("org"))
       {
           System.out.println("Organisation website");
       }
     }
   }
