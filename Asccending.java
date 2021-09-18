import java.util.*;

class Asccending
{

    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter 5 array elements");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]= s.nextInt();

        }
        for (int i=0;i<5;i++)
        {
            System.out.print(""+a[i]);
        }
        for (int i=0;i<5;i++)
        { int t;
            for (int j=i+1;j<5;j++ )
            {
                if (a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                }

    }
}
System.out.println("Array elements in acc");
        for ( int i=0;i<5;i++)
        {
            System.out.println(a[i]+"\t");
        }
        }
    }