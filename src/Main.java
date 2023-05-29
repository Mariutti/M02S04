import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número de produtos: ");
        int rep = entrada.nextInt();
        for (int i = 0; i < rep; i++) {
            System.out.println("Cadastre o "+ (i+1)+"º produto");
            System.out.println("Comum, usado ou importado(c/u/i)? ");
            char tipo = entrada.next().toLowerCase().charAt(0);
            System.out.println("Nome do produto: ");
            String nome = entrada.next();
            System.out.println("Preço do produto: R$ ");
            Double preco = entrada.nextDouble();
            switch (tipo) {
                case 'c':
                    produtos.add(new Produto(nome, preco));
                    break;
                case 'u':
                    System.out.println("Digite a data de fabricação (DD/MM/YYYY): ");
                    String dataDeFabricacao = entrada.next();
                    produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                    break;
                case 'i':
                    System.out.println("Digite a taxa de importação: ");
                    Double taxa = entrada.nextDouble();
                    produtos.add(new ProdutoImportado(nome, preco, taxa));
                    break;
                default:
                    System.out.println("tipo não cadastrado.");
            }

        }
        System.out.println("");
        for (Produto produto : produtos){
            System.out.println((produtos.indexOf(produto)+ 1)+ "º Produto da lista: ");
            System.out.println(produto.toString());
        }

    }


}

// Ex 1 - Crie um novo projeto no intelliJ para uma aplicação java.
// Ex 2 - Crie um Package (pasta / pacote) com nome entidades.
// Ex 3 - Crie classes com o nome Produto, ProdutoUsado e ProdutoImportado no pacote entidades.
// Ex 4 - Crie um novo arquivo (se não houver no projeto inicial) contendo um método main().
// Ex 5 - No método main() crie uma Lista para armazenar os produtos.
// Ex 6 - O Programa vai receber as informações referentes aos tipos de produto.
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
//        Iphone (usado) R$ 400.00 (Data de fabricação: 15/03/2017)