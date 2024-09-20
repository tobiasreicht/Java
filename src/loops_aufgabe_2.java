public class loops_aufgabe_2 {
    public static void main(String[] args) {

        long result = 0;
        for (int i=2; i<=1000; i+=2) {
            result += i;
        }
        System.out.println(result);
    }
}
