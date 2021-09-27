
package atp11;

import java.util.Scanner;

public class atp {
    public static void main(String[] args) {
        // void é uma "função" que não retorna nada
        // main primeira função executada
        Scanner scan = new Scanner(System.in);
        // System.in ler a entrada do terminal

        byte opcao;
        /*
         * Byte é um dos tipos de dados integrais em computação. É usado com frequência
         * para especificar o tamanho ou quantidade da memória ou da capacidade de
         * armazenamento
         */

        char deveContinuar = 'S';
        // Variável que guarda caracteres (string)

        do {
            System.out.println("Bradesco financiamentos");
            System.out.println("\t 1- Crédito Pessoal");
            System.out.println("\t 2- Crédito Imobiliário");
            System.out.println("\t 3- Crédito Empresarial");
            System.out.println("\t 4- Crédito Consignado");
            opcao = Byte.parseByte(scan.nextLine());
            // convertendo a linha digitada pelo usuário em byte

            switch(opcao){
                case 1: 
                System.out.println("Crédito Pessoal");
                break;

                case 2:
                System.out.println("Crédito Imobiliário");
                break;

                case 3:
                System.out.println("Crédito Empresarial");
                break;

                case 4: 
                System.out.println("Crédito Consignado");
                break;

                default: 
                System.out.println("O número digitado não está entre as opções válidas");
                break;
            }
            if (opcao > 0 && opcao < 5){
                do{
                    System.out.println("Para voltar, digite 'V' e para continuar digite 'S': ");
                    deveContinuar = scan.nextLine().toUpperCase().charAt(0);
                }while (deveContinuar!='V' && deveContinuar!='S');
            }

        } while (opcao < 1 || opcao > 4 || deveContinuar == 'V');
        
        System.out.printf("Obrigado");

        scan.close();
    }
}
