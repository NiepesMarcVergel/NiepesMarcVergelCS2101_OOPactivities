public class MultiplesOf7 {
    public static void main(String[] args) {
        
        for (int i = 7; i <= 35; i += 7) {
            if (i % 14 == 0) {
                
                System.out.println("\t" + i);
            } else {
                
                System.out.println(i);
            }
        }
    }
}
