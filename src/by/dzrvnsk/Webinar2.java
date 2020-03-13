package by.dzrvnsk;

public class Webinar2 {
    public static void main(String[] args) {
        // Task 2
        float[] ar = {2, 3, 5, 7, 6, 5, 7, 3, 7, 20};
        boolean[] boolAr = new boolean[ar.length];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("ar[" + i + "] = " + ar[i] + "\t  ");
            boolAr[i] = true;
        }
        System.out.println();
        for (int i = 0; i < ar.length - 1; i++) {
            int repeated = 1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j] && boolAr[j]) {
                    boolAr[j] = false;
                    repeated++;
                }
            }
            if (repeated > 1) {
                String text = "";
                switch (repeated % 10) {
                    case 2:
                    case 3:
                    case 4:{
                        text = "раза";
                        break;
                    }
                    default: {
                        text = "раз";
                    }
                }
                System.out.println("значение " + ar[i] + " повторяется " + repeated + " " + text);
            }
        }
    }
}
