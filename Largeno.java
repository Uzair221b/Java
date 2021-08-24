import java.util.*;
class Largeno
{
public static void main(String[]args)
{
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of  a,b");
a=s.nextInt();
b=s.nextInt();
if(a>b)
System.out.println("a is greater no"+a);
if(a<b)
System.out.println("b is greater no"+b);
if(a==b)
System.out.println("a and b are equal");
}
}