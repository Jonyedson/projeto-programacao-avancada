package application;

import java.util.Scanner;

import model.entities.Cliente;
import model.entities.Produto;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 para cadastrar cliente.");
		System.out.println("Digite 2 para cadastrar vendedor.");
		System.out.println("Digite 3 para cadastrar produto.");
		int x = sc.nextInt();
		System.out.println("#########################################\n");
		sc.nextLine();
		do {
			switch(x) {
			case 1 :
				//Cadastramento de cliente
				System.out.println("Digite os dados do cliente:\n");
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Email: ");
				String email = sc.next();
				System.out.println("ID: ");
				int id = sc.nextInt();
				Cliente cliente = new Cliente(nome, email, id );
				System.out.println(cliente);
				System.out.println("Cadastramento completo!\n");
				break;
			case 2 :
				System.out.println("Digite os dados do vendedor:\n");
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Email: ");
				email = sc.next();
				System.out.println("ID: ");
				id = sc.nextInt();
				Vendedor vendedor = new Vendedor(nome,email,id);
				System.out.println(vendedor);
				System.out.println("Cadastramento completo!\n");
				break;
			case 3 :
				System.out.println("Digite os dados do produto:\n");
				System.out.println("Nome: ");
				nome = sc.nextLine();
				System.out.println("Preço: ");
				Double preco = sc.nextDouble();
				System.out.println("Descrição: ");
				sc.nextLine();
				String descricao = sc.nextLine();
				Produto produto = new Produto(nome, preco, descricao);
				System.out.println(produto);
				System.out.println("Cadastramento completo!\n");
				break;
				
			default :
				System.out.println("Valor invalido!Digite novamente");
				break;
			}
			System.out.println("#########################################\n");
			System.out.println("Digite 1 para cadastrar cliente.");
			System.out.println("Digite 2 para cadastrar vendedor.");
			System.out.println("Digite 3 para cadastrar produto.");
			
			System.out.println("\nDigite 10 para sair!");
			x = sc.nextInt();
			sc.nextLine();
			
			
			
		}while(x != 10);
		System.out.println("ok!");
		
		
		
		
		
		
		
	}

}
