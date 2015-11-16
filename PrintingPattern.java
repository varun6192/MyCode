public class PrintingPattern {

   
    public static void main(String[] args)
    {
       
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int k = 6; k > 1; k--) {
            for(int l = 1; l < k - 1; l++){
                System.out.print(l);
            }
            System.out.println();
        }
}
}