package entidades;

public class ProdutoImportado extends Produto {
    private Double taxa;

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Tipo de produto: Importado\n" +
                "Nome: " + this.getNome() + "\n" +
                "Preco: R$ " + this.getPreco() + "\n" +
                "Taxa (%): " + taxa + "\n";
    }
}
