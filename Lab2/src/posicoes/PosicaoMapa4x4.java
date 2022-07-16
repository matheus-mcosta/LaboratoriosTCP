package posicoes;

public class PosicaoMapa4x4 { // atributos
  private int x;
  private int y;
  private static int numPosicoesOcupadas;

  // inicializa o objeto com valores padrao
  public PosicaoMapa4x4() {
    reset();
    numPosicoesOcupadas++;
  }

  // inicializa o objeto com valores inseridos
  public PosicaoMapa4x4(int x, int y) {
    this.x = x;
    this.y = y;
    numPosicoesOcupadas++;
  }

  public boolean setX(final int x) {
    if (x >= 0 && x < 4) {
      this.x = x;
      return true;
    }
    return false;
  }

  public boolean setY(final int y) {
    if (y >= 0 && y < 4) {
      this.y = y;
      return true;
    }
    return false;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  // retorna total de objetos criados
  public static int getNumPosicoesOcupadas() {
    return numPosicoesOcupadas;
  }

    // retorna um objeto com os valores do atributos 
  public PosicaoMapa4x4 copy() {
    final PosicaoMapa4x4 p = new PosicaoMapa4x4(this.x, this.y);
    return p;
  }

  public void imprime() {
    System.out.println("(" + x + ", " + y + ")");
  }

  // distancia entre dois pontos
  public double distancia(final PosicaoMapa4x4 p) {
    return (double) Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
  }

  private void reset() {
    this.x = 0;
    this.y = 0;
  }

  public static boolean estaoMesmaPosicao(final PosicaoMapa4x4 f, final PosicaoMapa4x4 s) {
    if (f.getX() == s.getX() && f.getY() == s.getY()) {
      return true;
    }
    return false;
  }
}
