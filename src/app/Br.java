package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Br{
    static int nb = 0;
    public int nbr;
    public String premiss;
    public String action;
    public ArrayList<List<String>> regle = new ArrayList<List<String>>();

    {
        nb+=1;
    }

    Br(String premiss, String action){
        this.nbr = nb;
        this.regle.add(Arrays.asList(premiss.split(",")));
        this.regle.add(Arrays.asList(action.split(",")));

        
    }
    @Override
    public String toString() {
        
        return "r" +this.nbr + "--> SI: " + this.regle.get(0).toString() + " , Alors: "+ this.regle.get(1).toString();
    }

}