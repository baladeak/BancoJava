/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author MatheusSabino
 */
public class Conta {
    private Integer numero;
    private Double saldo;

    public Integer getNumero() {
        return numero;
    }

    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
