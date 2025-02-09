import java.io.*;
public class exc{
public static void main(String[] args){
try{
int a = 50, b = 0, c;
c = a/b;
System.out.println(c);
}
catch( ArithmeticException x){
System.out.println(x);
}
}
}