public class Problem003 {
    public static void main(String[] args) {
        int number = 13195 ;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                System.out.println(i);
            }

        }
    }
}
