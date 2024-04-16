public class VendedorComissionado extends Vendedor {
    private double totalVendas;
    private double taxaComissao;

    public VendedorComissionado(double totalVendas, double taxaComissao, String nome) {
        super(nome);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return totalVendas * taxaComissao;
    }
}