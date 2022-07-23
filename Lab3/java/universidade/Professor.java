package universidade;

public class Professor {
  private int id;
  private String departamento;

  // construtores

  public Professor() {
    this.id = -1;
    this.departamento = "";
    System.out.println("Placeholder para Professor criado");
  }

  public Professor(int id, String departamento) {
    this.id = id;
    this.departamento = departamento;

    System.out.println("id: "+ this.id + " - departamento: " + this.departamento);
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public int getId() {
    return this.id;
  }
  public String name() {
    return this.departamento;
  }
}
