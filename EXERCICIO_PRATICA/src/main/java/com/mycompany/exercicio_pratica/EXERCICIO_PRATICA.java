
package com.mycompany.exercicio_pratica;

import java.util.Scanner;

public class EXERCICIO_PRATICA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media = 0;
        
        
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a seugunda nota:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextDouble();
        
        
        media = (nota1 + nota2 + nota3)/ 3;
        
        if(media >=6){
            System.out.println("APROVADO");
        }
        
        else{
            System.out.println("REPROVADO");
        }
        
        System.out.println("Sua media vai ser de " + media);
        
        scanner.close();
             
    }
}
