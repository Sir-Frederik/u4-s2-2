package es1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> wordSet = new HashSet<>();
        System.out.println("Ciao, dimmi un numero intero ");
        String input = scanner.nextLine();
        int numero = Integer.parseInt(input);
        ArrayList <String> wordList = new ArrayList<>(numero);
        ArrayList <String> duplicateList = new ArrayList<>(numero);
        System.out.println(" Perfetto, ora inserisci "+numero + " parole");
        for (int i = 0; i <numero; i++){
            System.out.println("Inserisci la parola numero "+ (i+1)+ "/" +numero);
            String parola = scanner.nextLine();

            if (!wordSet.add(parola)) {
                duplicateList.add(parola);
                }

//            wordList.add(parola);

        }
        System.out.println( "Le parole univoche che hai inserito sono: " + wordSet.size() + " ovvero:");

        System.out.println(wordSet);
        if (!duplicateList.isEmpty()){
            System.out.println("Hai immesso anche delle parole duplicate e sono: ");
            for (int i = 0; i < duplicateList.size(); i++){
                System.out.println(duplicateList.get(i));

            }

        }
    }

}
