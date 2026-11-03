public class L10 {
    public String nome, email, cpf;
    public int idade;


    public void andar() {
        System.out.println(nome + " está andando!");
    }

    public void comer() {
        System.out.println(nome + " está comendo!");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo!");
    }

    public void falar() {
        System.out.println(nome + " está falando!");
    }

    public L10(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

}