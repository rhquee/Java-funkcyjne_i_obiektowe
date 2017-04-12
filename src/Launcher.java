public class Launcher {

    public static void main(String[] args) {
//        System.out.println("Hello a");
    }
//
//    static boolean czy() {
//        System.out.println("123");
//        return false;
//    }
//
//    static boolean czy1() {
//        System.out.println("321");
//        return true;
//    }
//
//
//        static {
//            boolean czy = true;
//            //if(czy) vs if(czy())
//            if (czy()) {
//               // System.out.println("321");
//                czy1();
//            }
//        }
//        static{
//            boolean czy = true;
//            if(czy() && czy1());


    static {
        System.out.println(max_list(new int[]{1, 2, 3, 5, 4, 3}));
    }

    /**
     * Znajdź największy element z listy.
     * Jaka optymalizacja?
     */
    public static int max_list(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            int f = 0;
//                while(max<ar[i] && f==0){
//                    max=ar[i];
//                    f=1;
            if (max < ar[i]) {
                max = ar[i];
            }
            //lub
            //max = ar[b]>max ? ar[b] : max;
        }
        return max;
    }

}