package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10; //Int e long só muda a quantidade de bytes que suporta
        long numeroGrande = 100000;
        double salarioDouble = 2000; //float e double segue a mesma logica que int e long
        float salarioFloat = 2500;
        byte idadeByte = 10; //short e byte também a mesma logica
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Goku";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("Oi meu nome é "+nome);
    }
}
