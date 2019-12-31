package app;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import app.Br;
import app.ChainageAvant;

public class App {
     // base de faits pour Chainage avant
    public static ArrayList<String> bf = new ArrayList<String>();
     // base de faits pour Chainage arriere
    public static ArrayList<String> bf2 = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        // fait
        String f = new String();
        ArrayList<String> fVal = new ArrayList<String>();
       
       
        // base de regles
        Br bRegle = new Br();

        // read date from file
        readFromFile( fVal,  bf,  bRegle );
        // workaround for global string variable problem
        f+=fVal.get(0);

        // print base de faits
        System.out.println(bf.toString());

        // Print base de regles;
        System.out.println(bRegle.toString());


        System.out.println("Chainage Avant: -------------------\n");


        // // Chainage avant
        ChainageAvant.solve(bf,bRegle,f);

        System.out.println("--------------------------------------\n--------------------------------------");

        // Chainage arriere
        System.out.println("Chainage Arriere: --------------------\n");

        System.out.println("Base des faits ---> " + bf2.toString() +"\n");

        // reactivate all rules   
        bRegle.init();
        System.out.println(ChainageArriere.solve(bf2, bRegle, fVal));
        
        System.out.println( ChainageArriere.solve(bf2, bRegle, fVal)? "La regle " + f + " est etabli": "La regle " + f + " n'est pas etabli" );

        System.out.println("Base des faits apres l'application du chainage arriere: \n" + bf2.toString() +"\n");
        



        // prints
        // System.out.println(br.toString());
        // System.out.println(bRegle);
    }

    public static void readFromFile(ArrayList<String> f, ArrayList<String> bf, Br bRegle){
        BufferedReader reader;
        
        try {
            reader = new BufferedReader(new FileReader("data/in.txt"));
            // read first line 
            String line = reader.readLine();
            f.add(line.strip());
            
            // read second line
            line = reader.readLine();
            bf.addAll(Arrays.asList(line.split(",")));
            bf2.addAll(Arrays.asList(line.split(",")));
            

            line= reader.readLine();
            
            Regle r ;
            String [] temp ;
            while(line !=null){
                temp = line.trim().split("\\s+");
                r = new Regle(temp[0].trim(), temp[1].trim());
                bRegle.addRegle(r);
                line= reader.readLine();  

            }
            reader.close();
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}