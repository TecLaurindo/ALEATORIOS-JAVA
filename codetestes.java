//iprima os fatoriais de 1 a 10.
//Forma que o chat GPT me deu como certa pra usar:

public class atv02 {
    public static void main(String[] args) {
        int fatorialInt = 1;
        for (int n = 1; n <= 15; n++) {
            fatorialInt *= n;
            System.out.println("Fatorial de " + n + " (int): " + fatorialInt);
        }

        System.out.println(); // Linha em branco para separar as saídas

        long fatorialLong = 1;
        for (int n = 1; n <= 15; n++) {
            fatorialLong *= n;
            System.out.println("Fatorial de " + n + " (long): " + fatorialLong);
        }
    }
}


