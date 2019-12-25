package app;

import java.util.ArrayList;

public class ChainageAvant{
    public static void solve(ArrayList<String> bf,Br bRegle,String f){
        
        try {
            bRegle.getRegleApplicable(bf);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        // System.out.println(!bf.contains(f));

        // while (!bf.contains(f) ) {


        //     System.out.println(bf.contains(f));
        // }
    }
}


// System.out.println();
