package poo.Desafio2;

public class Transacao {
    protected char tipo;
    protected double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() { return tipo; }

    public double getValor() {
        return valor;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
