package universidade;

public class Monitor {

  private int semestreAtual;
  private boolean temExperiencia;

  public Monitor(int semestreAtual, boolean temExperiencia) {
    this.semestreAtual = semestreAtual;
    this.temExperiencia = temExperiencia;

    System.out.println("Monitor incializado com: " + this.semestreAtual + this.temExperiencia);
  }

  public void setSemestreAtual(int semestreAtual) {
    this.semestreAtual = semestreAtual;

  }
  public void setTemExperiencia(boolean temExperiencia){
    this.temExperiencia = temExperiencia;
  }

  public int getSemestreAtual() {
    return this.semestreAtual;
  }
  public boolean getTemExperiencia() {
    return this.temExperiencia;
  }

}
