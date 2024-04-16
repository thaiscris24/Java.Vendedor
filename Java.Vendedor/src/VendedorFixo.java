public class VendedorFixo extends Vendedor {
    private double salarioFixo;

    public VendedorFixo(double salarioFixo, String nome) {
        super(nome);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}