package br.lpm.business;

public class Motorista {
    protected String nome;
    protected int id;
    protected static int cont = 0;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public Motorista(String nome) {
        this.nome = nome;
        this.id = ++cont;
    }

    @Override
    public String toString() {
        return "DADOS DO MOTORISTA : " +
                "\n Nome : " + nome +
                "\n Id : " + id +
                "\n";
    }

    
}
