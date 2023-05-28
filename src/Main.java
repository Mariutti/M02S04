import entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
    }
}

// Ex 1 - Crie um novo projeto no intelliJ para uma aplicação java.
// Ex 2 - Crie um Package (pasta / pacote) com nome entidades.
// Ex 3 - Crie classes com o nome Produto, ProdutoUsado e ProdutoImportado no pacote entidades.
// Ex 4 - Crie um novo arquivo (se não houver no projeto inicial) contendo um método main().
// Ex 5 - No método main() crie uma Lista para armazenar os produtos.
//TODO Ex 6 - O Programa vai receber as informações referentes aos tipos de produto.
//TODO Ex 7 - Percorrer a lista de produtos e chamar o método pra mostrar as informações dos produtos.
//TODO Ex 8 - o programa deve ter saída desse modo.
//        Entre com o número de produtos: 3
//        dados Produto#1:
//        Comum, usado ou importado(c/u/i)? i
//        Nome: Tablet
//        Preço: 260.00
//        Taxa: 20.00
//        dados Produto#2:
//        Comum, usado ou importado(c/u/i)? c
//        Nome: Notebook
//        Preço: 1100.00
//        dados Produto#3:
//        Comum, usado ou importado(c/u/i)? u
//        Nome: Iphone
//        Preço: 400.00
//        Data de fabricação (DD/MM/YYYY): 15/03/2017
//        Amostragem de preço dos produtos:
//        Tablet R$ 280.00 (Taxa: R$ 20.00)
//        Notebook R$ 1100.00
//        Iphone (usado) R$ 400.00 (Data de fabricação: 15/03/2017