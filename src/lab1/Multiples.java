package lab1;

public class Multiples {

    static void main() {
        int count = multiples(1000, 3, 5);
        System.out.println(count);


    }

    public static int multiples(int n, int a, int b ) {
        int result = 0;
        for (int i = 1; i < n; i++ ){
            if (i % a == 0 || i % b == 0 ){
                result ++;
            }
        }
        return result;
    }
    public static int multiples(){
        return multiples(1000, 3, 5);
    }
}
