/**
 * Created by RENT on 2017-04-12.
 */
public class Glowna {
    public void main2() { //usunelam String[] args z nawiasu
        System.out.println("Hello aaaaaaa");
        //System.err.println("123");
    }

    public static void main(String[] args) {
        Glowna g = new Glowna(); //zeby mozna bylo uzywac main2
        g.main2(); //nie ma argumentow, wiec usunac je mozna z main2
    }

}
