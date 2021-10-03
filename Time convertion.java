
import java.util.*;

public class ykp {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String s=in.next();
         String str="";
         if(s.substring(0,2).equals("12")&&s.contains("AM"))
         {
             str="00";
             s=str+s.substring(2,s.length());
         }
         if(!s.substring(0,2).equals("12")&&s.contains("PM"))
         {
             str=Integer.toString(Integer.parseInt(s.substring(0,2))+12);
             s=str+s.substring(2,s.length());
         }
          System.out.println(s.substring(0,s.length()-2));
         
 
    }
}
