public class pattern11 {
    // 1
    // 01
    // 101
    // 0101
    // 10101
    public static void main(String[] args) {
        boolean flag;
        for (int i = 0; i < 5; i++) {
            if(i % 2 != 0){
                flag = false;
            }
            else{
                flag = true;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print((flag) ? 1 : 0);
                flag = !flag;
            }
            System.out.println();
        }
    }
}
