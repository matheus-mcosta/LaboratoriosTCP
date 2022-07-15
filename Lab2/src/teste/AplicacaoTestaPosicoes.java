package teste;

import java.util.ArrayList;
import java.util.Scanner;
import posicoes.PosicaoMapa4x4;

public class AplicacaoTestaPosicoes {

  static final int MAP_WIDTH = 4;
  static final int MAP_HEIGHT = 4;

  // metodo para inicializar PosicaoMapa4x4
  // para evitar repeticao no codigo da main
  private static void inicializa(PosicaoMapa4x4 p) {
    boolean vX = false, vY = false;

    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Digite o valor de x(0 a 3) do p" + PosicaoMapa4x4.getNumPosicoesOcupadas() + " : ");

    int xInput = scanner.nextInt();
    System.out.println("Digite o valor de y(0 a 3) p: ");
    int yInput = scanner.nextInt();

    vX = p.setX(xInput);
    vY = p.setY(yInput);
    // loop para verificar se ainda e falso
    while (vX == false || vY == false) {
      System.out.println("Digite um valor de x valido: ");

      xInput = scanner.nextInt();
      System.out.println("Digite um valor de y valido: ");

      yInput = scanner.nextInt();

      vX = p.setX(xInput);
      vY = p.setY(yInput);
    }
    p.imprime();
  }

  // MAIN METHOD --------------------
  public static void main(String[] args) {

    // objetos iniciados
    PosicaoMapa4x4 p1 = new PosicaoMapa4x4();
    inicializa(p1);

    PosicaoMapa4x4 p2 = new PosicaoMapa4x4();
    inicializa(p2);

    System.out.println("Distancia entre p1 e p2: " + p1.distancia(p2));

    PosicaoMapa4x4 p3 = p1.copy();

    // print if they are equal
    if (PosicaoMapa4x4.estaoMesmaPosicao(p1, p2)) {
      System.out.println("p1 e p2 estao na mesma posicao");
    }
    if (PosicaoMapa4x4.estaoMesmaPosicao(p1, p3)) {
      System.out.println("p1 e p3 estao na mesma posicao");
    }
    if (PosicaoMapa4x4.estaoMesmaPosicao(p2, p3)) {
      System.out.println("p2 e p3 estao na mesma posicao");
    }

    // create array list with p1,p2,p3
    ArrayList<PosicaoMapa4x4> lista = new ArrayList<PosicaoMapa4x4>();
    lista.add(p1);
    lista.add(p2);
    lista.add(p3);
    imprimeMapa(lista);
  }

  private static void imprimeMapa(ArrayList<PosicaoMapa4x4> lista) {
    boolean mapa[][] = new boolean[4][4]; // todos false por default

    for (PosicaoMapa4x4 p : lista) {
      mapa[p.getX()][p.getY()] = true; // passa para true todos as posicoes da lista
    }

        // percorre o mapa 4x4 e se a posicao estiver em true, print X, se nao print - 
    for (int i = 0; i < MAP_HEIGHT; i++) {
      for (int j = 0; j < MAP_WIDTH; j++) {
        if (mapa[i][j]) {
          System.out.print("X");
        } else {
          System.out.print("-");
        }
      }
      System.out.println();
    }
  }
}
