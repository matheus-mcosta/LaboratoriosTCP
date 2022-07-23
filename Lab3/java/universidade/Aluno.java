package universidade;

public class Aluno {
  private int numeroMatricula;
  private float indiceDesemprenho;

  public Aluno(int numeroMatricula, float indiceDesemprenho) {

    this.numeroMatricula = numeroMatricula;
    this.indiceDesemprenho = indiceDesemprenho;

    // System.out.println(".() aluno criado");
  }

  public void aumentaIndiceDesempenho(float aumento) {
    this.indiceDesemprenho += aumento;
  }

  public void diminuiIndiceDesempenho(float deceremento) {
    this.indiceDesemprenho -= deceremento;
  }

  public void imprime() {
    System.out.println(
        "Matricula: " + this.numeroMatricula + "Indice Desempenho:" + this.indiceDesemprenho);
  }

  public void setIndiceDesempenho(float indiceDesemprenho) {
    this.indiceDesemprenho = indiceDesemprenho;
  }

  public int getNumeroMatricula() {
    return this.numeroMatricula;
  }

  public float getIndiceDesempenho() {
    return this.indiceDesemprenho; 
  }
}
