package academy.devdojo.maratonajava.introducao;

/**
 Prática
 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o sálario de <salário>, na data <data>
 */

 public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Leonardo Bertogna Sia";
        String endereco = "Rua da Felicidade, 1000, Alegria, Americana-SP";
        double salario = 2079.53;
        String dataRecebimento = "15/08/2024";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimento;
        System.out.printf(relatorio);
    }
}
