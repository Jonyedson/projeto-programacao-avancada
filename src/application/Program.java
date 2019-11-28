package application;

import java.util.Scanner;

import model.dao.ClienteDao;
import model.dao.DaoFactory;
import model.entities.Cliente;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ClienteDao clienteDao = DaoFactory.createClienteDao();
		Cliente cliente = new Cliente("Marcos Lucio", "marcos@gmail.com", null);
		clienteDao.insert(cliente);
		System.out.println(cliente);
		sc.close();
	}

}
