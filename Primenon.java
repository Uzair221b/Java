class Prime extends Thread
{
    int i,j;

    @Override
    public void run()
    {
        for(i=1;i<=20;i++)
        {
            int c=0;
            for(j=1;j<=20;j++)
            {
                if (i % j == 0)
                    c++;
            }
            if(c==2) {
                System.out.println("prime number" + i);
            }
        }
    }
}
class Nprime extends Thread
{
    int i,j;
    public void run()
    {
        for(i=1;i<20;i++)
        {
            int c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c!=2)
            {
                System.out.println("non prime number"+i);
            }
        }
    }
}
class Primenon
{
    public static void main(String[] args)
    {
        Prime P=new Prime();
        Nprime P1=new Nprime();
        P.start();
        P1.start();

    }
}

