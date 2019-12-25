package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Br{
    static int nb = 0;
    public int nbr;
    public ArrayList<String> premiss = new ArrayList<String>();
    public ArrayList<String> action = new ArrayList<String>();
    {
        nb+=1;
    }

    Br(String premiss, String action){
        this.nbr = nb;
        // this.regle.add(Arrays.asList(premiss.split(",")));
        // this.regle.add(Arrays.asList(action.split(",")));
        this.premiss.addAll(Arrays.asList(premiss.split(",")));
        this.action.addAll(Arrays.asList(action.split(",")));

        
    }
    @Override
    public String toString() {
        
        return "r" +this.nbr + "--> SI: " + this.premiss.toString() + " , Alors: "+ this.action.toString();
    }

}