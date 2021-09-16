interface shape
{
    static final double base=20.00;
    double height=30.00;
    double radius=5.05;

    void calculate();
}
class Tri implements shape
{
    @Override
    public void calculate() {
        double area;
        area=0.5*base*height;
        System.out.println("area of Rectangle is ="+area);
    }
}
class circle implements shape
{
    @Override
    public void calculate() {
        double area;
        area=3.14*radius*radius;
        System.out.println("area of circle is ="+area);
    }
}
class Mtest
{
    public static void main(String[] args) {
        Tri o1=new Tri();
        o1.calculate();
        circle o2=new circle();
        o2.calculate();
    }
}