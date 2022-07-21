//import package universidade;

public class AplicacaoTestaUni {
  public static void main(String args[]) {

    static final float LIMITE_ALUNOS_POR_MONITORES = 10.0f;
    static final int NUM_ALUNOS_TURMA = 44;

    Professor prof1 = new Professor(144795, "Botânica");
    ArrayList<Monitor> monitores = new ArrayList<Monitor>();
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    Monitor m1 = new Monitor(5, true);
    monitores.add(m1);
    monitores.add(new Monitor(3, false));

    for (int i = 0; i < NUM_ALUNOS_TURMA; i++)
      alunos.add(i, (i / 10.0f) + 4.0f);

    Turma t1 = new Turma(prof1, monitores, alunos);

    int nAlunos = t1.getNumAlunos();
    int nMonitores = t1.getNumMonitores();
    float razaoAlunosMonitores = nAlunos / nMonitores;
    if (nMonitores != 0) {
      if (razaoAlunosMonitores > LIMITE_ALUNOS_POR_MONITORES)
        System.out.println("Precisa de mais monitores.");
      else
        System.out.println("Quantidade de monitores suficiente.");
    }

    Professor prof2 = new Professor();
    prof2.setId(12000);
    prof2.setDepartamento("Genetica");

    Turma t2 = new Turma();
    t2.setProfessor(prof2);
    t2.setMonitores(monitores);
    t2.setAlunos(alunos);
    t2.adicionaAluno(new Aluno(340993, 8.5f));
    t2.get(5).aumentaIndiceDesempenho(0.5f);
    t2.get(2).diminuiIndiceDesempenho(0.3f);
    t2.adicionaAluno(new Aluno(378941, 9.2f));
    t2.removeAluno();
    t2.imprimeAlunos();
  }
}
