package teste;

import java.util.Scanner;
import posicoes.PosicaoMapa4x4;

public class AplicacaoTestaPosicoes {

  int MAP_WIDTH = 4;
  int MAP_HEIGHT = 4;

  public static void main(String[] args) {
    boolean vX = false, vY = false;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor de x(0 a 3) p1: ");

    int xInput = scanner.nextInt();
    System.out.println("Digite o valor de y(0 a 3) p1: ");
    int yInput = scanner.nextInt();

    PosicaoMapa4x4 p1 = new PosicaoMapa4x4(xInput, yInput);
    vX = p1.setX(xInput);
    vY = p1.setY(yInput);
    // loop para verificar se ainda e falso
    while (vX == false || vY == false) {
      System.out.println("Digite um valor de x valido: ");

      xInput = scanner.nextInt();
      System.out.println("Digite um valor de y valido: ");

      yInput = scanner.nextInt();

      vX = p1.setX(xInput);
      vY = p1.setY(yInput);
    }
    p1.imprime();
// incializa p2
    System.out.println("Digite o valor de x(0 a 3) p2: ");

    xInput = scanner.nextInt();
    System.out.println("Digite o valor de y(0 a 3) p2: ");
    yInput = scanner.nextInt();

    PosicaoMapa4x4 p2 = new PosicaoMapa4x4(xInput, yInput);
    vX = p2.setX(xInput);
    vY = p2.setY(yInput);
    // loop para verificar se ainda e falso
    while (vX == false || vY == false) {
      System.out.println("Digite um valor de x valido: ");

      xInput = scanner.nextInt();
      System.out.println("Digite um valor de y valido: ");

      yInput = scanner.nextInt();

      vX = p2.setX(xInput);
      vY = p2.setY(yInput);
    }
    p2.imprime();
        // objetos iniciados


System.out.println("Distancia entre p1 e p2: " + p1.distancia(p2));
  }

  /** private static void imprimeMapa(ArrayList<PosicaoMapa4x4> p) { } */
}
