package br.edu.fatecpg.veículo.model;

public class ContaBancaria {
	 private double saldo;
	    private String titular;

	    public ContaBancaria(String titular) {
	        this.titular = titular;
	        this.saldo = 0.0;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public void setTitular(String titular) {
	        this.titular = titular;
	    }
	    
	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito realizado: R$ " + valor);
	        } else {
	            System.out.println("O valor do depósito deve ser positivo.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque realizado: R$ " + valor);
	        } else {
	            System.out.println("Saldo insuficiente ou valor inválido para saque.");
	        }
	    }

}
