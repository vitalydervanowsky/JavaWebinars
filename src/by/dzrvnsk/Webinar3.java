package by.dzrvnsk;

public class Webinar3 {
    // Task 3
    /*public static void main(String[] args) {
        int length = 5;
        int[] a;
        Webinar3 w = new Webinar3();
        a = w.input(length);
        w.print(a);
        w.sort(a);
        w.print(a);
    }
    public int[] input(int l) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите " + l + " чисел:");
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("initializing of array...");
        return arr;
    }
    public void print(int[] arr) {
        System.out.println("result:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.println();
            } else {
                System.out.print(" | ");
            }
        }
    }
    public void sort(int[] arr) {
        System.out.println("sorting...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }*/

    // Task 4
    public static void main(String[] args) {
        Webinar3 w = new Webinar3();
        int news = 45;
        System.out.println((int)w.paginate(news));
    }
    public double paginate(int a) {
        double newsOnPage = 10;
        return Math.ceil(a / newsOnPage);
    }
}
