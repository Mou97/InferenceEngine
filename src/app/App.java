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
        Regle r1 = new Regle("K,L", "K,j");
        Regle r2 = new Regle("E", "K,j");
        Br bRegle = new Br();
        bRegle.addRegle(r1).addRegle(r2);
       
        ChainageAvant.solve(bf,bRegle,f);

        // prints
        // System.out.println(bf.toString());
        // System.out.println(br.toString());
        // System.out.println(bRegle);
    }
}