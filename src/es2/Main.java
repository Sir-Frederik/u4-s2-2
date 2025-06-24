package es2;

import java.util.ArrayList;
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
    return  numberList;
}

public static ArrayList invertList(ArrayList lista) {
    ArrayList <Integer> oppositeList = new ArrayList<>();
for (int i=lista.size()-1; i>=0; i--) {
    oppositeList.add ((Integer) lista.get(i));

}

    return oppositeList;
}
    public static void main(String[] args) {

        ArrayList <Integer> numberList = new ArrayList<>();
        numberList= makeList();
        System.out.println(numberList);
        System.out.println("Ora ti inverto tutto, guarda:");
        System.out.println(invertList(numberList));



    }

}
