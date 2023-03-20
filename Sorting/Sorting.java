public class Sorting {
    public int[] selection(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < ar.length - i; j++) {
                if (ar[j] > ar[maxIndex]) {
                    maxIndex = j;
                }
            }
            // swap
            int temp = ar[maxIndex];
            ar[maxIndex] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        return ar;
    }

    public int[] insertion(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int temp = ar[i];
            int j = i - 1;
            while (j >= 0 && temp <= ar[j]) {
                ar[j + 1] = ar[j];
                j--;
            }
            // swap
            ar[j + 1] = temp;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        return ar;
    }

    public int[] bubble(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[i]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = { 5, 3, 4, 1, 2 };
        Sorting obj = new Sorting();
        // obj.selection(ar);
        // obj.insertion(ar);
        obj.bubble(ar);
    }
}
