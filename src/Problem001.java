public class Problem001 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println("Num: " + i);
                soma += i;
            }
        }
        System.out.println();
        System.out.println("SOMA: " + soma);
    }
}
