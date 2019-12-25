package app;

import java.util.ArrayList;

public class ChainageAvant{
    public static void solve(ArrayList<String> bf,Br bRegle,String f){
        try {
            while (!bf.contains(f) && bRegle.countRegleApplicable(bf)>0) {
                Regle regAppl =  bRegle.getRegleApplicable(bf);
                regAppl.deactivate();
                // TODO: add regApp to a stack
                System.out.println("la regle applicable est : \n"+regAppl.toString()+"\n");
                bf.addAll(regAppl.action);
                System.out.println("BF pour cet iteration:  "+ bf.toString() + "\n");

            }
            if(bf.contains(f)){
                System.out.println( "La regle: " + f + "  est etabli");
            }else{
                System.out.println( "La regle: " + f + "  n'est pas etabli");

            }
        } catch (Exception e) {
                System.out.println(e);
        }
        // System.out.println(!bf.contains(f));

       
    }
}


// System.out.println();
