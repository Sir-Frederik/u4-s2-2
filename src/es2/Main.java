package es2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
public static ArrayList makeList() {
    Scanner scanner = new Scanner(System.in);
    HashSet<String> wordSet = new HashSet<>();
    System.out.println("Ciao, dimmi un numero intero ");
    String input = scanner.nextLine();
    int numero = Integer.parseInt(input);
    ArrayList <Integer> numberList = new ArrayList<>(numero);
    for (int i=0; i<numero; i++){
        int casualNumber = (int) (Math.random() * 101);
        numberList.add(casualNumber);


    }
//    Collection.sort(numberList);
    numberList.sort(null);
    return  numberList;
}

public static ArrayList invertList(ArrayList lista) {
    ArrayList <Integer> oppositeList = new ArrayList<>();
    for (int i=0; i < lista.size()-1; i++){
        oppositeList.add ((Integer) lista.get(i));
    }
for (int i=lista.size()-1; i>=0; i--) {
    oppositeList.add ((Integer) lista.get(i));

}

    return oppositeList;
}


public static  void  halfList (ArrayList lista, boolean pari){
    if (!pari){
      for (int i =0; i< lista.size(); i = i+2) {
          System.out.println(lista.get(i));
      }

    }
    else {
        for (int i =1; i< lista.size(); i = i+2) {
            System.out.println(lista.get(i));
        }

    }


}
    public static void main(String[] args) {

        ArrayList <Integer> numberList = new ArrayList<>();
        numberList= makeList();
        System.out.println(numberList);
        System.out.println("Ora ti stampo un array gaussiano, guarda:");
        System.out.println(invertList(numberList));
        System.out.println("Ora ti stampo i numeri  in base alla loro posizione  pari o dispari nella prima lista ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 1 per indicare che vuoi le posizioni dispari, oppure 2 se le vuoi pari");
        String input = scanner.nextLine();
        int numero = Integer.parseInt(input);
        boolean pari= true;
        if (numero == 1){
            pari = false;

        }else {
            pari= true;
        }
        halfList(numberList, pari);


    }

}
