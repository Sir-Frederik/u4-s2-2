package es1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> wordSet = new HashSet<>();
        System.out.println("Ciao, dimmi un numero intero ");
        String input = scanner.nextLine();
        int numero = Integer.parseInt(input);
        System.out.println(" Perfetto, ora inserisci "+numero + " parole");
        for (int i = 0; i <numero; i++){
            System.out.println("Inserisci la parola numero "+ (i+1)+ "/" +numero);
            String parola = scanner.nextLine();
            wordSet.add(parola);
        }
        System.out.println( "LE parole diverse che hai inserito sono: " + wordSet.size() + " ovvero:");

        System.out.println(wordSet);
    }

}
