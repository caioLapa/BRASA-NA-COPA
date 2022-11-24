package copa;

import java.util.ArrayList;

public class Brasil {
    private int vitorias;
    ArrayList <Jogador> goleadores = new ArrayList<>();
    private int derrotas;
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void addGoleador(Jogador a){
        goleadores.add(a);
    }
    public void quemFezGol(){
        for(Jogador j : goleadores){
            System.out.println(j.getNome() + " fez " + j.getGols() + " gols");
        }
    }
}
