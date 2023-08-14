package com.example.exercicios2.bancario;

public class conta {
    private int id;
    private double saldo;
    private String titular;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacar(double valorSaque){
        this.saldo = saldo - valorSaque;
    }

    public void depositar(double valorSaque){
        this.saldo = saldo + valorSaque;
    }

    public void Conta(int id, String titular, double saldo){

    }

}
