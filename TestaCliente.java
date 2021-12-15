package br.com.generation.classes;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.println("=-= Cadastro de Cliente =-=\n");
		cliente1.escreverNome();
		cliente1.nome = input.nextLine();
		cliente1.escreverIdade();
		cliente1.idade = input.nextInt();
		input.nextLine(); // limpa o buffer quando o scanner lê int e depois tem que ler String (coisa de doido)
		cliente1.escreverCidade();
		cliente1.cidade = input.nextLine();
		cliente1.escreverEstado();
		cliente1.estado = input.nextLine();
		
		
		System.out.println("\n----Dados do cliente----");		
		
		System.out.println("Nome: " + cliente1.nome);
		System.out.println("Idade: " + cliente1.idade);
		System.out.println("Cidade: " + cliente1.cidade);
		System.out.println("Estado: " +cliente1.estado);
		input.close();
	
	}

}
