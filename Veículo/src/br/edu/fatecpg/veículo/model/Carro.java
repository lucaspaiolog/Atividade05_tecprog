package br.edu.fatecpg.veículo.model;

public class Carro {
    private String chassi;
    private String marca;
    private String modelo;
    private String placa;
    private double motor;
    private boolean ligado = false;
    private double capacidadeTanque;

    public Carro(String chassi, String marca, String modelo, double motor, double capacidadeTanque) {
        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Carro ligado.");
            ligado = true;
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Carro desligado.");
            ligado = false;
        } else {
            System.out.println("Carro já está desligado.");
        }
    }

    public void andar() {
        if (ligado) {
            System.out.println("Carro está andando.");
        } else {
            System.out.println("Carro não pode andar porque está desligado.");
        }
    }

    public double calcularCustoEncherTanque(double precoGasolina) {
        return capacidadeTanque * precoGasolina;
    }
    
}


