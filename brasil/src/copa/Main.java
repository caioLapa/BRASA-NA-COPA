package copa;

public class Main {
    public static void main(String[] args) {
        Jogador richa = new Jogador("Richarlison", 2);
        Brasil brasil = new Brasil();
        brasil.addGoleador(richa);
        brasil.quemFezGol();
    }
}