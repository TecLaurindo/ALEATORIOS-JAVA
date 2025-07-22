import java.util.Scanner;

// Tela de Aluno passar de ano
public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String nome ;
        double media ;
        double soma;

        System.out.print("Escreva o nome Do aluno(a): ");
        String leia = scanner.nextLine() ;

        System.out.print(" Nota do 1° Bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota do 2° Bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota do 3° Bimeste: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Nota do 4° Bimeste: ");
        double nota4 = scanner.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4 ;
        media = soma /4 ;
        System.out.println("Aluno teve média "+ media + "% e foi" );
        if (media >= 6) {
            System.out.println("aprovado.");
        } else {
            System.out.println("reprovado.");
        }

        scanner.close();

    }
}