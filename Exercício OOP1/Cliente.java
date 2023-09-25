public class Cliente {
    private String nome;
    private int codigo;

    public Cliente(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}






