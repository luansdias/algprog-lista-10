public class ClassePrincipal {
    public static void main(String[] args) {

        // com construtor:
        
        L10 exercicio = new L10("Luan", 24, "15151515151", "blablabla@blabla.com");

        exercicio.falar();
        exercicio.andar();
        exercicio.comer();
        exercicio.dormir();

        Supermercado supermercado = new Supermercado("Coca-Cola", 8, 2);
        supermercado.calcularTotal();

        Rpg rpg = new Rpg("Luan", "Mago", 50, 100);
        rpg.mostrarInfos();

        // sem construtor:

        Matricula matricula = new Matricula();

        matricula.nome = "Luan";
        matricula.curso = "Ciência da Computação";
        matricula.valorCurso = 1000;

        matricula.mostrarInfos();

    }
}
