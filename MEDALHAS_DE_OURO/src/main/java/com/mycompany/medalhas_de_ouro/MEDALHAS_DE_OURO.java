
package com.mycompany.medalhas_de_ouro;

import java.util.Scanner;

public class MEDALHAS_DE_OURO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double ouro = 0;
        double prata = 0;
        double bronze = 0;
        double totalMedalhas = 0;
        
        
        System.out.println("Digite a quantidade de medalhas de OURO:");
        ouro = scanner.nextDouble();
        
        System.out.println("Digite a quatidade de medalhas de PRATA:");
        prata = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de medalhas de BRONZE:");
        bronze = scanner.nextDouble();
        
        totalMedalhas = ouro + prata + bronze; 
        
        System.out.println("O total de medalhas foram" + totalMedalhas);
        
        if ( ouro >=10){
            System.out.println("OTIMO DESEMPENHO");
        }
        else if ( ouro >=5 && ouro <=10 ){
            System.out.println("BOM DESEMPENHO");
        }
        else if ( ouro <=5 && ouro + prata + bronze >= 20){
            System.out.println("DESEMPENHO REGULAR");
        }
        else if ( ouro + prata + bronze <=20 ){
            System.out.println("DESEMPENHO FRACO");
        }
        
        
        scanner.close();
    }
}
