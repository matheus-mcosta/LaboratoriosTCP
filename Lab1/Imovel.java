public class Imovel {
  int nQuartos;
  int nBanheiros;
  boolean temGaragem;
  String endereco;
  boolean aluguel;
  double valorVenda;

  public void imprimeDados() {
    String str_aluguel = "Nao"; // inicializa como nao disponivel a string
    String str_temGaragem = "Nao";

    if (this.temGaragem) {
      str_temGaragem = "Sim"; // se estiver modifica para Sim a resposta
    }

    if (this.aluguel) {
      str_aluguel = "Sim";
    }

    System.out.println("Número de quartos: " + nQuartos);
    System.out.println("Quartos:" + this.nQuartos + ";");
    System.out.println("Banheiros:" + this.nBanheiros + ";");
    System.out.println("Tem garagem?:" + str_temGaragem + ";");
    System.out.println("Endereço:" + this.endereco + ";");
    System.out.println("Disponivel para aluguel?: " + str_aluguel + ";");
    System.out.println("Valor de venda:" + this.valorVenda + ";");
    System.out.println(""); // pula linha
  }

  public void valoriza(double perc) {

    this.valorVenda *= (perc + 1);
  }

  public double calculaImposto() {

    if (this.aluguel == true) {
      return this.valorVenda * 0.05 * 0.12;
    }

    return this.valorVenda * 0.18;
  }
}
