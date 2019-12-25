package app;

import java.util.ArrayList;
import java.util.Arrays;


public class Regle{
    static int nb = 0;
    public int nbr;
    public ArrayList<String> premiss = new ArrayList<String>();
    public ArrayList<String> action = new ArrayList<String>();
    public Boolean active = true;
    {
        nb+=1;
    }

    Regle(String premiss, String action){
        this.nbr = nb;
        this.premiss.addAll(Arrays.asList(premiss.split(",")));
        this.action.addAll(Arrays.asList(action.split(",")));
    }

    public void activate(){
        this.active= true;
    }

    public void deactivate(){
        this.active= false;
    }

    @Override
    public String toString() {
        
        return "r" +this.nbr + "--> SI: " + this.premiss.toString() + " , Alors: "+ this.action.toString();
    }

}