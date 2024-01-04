package com.br.ebac.controller;

import java.util.Scanner;

public class ExercicioEbac {

	    public static void main(String[] args) {
	    
	    	 Scanner scanner = new Scanner(System.in);

	    	
	    	  while (true) {
	           
	              System.out.print("Digite a nota do aluno (ou -1 para sair): ");
	              double nota = scanner.nextDouble();

	         
	              if (nota == -1) {
	                  System.out.println("Encerrando o programa.");
	                  break;
	              }

	             
	              if (nota >= 7.0) {
	                  System.out.println("Aprovado!");
	              } else if (nota >= 5.0 && nota < 7.0) {
	                  System.out.println("Recuperação!");
	              } else if (nota >= 0.0 && nota < 5.0) {
	                  System.out.println("Reprovado!");
	              } else {
	                  System.out.println("Nota inválida. Por favor, insira uma nota válida de 0 a 10.");
	              }
	          }

	       
	          scanner.close();
	      }
	}
