package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5.000
        //(condicao) ? verdadeiro : falso;
        double salario = 4000;
        String resultado = (salario > 5000) ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }

}

