package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here - adoost
        System.out.println(canSpell2("hapseadoost","ostehaps"));
    }
    /*public static boolean canSpell(String letters, String word) {
        boolean spell = true;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(!letters.contains(String.valueOf(letter))) {
                spell = false;
                break;
            }else{
                letters = letters.replaceFirst(String.valueOf(word.charAt(i)),"");
            }
        }
        return spell;
    }*/

    public static boolean canSpell2(String bogstavsBunken, String ordSomViBygger){

        //der skal findes så mange bogstaver
        int antalBogstaverIOrdet = ordSomViBygger.length()+1;
        for (int i = 0; i < ordSomViBygger.length(); i++) {
            //System.out.println(ordSomViBygger.charAt(i));
            //tjekke om bogstavet findes i bunken
            char bogStavSomViErIgangMed = ordSomViBygger.charAt(i);
            for (int j = 0; j < bogstavsBunken.length(); j++) {
                if (bogStavSomViErIgangMed == bogstavsBunken.charAt(j)) {
                    //bogstav findes
                    //fjerne den fra bunken
                    System.out.println(bogstavsBunken + " før sletning.");
                    bogstavsBunken = bogstavsBunken.substring(0,j)+""+bogstavsBunken.substring(j+1);
                    System.out.println((bogstavsBunken + " efter sletning."));
                    antalBogstaverIOrdet = antalBogstaverIOrdet -1;
                    System.out.println("så mange bogstaver mangler at blive fundet endnu: "+antalBogstaverIOrdet);
                }
            }
        }
        return antalBogstaverIOrdet == 0;
        // Afgør hvor mange bogstaver du vil finde (ord.lenth)
        // Gennemløb alle bogstaver i ordet (loop)
            //Gennemløb bunken og led efter det givne bogstav
                //Hvis fundet, slet fra bunken
                //Og marker, at nu er der et mindre bogstav der skal findes
        // Hvis alle bogstaver er fundet (dvs. at der er 0 tilbage) så return true, ellers return false
    }
}
