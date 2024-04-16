public abstract class Vendedor implements SalarioCalculavel {
    private String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome='" + nome + '\'' + '}';
    }
    @Override
    public abstract double calcularSalario();
}
