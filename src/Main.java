public class Main {
    public static void main(String[] args) {
        tesk1();
        tesk3();
        tesk4();
    }

    private static void tesk1() {
        // Задача 1,2
        int[] aBox = new int[3];
        aBox[0] = 1;
        aBox[1] = 2;
        aBox[2] = 3;
        double[] bBox = {1.57, 7.654, 9.986};
        int[] cBox = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
        for (int i = 0; i < aBox.length; i++) {
            if (i == aBox.length - 1) {
                System.out.print(aBox[i]);
                break;
            }
            System.out.print(aBox[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < bBox.length; i++) {
            if (i == bBox.length - 1) {
                System.out.print(bBox[i]);
                break;
            }
            System.out.print(bBox[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < cBox.length; i++) {
            if (i == cBox.length - 1) {
                System.out.print(cBox[i]);
                break;
            }
            System.out.print(cBox[i] + ",");
        }
        System.out.println();
    }

    private static void tesk3() {
        //Задача 3
        int[] aBox = new int[3];
        aBox[0] = 1;
        aBox[1] = 2;
        aBox[2] = 3;
        double[] bBox = {1.57, 7.654, 9.986};
        int[] cBox = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};

        for (int i =aBox.length-1; i>=0; i--) {
            System.out.print(aBox[i] + ","); if (i==aBox[0]){System.out.print(i);break;}
        }
        System.out.println();
        for (int i = bBox.length-1; i>=0; i--) {
            System.out.print(bBox[i] + ",");if (i == bBox[0]) {System.out.print(bBox[i]);break;}
        }
        System.out.println();
        for (int i = cBox.length-1; i>=0; i--) {
            System.out.print(cBox[i] + ",");if (i == cBox[0]) {System.out.print(i);break;}
        }
        System.out.println();
    }
    private static void tesk4() {
        // Задача 4
        int[] aBox = new int[3];
        aBox[0] = 1;
        aBox[1] = 2;
        aBox[2] = 3;
        for (int i =0;i<aBox.length;i++){

            if (aBox[i]%2!=0){aBox[i]+=1;};
            if (i == aBox.length - 1) {System.out.print(aBox[i]);break;};
            System.out.print(aBox[i] + ",");
        }
    }
}








