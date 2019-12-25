package app;
import java.util.ArrayList;

import app.Br;

public class App {
    public static void main(String[] args) throws Exception {
        String f = "H";

        // base de faits
        ArrayList<String> bf = new ArrayList<String>();
        bf.add("E");
        bf.add("B");

        // base de regles
        Br br = new Br("F,C", "K,j");
        System.out.println(br.toString());
        System.out.println(bf.toString());
        System.out.println(f);
        
    }
}