public class Main
{
    public static void main(String[] args)
    {
        Recursion r= new Recursion();
        System.out.println(r.rec(10));
    }
}
class Recursion{
    static int rec(int n)
    {
        if (n==1 )
        {
            System.out.println(n);
            return 0;
        }
        if (n%2!=0) {
            System.out.println(n);
            rec(n - 2);
        }
        if (n%2==0) {
            rec(n - 1);
        }
        return 1;


    }
}
