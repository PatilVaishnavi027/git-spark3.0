public class Spark {
    public static void main(String[] args) {
        System.out.println("hello");
        int res= sum(1,2);
        System.out.println(res);
        notifyUser();
        auth();
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void notifyUser()

    {
        System.out.println("hello user");
    }
    public static void auth()
    {
        System.out.println("hii buddy");
    }
}
