package br.edu.fatecpg.veículo.view;

import br.edu.fatecpg.veículo.model.Carro;
import br.edu.fatecpg.veículo.model.ContaBancaria;
import br.edu.fatecpg.veículo.model.Produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o chassi do carro: ");
	        String chassi = scanner.nextLine();
	        System.out.print("Digite a marca do carro: ");
	        String marca = scanner.nextLine();
	        System.out.print("Digite o modelo do carro: ");
	        String modelo = scanner.nextLine();
	        System.out.print("Digite o motor do carro (em litros): ");
	        double motor = scanner.nextDouble();
	        System.out.print("Digite a capacidade do tanque (em litros): ");
	        double capacidadeTanque = scanner.nextDouble();
	        scanner.nextLine();

	        Carro carro = new Carro(chassi, marca, modelo, motor, capacidadeTanque);

	        System.out.print("Digite o preço da gasolina por litro: ");
	        double precoGasolina = scanner.nextDouble();
	        
	        double custoEncherTanque = carro.calcularCustoEncherTanque(precoGasolina);
	        System.out.println("Custo para encher o tanque: R$ " + custoEncherTanque);
	        
	        ContaBancaria conta = new ContaBancaria("João Silva");
	        conta.depositar(1000);
	        conta.sacar(500);
	        conta.sacar(600);
	        System.out.println("Saldo final: R$ " + conta.getSaldo());
	        
	        Produto produto = new Produto("Café", 10.50, 20);
	        System.out.println("Nome: " + produto.getNome());
	        System.out.println("Preço: R$ " + produto.getPreco());
	        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());

	        produto.setPreco(-5.0); 
	        produto.setQuantidadeEstoque(-10);
	        produto.setPreco(12.0);
	        produto.setQuantidadeEstoque(30);

	        System.out.println("Preço atualizado: R$ " + produto.getPreco());
	        System.out.println("Quantidade em Estoque atualizada: " + produto.getQuantidadeEstoque());

	        scanner.close();
	    }
	}
