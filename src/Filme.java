//Classe (molde)
public class Filme {

        // Atributos (características)
        String nome;
        double avaliacao;
        int anoDeLancamento ;
        boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinutos;

        // Métodos (comportamentos)
        void exibeFichaTecnica() {
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoDeLancamento);
                System.out.println("Duração do filme: " + duracaoEmMinutos);
        }

        void avalia(double nota) {
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

        double pegaMedia(){
                return somaDasAvaliacoes / totalDeAvaliacoes;
        }

}
