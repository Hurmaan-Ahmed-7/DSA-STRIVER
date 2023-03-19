public class pattern10 {
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            int no_of_stars = i + 1;
            if(i > 4){
                no_of_stars = 9 - i;
            }
            for (int j = 1; j <= no_of_stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
