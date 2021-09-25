import java.util.*;
class student
{
    int roll_no;
    void put()
    {
        System.out.println("Enter roll no");
        Scanner s=new Scanner(System.in);
        roll_no=s.nextInt();
    }
}
class test extends student
{
    int java,html;
    void put1() {
        System.out.println("Enter marks of java & html");
        Scanner s= new Scanner(System.in);
                java=s.nextInt();
                html=s.nextInt();

    }
    void disp()
    {
        System.out.println("roll no"+roll_no);
        System.out.println("java"+java);
        System.out.println("html"+html);

    }
}
interface sports
{
    final static int marks=75;
    void put2();
}
class result extends test implements sports
{
    @Override
    public void put2() {
        System.out.println("sports marks"+marks);
    }
    void cal()
    {
        int total=java+html+marks;
        System.out.println("Total marks"+total);
    }
}
public class Studinfo {
    public static void main(String[] args) {
        result r=new result();
        r.put();
        r.put1();
        r.disp();
        r.put2();
        r.cal();
    }
}