package br.com.alura.modelos;

public class Compra {
    private final String descricao;
    private final double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = Math.max(valor, 0);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f", getDescricao(), getValor());
    }
}