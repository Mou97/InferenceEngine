package app;

import java.util.ArrayList;

public class Br {
    public ArrayList<Regle> baseRegles = new ArrayList<Regle>();
    public Br addRegle(Regle regle){
        this.baseRegles.add(regle);
        return this;
    }
    
    public String toString() {
        String result = "La base de regles :--------------\n";
        for (Regle regle : baseRegles) {
            result+= regle.toString()+ "\n"; 
        }
        result+="---------------------------------\n";
        return result;
    }

    public Regle getRegleApplicable(ArrayList<String> bf) throws Exception{
        Regle rApp = null;
        for (Regle regle : this.baseRegles) {
            if(bf.containsAll(regle.premiss) && regle.active){

                rApp = regle;
                break;
            }
        }
        if(rApp==null){
            throw new Exception("error no base"); 
        }
        return  rApp;

    }

    public int countRegleApplicable(ArrayList<String> bf){
        int counter = 0;
        for (Regle regle : this.baseRegles) {
            if(bf.containsAll(regle.premiss) && regle.active){
                counter ++;
                break;
            }
        }
        return counter;
    }
}