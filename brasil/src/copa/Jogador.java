package copa;

public class Jogador {
    private String nome;
    private int gols;

    public Jogador(String nome, int gols) {
        this.nome = nome;
        this.gols = gols;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void addGols() {
        this.gols = (getGols()+1);
    }

}
