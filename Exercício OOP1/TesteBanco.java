public class TesteBanco {
  public static void main(String[] args) {
      Cliente cliente1 = new Cliente("João", 123);
      Cliente cliente2 = new Cliente("Maria", 456);

      System.out.println("Cliente 1: " + cliente1.getNome() + ", Código: " + cliente1.getCodigo());
      System.out.println("Cliente 2: " + cliente2.getNome() + ", Código: " + cliente2.getCodigo());

      CartaoCredito cartao1 = new CartaoCredito(1111, "01/25");
      CartaoCredito cartao2 = new CartaoCredito(2222, "02/26");

      System.out.println("Cartão 1: Número: " + cartao1.getNumero() + ", Data de Validade: " + cartao1.getDataValidade());
      System.out.println("Cartão 2: Número: " + cartao2.getNumero() + ", Data de Validade: " + cartao2.getDataValidade());

      Agencia agencia1 = new Agencia(789);
      Agencia agencia2 = new Agencia(101112);

      System.out.println("Agência 1: Número: " + agencia1.getNumero());
      System.out.println("Agência 2: Número: " + agencia2.getNumero());
  }
}