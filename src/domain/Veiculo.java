package domain;

public  abstract class Veiculo {
    protected String nome;
    protected String marca;
    protected String cor;
    protected Boolean turbo = false;

    public Veiculo(String nome, String marca, String cor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }
}
