public class Rpg {

    public String nome, classe;
    public int dano, vida;

    public Rpg(String nome, String classe, int dano, int vida) {
        this.nome = nome;
        this.classe = classe;
        this.dano = dano;
        this.vida = vida;
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Dano: " + dano);
        System.out.println("Vida: " + vida);
    }

}