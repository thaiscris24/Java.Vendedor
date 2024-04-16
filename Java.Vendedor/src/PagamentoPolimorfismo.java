public class PagamentoPolimorfismo {
    public static void main(String[] args) {
        VendedorComissionado vendedorUm = new VendedorComissionado(10000, 0.05, "João");
        VendedorFixo vendedorDois = new VendedorFixo(2000, "Maria");

        System.out.println("Vendedores processados individualmente:\n");
        System.out.printf("%s \n%s: $%,.2f \n\n", vendedorUm, "salário", vendedorUm.calcularSalario());
        System.out.printf("%s \n%s: $%,.2f \n\n", vendedorDois, "salário", vendedorDois.calcularSalario());

        Vendedor vendedores[] = new Vendedor[2];
        vendedores[0] = vendedorUm;
        vendedores[1] = vendedorDois;

        System.out.println("Vendedores processados utilizando POLIMORFISMO\n");

        for (Vendedor vendedorCorrente : vendedores) {
            System.out.println(vendedorCorrente);
            System.out.printf("salário: $%,.2f\n\n", vendedorCorrente.calcularSalario());
        }
    }
}