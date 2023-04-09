import java.util.Scanner;

/**
 * scannerProgram
 */
public class scannerProgram {
  public static void main(String[] args) {
    // Read the favorite movie of the person
    try (Scanner read = new Scanner(System.in)) {
      System.out.println("Digite seu filme favorito.");
      String movie = read.nextLine();

      System.out.println("Digite o ano de lançamento.");
      int year = read.nextInt();

      System.out.println("Digite sua avaliação para o filme de 0 a 5");
      double rate = read.nextDouble();

      System.out.println(String.format("Sua nota para %s lançado em %d é de %.1f", movie, year, rate));
    } catch (Error error) {
      System.err.println(error.getMessage());
    }
  }
}