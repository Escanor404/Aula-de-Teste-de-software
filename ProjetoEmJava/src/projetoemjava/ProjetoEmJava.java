package projetoemjava;

import java.util.Scanner;

public class ProjetoEmJava {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o nome completo: ");
    
    String nomeCompleto = entrada.nextLine(); //Utilizada para digitar a variável nomeCompleto no programa
    System.out.print("Digite a idade: ");
    
    int idade = entrada.nextInt(); //Utilizada para digitar a variável idade no programa
    System.out.print("Digite a altura: ");
    
    float altura = entrada.nextFloat(); //Utilizada para digitar a altura nome no programa
    System.out.println();
    
    System.out.println("Nome completo: " + nomeCompleto);//Imprime o que o usuário digitar
    
    System.out.println("Altura: " + altura); //Imprime o que o usuário digitar
    
    System.out.println("Idade: " + idade); //Imprime o que o usuário digitar
    
    entrada.close();
  }
    
}
