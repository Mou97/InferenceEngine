package app;
import java.util.ArrayList;

import app.Br;
import app.ChainageAvant;

public class App {
    public static void main(String[] args) throws Exception {
        String f = "H";

        // base de faits
        ArrayList<String> bf = new ArrayList<String>();
        bf.add("C");
        bf.add("B");

        // base de regles
        Regle r1 = new Regle("B,D,E", "F");
        Regle r2 = new Regle("G,D", "A");
        Regle r3 = new Regle("C,F", "A");
        Regle r4 = new Regle("B", "X");
        Regle r5 = new Regle("D", "E");
        Regle r6 = new Regle("X,A", "H");
        Regle r7 = new Regle("C", "D");
        Regle r8 = new Regle("X,C", "A");
        Regle r9 = new Regle("X,B", "D");



        Br bRegle = new Br();
        bRegle.addRegle(r1).addRegle(r2).addRegle(r3).addRegle(r4).addRegle(r5).addRegle(r6).addRegle(r7).addRegle(r8).addRegle(r9);
       

        // Print base de faits;
        System.out.println(bRegle.toString());

        // Chainage avant
        ChainageAvant.solve(bf,bRegle,f);


        // prints
        // System.out.println(bf.toString());
        // System.out.println(br.toString());
        // System.out.println(bRegle);
    }
}