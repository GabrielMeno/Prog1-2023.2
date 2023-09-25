public class CartaoCredito {
  private int numero;
  private String dataValidade;

  public CartaoCredito(int numero, String dataValidade) {
      this.numero = numero;
      this.dataValidade = dataValidade;
  }

  public void setNumero(int numero) {
      this.numero = numero;
  }

  public int getNumero() {
      return this.numero;
  }

  public void setDataValidade(String dataValidade) {
      this.dataValidade = dataValidade;
  }

  public String getDataValidade() {
      return this.dataValidade;
  }
}