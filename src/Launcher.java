import tv.TV;
import tv.TVFactory;
import zadania.MyCounterClass;

public class Launcher {

    public static void main(String[] args) {
//        MyCounterClass c = new MyCounterClass();
//        c.main();
//        c.getCounter();

////        int y = Integer.parseInt(str);
//        double pi = 3.14;
////        String s = "3.14";
//        pi = Integer.parseInt("3.14");
//        System.out.println(pi+2);
//        //assert s("3.14") == 3.14;

        TVFactory lg = new TVFactory();
        lg.create("Hotel");
    }
}