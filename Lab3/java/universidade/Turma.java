package universidade;

import java.util.ArrayList;

/** Turma */
public class Turma {

  private final int NUM_ALUNOS_TURMA = 45; // especificacao do slide
  private int numAlunos;
  private int numMonitores;
  private Professor professor;
  private ArrayList<Monitor> monitores;
  private ArrayList<Aluno> alunos;

  public Turma() {
    this.numAlunos = 0;
    this.numMonitores = 0;
    this.professor = new Professor();
    this.monitores = new ArrayList<Monitor>();
    this.alunos = new ArrayList<Aluno>();
  }

  public Turma(Professor professor, ArrayList monitores, ArrayList alunos) {
    this.professor = professor;
    this.monitores = monitores;
    this.alunos = alunos;

    this.numAlunos = alunos.size();
    this.numMonitores = monitores.size();

    System.out.println("Turma com " + this.numAlunos + " e " + this.numMonitores + " monitores");
  }

  public boolean adicionaAluno(Aluno aluno) {
    if (this.numAlunos < NUM_ALUNOS_TURMA) {

      this.alunos.add(aluno);
      this.numAlunos++;
      System.out.println(this.numAlunos);
      return true;
    }
    System.out.println(this.numAlunos);
    return false;
  }

  public void removeAluno() {
    this.alunos.remove(0);
    this.numAlunos--;
  }

  public void imprimeAlunos() {

    this.alunos.forEach(
        aluno -> {
          System.out.println(
              "Matricula: "
                  + aluno.getNumeroMatricula()
                  + " - Desempenho: "
                  + aluno.getIndiceDesempenho());
        });
  }

  public int getNumAlunos() {
    return this.numAlunos;
  }

  public int getNumMonitores() {
    return this.numMonitores;
  }

  public Professor getProfessor() {
    return this.professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public ArrayList getMonitores() {
    return monitores;
  }

  public void setMonitores(ArrayList monitores) {
    this.monitores = monitores;
  }

  public ArrayList getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList alunos) {
    this.alunos = alunos;
    this.numAlunos = alunos.size();
  }
}
