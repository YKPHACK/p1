import java.util.*;

public class ykp {
public static void main(String[] args) {
Scanner y = new Scanner(System.in);
int n = y.nextInt();
float pos = 0;
float zero = 0;
float neg = 0;
for (int i = 0; i < n; i++) {
int x = y.nextInt();
if (x > 0) {
pos++;
} else if (x == 0) {
zero++;
} else {
neg++;
}
}
System.out.println(pos /  n);
System.out.println(neg /  n);
System.out.println(zero /  n);
}
}
