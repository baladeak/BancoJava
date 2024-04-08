/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MatheusSabino
 */
public class Banco {
    public Cliente clientes;
    public Conta contas;
    //public static Integer qtdeContas = 0;

    public Banco(Cliente clientes, Conta contas) {
        this.clientes = clientes;
        this.contas = contas;
    }

    
    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Conta getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas = contas;
    }




    
}
