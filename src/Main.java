public class Main {
    public static void main(String[] args) throws  Exception {
        int a = 0;

        while (a < 10) {
            a += 2;
            System.out.println("seconds " + a);
            Thread.sleep(1000);
        }
        System.out.println("Time is over!!");
    }
}
