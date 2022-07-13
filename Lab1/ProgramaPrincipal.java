public class ProgramaPrincipal {
  public static void main(String[] args) {
    Imovel im1;
    im1 = new Imovel();

    im1.nQuartos = 2;
    im1.nBanheiros = 1;
    im1.temGaragem = false;
    im1.endereco = "Rua dos Fulanos, n.0";
    im1.aluguel = true;
    im1.valorVenda = 142000;

    im1.imprimeDados();
    im1.valoriza(0.025); // formatting: 1 = 100%, 0.1 = 10%
    im1.imprimeDados();

    System.out.println(im1.calculaImposto());

    System.out.println(""); // pula linha

    Imovel im2 = im1;
    if (im1 == im2) {
      System.out.println("Mesmos imoveis!");
    } else {
      System.out.println("Imoveis distintos!");
    } // imprime mesmos imoveis

    System.out.println(""); // pula linha

    Imovel im3 = im1;

    im3.valorVenda = 0;
    im3.imprimeDados();
    im1.imprimeDados();
    // ambos retornam 0 como valor de venda, im3 altera im1 por referencia
    // Imovel im3 = new Imovel(im1); para copiar informacoes em
    // um novo objeto

  }
}
