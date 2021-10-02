import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ykp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long sum = 0;
        while(t-- > 0){
            sum += s.nextInt();
        }
        System.out.println(sum);
    }

}
