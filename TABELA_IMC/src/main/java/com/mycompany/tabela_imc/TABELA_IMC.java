
package com.mycompany.tabela_imc;

import java.util.Scanner;

public class TABELA_IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso = 0;
        double altura = 0;
        double imc = 0;
        
        System.out.println("Digite o seu peso em KG:");
        peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altuta em METROS:");
        altura = scanner.nextDouble();
        
        imc = peso / (altura*altura);
        
        if( imc < 18.8 ){
            System.out.println("ABAIXO DO PESO");
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.print("PESO NORMAL");
        }
        else if ( imc >= 25 && imc <= 29.9){
            System.out.println("EXCESSO DE PESO");
        }
        else if ( imc >=30 && imc <=34.9){
            System.out.print("OBESIDADE CLASSE I");
        }
        else if ( imc >=35 && imc <=39.9){
            System.out.print("OBESIDADE CLASSE II");
        }
        else if ( imc >=40){
            System.out.println("OBESIDADE CLASSE III");
        }
        
        
        scanner.close();
             
    }
}
