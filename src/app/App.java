package app;
import java.util.ArrayList;

import app.Br;
import app.ChainageAvant;

public class App {
    public static void main(String[] args) throws Exception {
        String f = "E";

        // base de faits
        ArrayList<String> bf = new ArrayList<String>();
        bf.add("E");
        bf.add("B");

        // base de regles
        Br br = new Br("F,C", "K,j");
        Br br2 = new Br("A,B", "D,L");

        // ChainageAvant.solve(bf,br,f);

        // prints
        // System.out.println(bf.toString());
        System.out.println(br.toString());
        System.out.println(br2.toString());
        // System.out.println(f);
    }
}