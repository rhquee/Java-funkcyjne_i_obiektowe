package zadania;

/**
 * Created by RENT on 2017-04-13.
 * //zadanie: chcemy zliczac instancje danej klasy
 */
public class MyCounterClass {
    static int counter; //dawniej "wiek"
    private int creationID;

    public MyCounterClass(){
        creationID = counter;
        this.counter = counter;
        MyCounterClass.counter++;
        int a = counter++ + --counter + counter++;
    }

    public static void main() {
        System.out.println(counter);
        System.out.println(counter);
        new MyCounterClass();
        System.out.println(counter);
    }
    public int getCounter(){
        System.out.println(counter);
        return counter;
    }

}
