package br.com.alura.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private final double limite;
    private double saldo;
    private final List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = Math.max(limite, 0);
        this.saldo = this.limite;
        compras = new ArrayList<>();
    }

    public boolean comprando(Compra compra) {
        if (saldo >= compra.getValor()) {
            compras.add(compra);
            this.saldo -= compra.getValor();
            System.out.println("Compra realizada!\n");
            return true;
        } else {
            System.out.println("\nSaldo insuficiente!");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}