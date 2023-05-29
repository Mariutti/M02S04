package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date dataFabricao;
    private String dataString;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(String nome, double preco, String dataString) {
        super(nome, preco);
        this.dataString = dataString;
        try {
            this.dataFabricao = sdf.parse(dataString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public Date getDataFabricao() {
        return dataFabricao;
    }

    public void setDataFabricao(Date dataFabricao) {
        this.dataFabricao = dataFabricao;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }
    @Override
    public String toString() {
        return "Tipo de produto: Importado\n" +
                "Nome: " + this.getNome() + "\n" +
                "Preco: R$ " + this.getPreco() + "\n" +
                "Data de fabricação: " + dataString + "\n";
    }
}

