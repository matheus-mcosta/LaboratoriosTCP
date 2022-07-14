package teste;

import java.util.Scanner;
import posicoes.PosicaoMapa4x4;

public class AplicacaoTestaPosicoes {

  int MAP_WIDTH = 4;
  int MAP_HEIGHT = 4;

  public static void main(String[] args) {
    boolean vX, vY;

    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Digite o valor de x: ");

      int xInput = scanner.nextInt();
      System.out.println("Digite o valor de y: ");
      int yInput = scanner.nextInt();

      PosicaoMapa4x4 p1 = new PosicaoMapa4x4(xInput, yInput);
      vX = p1.setX(xInput);
      vY = p1.setY(yInput);
    } while (!vX && !vY);
  }

  /** private static void imprimeMapa(ArrayList<PosicaoMapa4x4> p) { } */
}
