package app;

import java.util.ArrayList;

public class ChainageArriere{
    public static Boolean solve(ArrayList<String> bf, Br bregle, ArrayList<String> f){
        Boolean res;
        if(f.size()==0){

            res = true;
        }else{
            // TODO: add to stack
            System.out.println("faits a rechercher : " +  f.get(f.size()-1));
            String firstFait =  f.get(f.size()-1);
            if(demBut(bf, bregle, firstFait)){
                System.out.println(firstFait + " est verifie");
                bf.add(firstFait);
                f.remove(firstFait);
                res = solve(bf, bregle, f);
            }else{
                res = false;
                
                // System.out.println("echec , f = : "  + f);

            }
        }
        return res;
    }

    public static Boolean demBut(ArrayList<String> bf, Br bregle,String but){
        if(bf.contains(but)){
            return true;
        }else{
            // Br baseRegles = bregle.clone();
            boolean res =false ;
            while(bregle.countRegleChainageArriere(but) > 0  && !res){
                try {
                    Regle r = bregle.getRegleChainageArriere(but);
                    r.deactivate();

                    // if(bf.containsAll(r.action)){
                    System.out.println("faits a rechercher : " +  r.premiss);
                    
                    res = solve(bf, bregle, r.premiss);

                    // }
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
            return res;
        }
    }
}