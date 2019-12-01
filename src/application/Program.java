package application;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.dao.ClienteDao;
import model.dao.DaoFactory;
import model.dao.PedidoDao;
import model.dao.ProdutoDao;
import model.dao.VendedorDao;
import model.entities.Cliente;
import model.entities.Produto;
import model.entities.Vendedor;
import model.entities.entrega.Pedido;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pedido dp = new Pedido();

		/*
		 * System.out.println(dp.getStatusPedido()); dp.setStatusPedido(new Enviado());
		 * System.out.println(dp.getStatusPedido());
		 */

		/*
		 * Pedido pd = new Pedido(); pd.addProduto(produtoDao.findById(1));
		 * pd.addProduto(produtoDao.findById(3)); pd.addProduto(produtoDao.findById(4));
		 * iterator(pd.getIterartor());
		 */

		System.out.println("Digite #1 acessar cliente.");
		System.out.println("Digite #2 acessar vendedor.");
		System.out.println("Digite #3 acessar produto.");
		System.out.println("Digite #4 acessar pedido.");
		System.out.println("Digite #5 sair.");
		int primeiraOpcao = sc.nextInt();
		do {

			switch (primeiraOpcao) {

			case 1:
				// Cliente
				ClienteDao clienteDao = DaoFactory.createClienteDao();
				System.out.println("#1 adicionar.");
				System.out.println("#2 deletar.");
				System.out.println("#3 atualizar.");
				System.out.println("#4 achar por id");
				System.out.println("#5 listar clientes");
				System.out.println("#6 para voltar");
				int opcaoCliente = sc.nextInt();
				sc.nextLine();

				do {
					switch (opcaoCliente) {
					case 1:
						// add
						System.out.println("Digite os dados: ");
						System.out.println("Nome: ");
						String nome = sc.nextLine();
						System.out.println("Email: ");
						String email = sc.nextLine();
						Cliente cliente = new Cliente(nome, email, null);
						clienteDao.insert(cliente);
						System.out.println("Cadastramento Completo! ID : " + cliente.getId());
						break;
					case 2:
						// delete
						System.out.println("Digite ID: ");
						int id = sc.nextInt();
						clienteDao.delete(id);
						System.out.println("Delete completo!");
						break;
					case 3:
						// att
						System.out.println("Digite o ID para atualizar: ");
						int idAtt = sc.nextInt();
						sc.nextLine();
						Cliente clienteAtt = clienteDao.findById(idAtt);
						System.out.println("Dados do cliente: " + clienteAtt);
						System.out.println("Insira os dados: ");
						System.out.println("Nome : ");
						String nomeAtt = sc.nextLine();
						System.out.println("Email : ");
						String emailAtt = sc.nextLine();
						Cliente clienteAtt2 = null;
						if (nomeAtt.isEmpty() && emailAtt.isEmpty()) {
							System.out.println("Sem informações nova!");
						} else if (!nomeAtt.isEmpty() && !emailAtt.isEmpty()) {
							clienteAtt2 = new Cliente(nomeAtt, emailAtt, clienteAtt.getId());
							clienteDao.update(clienteAtt2);
							System.out.println("Atualização completa!");
						} else if (emailAtt.isEmpty()) {
							clienteAtt2 = new Cliente(nomeAtt, clienteAtt.getEmail(), clienteAtt.getId());
							clienteDao.update(clienteAtt2);
							System.out.println("Atualização completa!");
						} else {
							clienteAtt2 = new Cliente(clienteAtt.getNome(), emailAtt, clienteAtt.getId());
							clienteDao.update(clienteAtt2);
							System.out.println("Atualização completa!");
						}

						break;
					case 4:
						// Buscar
						System.out.println("Digite ID : ");
						int findId = sc.nextInt();
						System.out.println("Resultado: ");
						cliente = clienteDao.findById(findId);
						System.out.println(cliente);
						break;
					case 5:
						// List
						List<Cliente> clienteList = clienteDao.findAll();
						System.out.println("Resultado: ");
						for (Cliente a : clienteList) {
							System.out.println(a);
						}

						break;
					case 6:

						break;
					default:
						System.out.println("Valor Invalido");
						break;
					}
					System.out.println("###################################");
					System.out.println("#1 adicionar.");
					System.out.println("#2 deletar.");
					System.out.println("#3 atualizar.");
					System.out.println("#4 achar por id");
					System.out.println("#5 listar clientes");
					System.out.println("#6 para voltar");
					opcaoCliente = sc.nextInt();
					sc.nextLine();
				} while (opcaoCliente != 6);
				break;

			case 2:
				VendedorDao vendedorDao = DaoFactory.createVendedorDao();
				System.out.println("#1 adicionar.");
				System.out.println("#2 deletar.");
				System.out.println("#3 atualizar.");
				System.out.println("#4 achar por id");
				System.out.println("#5 listar clientes");
				System.out.println("#6 para voltar");
				int opcaoVendedor = sc.nextInt();
				sc.nextLine();
				do {

					switch (opcaoVendedor) {
					case 1:
						// add
						System.out.println("Digite os dados: ");
						System.out.println("Nome: ");
						String nome = sc.nextLine();
						System.out.println("Email: ");
						String email = sc.nextLine();
						Vendedor vendedor = new Vendedor(nome, email, null);
						vendedorDao.insert(vendedor);
						System.out.println("Cadastramento Completo! ID : " + vendedor.getId());
						break;
					case 2:
						// delete
						System.out.println("Digite ID: ");
						int id = sc.nextInt();
						vendedorDao.delete(id);
						System.out.println("Delete completo!");
						break;
					case 3:
						// att
						System.out.println("Digite o ID para atualizar: ");
						int idAtt = sc.nextInt();
						sc.nextLine();
						Vendedor vendedorAtt = vendedorDao.findById(idAtt);
						System.out.println("Dados atual do vendedor: " + vendedorAtt);
						System.out.println("Insira os dados: ");
						System.out.println("Nome : ");
						String nomeAtt = sc.nextLine();
						System.out.println("Email : ");
						String emailAtt = sc.nextLine();
						Vendedor vendedorAtt2 = null;
						if (nomeAtt.isEmpty() && emailAtt.isEmpty()) {
							System.out.println("Sem informações nova!");
						} else if (nomeAtt.isEmpty()) {
							vendedorAtt2 = new Vendedor(vendedorAtt.getNome(), emailAtt, vendedorAtt.getId());
							vendedorDao.update(vendedorAtt2);
							System.out.println("Atualização completa!");
						} else if (emailAtt.isEmpty()) {
							vendedorAtt2 = new Vendedor(nomeAtt, vendedorAtt.getEmail(), vendedorAtt.getId());
							vendedorDao.update(vendedorAtt2);
							System.out.println("Atualização completa!");
						} else {
							vendedorAtt2 = new Vendedor(nomeAtt, emailAtt, vendedorAtt.getId());
							vendedorDao.update(vendedorAtt2);
							System.out.println("Atualização completa!");
						}
						break;
					case 4:
						// encontrar
						System.out.println("Digite ID : ");
						int findId = sc.nextInt();
						System.out.println("Resultado: ");
						vendedor = vendedorDao.findById(findId);
						System.out.println(vendedor);
						break;
					case 5:
						// list
						List<Vendedor> vendedorList = vendedorDao.findAll();
						System.out.println("Resultado: ");
						for (Vendedor a : vendedorList) {
							System.out.println(a);
						}
						break;
					case 6:

						break;
					default:
						System.out.println("Valor invalido!");
						break;
					}
					System.out.println("###################################");
					System.out.println("#1 adicionar.");
					System.out.println("#2 deletar.");
					System.out.println("#3 atualizar.");
					System.out.println("#4 achar por id");
					System.out.println("#5 listar vendedores");
					System.out.println("#6 para voltar");
					opcaoVendedor = sc.nextInt();
					sc.nextLine();
				} while (opcaoVendedor != 6);
				break;
			case 3:
				ProdutoDao produtoDao = DaoFactory.createProdutoDao();
				System.out.println("###################################");
				System.out.println("#1 adicionar.");
				System.out.println("#2 deletar.");
				System.out.println("#3 atualizar.");
				System.out.println("#4 achar por id");
				System.out.println("#5 listar vendedores");
				System.out.println("#6 para voltar");
				int opcaoProduto = sc.nextInt();
				sc.nextLine();
				do {
					switch (opcaoProduto) {
					case 1:
						// add
						System.out.println("informações: ");
						System.out.println("Nome: ");
						String nome = sc.nextLine();
						System.out.println("Preço:  ");
						Double preco = sc.nextDouble();
						sc.nextLine();
						System.out.println("Descrição: ");
						String descricao = sc.nextLine();
						System.out.println("Quantidade: ");
						Integer quantidade = sc.nextInt();
						Produto produto = new Produto(nome, preco, descricao, null, quantidade);
						produtoDao.insert(produto);
						System.out.println("Cadastramento Completo! Codigo : " + produto.getCodigo());
						break;
					case 2:
						// delete
						System.out.println("Digite Codigo: ");
						int codigo = sc.nextInt();
						produtoDao.delete(codigo);
						System.out.println("Delete completo!");
						break;
					case 3:
						// att

						System.out.println("Digite o codigo para atualizar: ");
						int codigoAtt = sc.nextInt();
						sc.nextLine();
						Produto produtoAtt = produtoDao.findById(codigoAtt);
						System.out.println("Informações atual do Produto: " + produtoAtt);
						System.out.println("Digite as informações: ");
						System.out.println("Nome : ");
						String nomeAtt = sc.nextLine();
						System.out.println("Preço : ");
						Double precoAtt = sc.nextDouble();
						sc.nextLine();
						System.out.println("Descrição: ");
						String descricaoAtt = sc.nextLine();
						Produto produtoAtt2 = null;
						System.out.println("Quantidade: ");
						Integer quantidadeAtt = sc.nextInt();
						if (nomeAtt.isEmpty() && (precoAtt == null) && descricaoAtt.isEmpty()
								&& (quantidadeAtt == null)) {
							System.out.println("Sem informações nova!");
						} else if (nomeAtt.isEmpty() && (precoAtt == null) && descricaoAtt.isEmpty()) {
							produtoAtt2 = new Produto(produtoAtt.getNome(), produtoAtt.getValor(),
									produtoAtt.getDescriçao(), quantidadeAtt, produtoAtt.getCodigo());
							produtoDao.update(produtoAtt2);
							System.out.println("Atualização completa!");
						} else if (nomeAtt.isEmpty() && (precoAtt == null) && (quantidadeAtt == null)) {
							produtoAtt2 = new Produto(produtoAtt.getNome(), produtoAtt.getValor(), descricaoAtt,
									produtoAtt.getQuantidade(), produtoAtt.getCodigo());
							produtoDao.update(produtoAtt2);
							System.out.println("Atualização completa!");
						} else if (nomeAtt.isEmpty() && descricaoAtt.isEmpty() && (quantidadeAtt == null)) {
							produtoAtt2 = new Produto(produtoAtt.getNome(), precoAtt, produtoAtt.getDescriçao(),
									produtoAtt.getQuantidade(), produtoAtt.getCodigo());
							produtoDao.update(produtoAtt2);
							System.out.println("Atualização completa!");
						} else if ((precoAtt == null) && descricaoAtt.isEmpty() && (quantidadeAtt == null)) {
							produtoAtt2 = new Produto(nomeAtt, produtoAtt.getValor(), produtoAtt.getDescriçao(),
									produtoAtt.getQuantidade(), produtoAtt.getCodigo());
							produtoDao.update(produtoAtt2);
							System.out.println("Atualização completa!");
						} else {
							System.out.println(
									"Você pode mudar apenas uma Informação, por tanto caso necessite troca outra informação, precisará acessar o iten 3 novamente");
						}

						break;
					case 4:
						// encontrar
						System.out.println("Digite ID : ");
						int findCodigo = sc.nextInt();
						System.out.println("Resultado: ");
						produto = produtoDao.findById(findCodigo);
						System.out.println(produto);
						break;
					case 5:
						// list
						List<Produto> produtoList = produtoDao.findAll();
						System.out.println("Resultado: ");
						for (Produto a : produtoList) {
							System.out.println(a);
						}
						break;
					case 6:
						break;
					default:
						System.out.println("Valor invalido!");
						break;
					}
					System.out.println("###################################");
					System.out.println("#1 adicionar.");
					System.out.println("#2 deletar.");
					System.out.println("#3 atualizar.");
					System.out.println("#4 achar por id");
					System.out.println("#5 listar produto");
					System.out.println("#6 para voltar");
					opcaoProduto = sc.nextInt();
					sc.nextLine();
				} while (opcaoProduto != 6);
				break;
			case 4:
				PedidoDao pedidoDao = DaoFactory.createPedidoDao();
				System.out.println("###################################");
				System.out.println("#1 Criar pedido.");
				System.out.println("#2 deletar.");
				System.out.println("#3 atualizar.");
				System.out.println("#4 achar por id");
				System.out.println("#5 listar pedido");
				System.out.println("#6 para voltar");
				int opcaoPedido = sc.nextInt();
				sc.nextLine();
				do {
					switch (opcaoPedido) {
					case 1:
						// Criar
						ClienteDao clienteDao2 = DaoFactory.createClienteDao();
						VendedorDao vendedorDao2 = DaoFactory.createVendedorDao();
						System.out.println("Informações para o pedido:");
						System.out.println("Cliente dono do pedido: ");
						System.out.println("Digite o ID: ");
						int idCliente = sc.nextInt();
						Cliente clientePedido = clienteDao2.findById(idCliente);
						System.out.println("Vendedor do pedido: ");
						System.out.println("Digite o ID: ");
						int idVendedor = sc.nextInt();
						Vendedor vendedorPedido = vendedorDao2.findById(idVendedor);
						Pedido pedido = new Pedido(null, clientePedido,vendedorPedido );
						pedidoDao.insert(pedido);
						System.out.println("Cadastramento Completo! codigo : " + pedido.getCodigo());
						break;
					}
					System.out.println("###################################");
					System.out.println("#1 Criar pedido.");
					System.out.println("#2 deletar.");
					System.out.println("#3 atualizar.");
					System.out.println("#4 achar por id");
					System.out.println("#5 listar pedido");
					System.out.println("#6 para voltar");
					opcaoPedido = sc.nextInt();
					sc.nextLine();
				} while (opcaoPedido != 6);
				break;
			case 5:

				break;
			default:
				System.out.println("Valor invalido!");

			}
			System.out.println("###################################");
			System.out.println("Digite #1 acessar cliente.");
			System.out.println("Digite #2 acessar vendedor.");
			System.out.println("Digite #3 acessar produto.");
			System.out.println("Digite #4 acessar pedido.");
			System.out.println("Digite #5 sair.");
			primeiraOpcao = sc.nextInt();
		} while (primeiraOpcao != 5);
		sc.close();
	}

	private static void iterator(Iterator iterato) {
		while (iterato.hasNext()) {
			Produto produto = (Produto) iterato.next();
			System.out.println(produto);
		}
	}
}
