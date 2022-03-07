package desafio01;

import java.util.Arrays;
import java.util.Scanner;

public class mediana{
    public static void main(String[] args) {
        int vetor [] = new int [5];
        Scanner numero = new Scanner(System.in);

        for(int n = 0; n < vetor.length;n++){
            System.out.println("Digite " + n + "° numero: ");
            vetor[n] = numero.nextInt();
        }

        Arrays.sort(vetor);
        int x = (vetor.length - 1)/2;
        if(vetor.length%2 == 1){
            System.out.println("A mediana da sequência é " + vetor[x]);
        }
    }
}