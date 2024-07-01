package poo.Desafio;

public class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMetodoAbertura() {
        return metodoAbertura;
    }

    public void setMetodoAbertura(String metodoAbertura) {
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}
