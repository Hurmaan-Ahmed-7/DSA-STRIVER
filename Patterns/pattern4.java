public class pattern4 {
    public static void main(String[] args) {
// pattern4:
// 1
// 22
// 333
// 4444
// 55555
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
