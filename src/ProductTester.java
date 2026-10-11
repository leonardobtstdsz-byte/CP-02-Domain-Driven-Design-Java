import java.util.Locale;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        int maxSize;

        // Seis produtos iniciais: quatro parametrizados e dois padrão
        Produto p1 = new Produto(101, "CD Jazz Classics", 20, 34.90);
        Produto p2 = new Produto(102, "DVD Documentario Natureza", 12, 45.50);
        Produto p3 = new Produto(103, "Software Editor de Imagens", 8, 129.90);
        Produto p4 = new Produto(104, "Livro Algoritmos em Java", 15, 79.90);
        Produto p5 = new Produto();
        Produto p6 = new Produto();

        // Cadastro do produto p1
        System.out.println("===== Cadastro do produto p1 =====");

        System.out.print("Nome do produto: ");
        tempName = in.nextLine();

        System.out.print("Quantidade em estoque: ");
        tempQty = in.nextInt();

        System.out.print("Preço: ");
        tempPrice = in.nextDouble();

        System.out.print("Número do item: ");
        tempNumber = in.nextInt();

        p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        // Limpa o buffer antes de ler o nome do produto p2
        in.nextLine();

        // Cadastro do produto p2
        System.out.println("\n===== Cadastro do produto p2 =====");

        System.out.print("Nome do produto: ");
        tempName = in.nextLine();

        System.out.print("Quantidade em estoque: ");
        tempQty = in.nextInt();

        System.out.print("Preço: ");
        tempPrice = in.nextDouble();

        System.out.print("Número do item: ");
        tempNumber = in.nextInt();

        p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);

        // Marca p1 como descontinuado
        p1.setAtivo(false);

        // Exibe os seis produtos iniciais
        System.out.println("\n===== Produtos iniciais =====\n");

        System.out.println(p1);
        System.out.println();

        System.out.println(p2);
        System.out.println();

        System.out.println(p3);
        System.out.println();

        System.out.println(p4);
        System.out.println();

        System.out.println(p5);
        System.out.println();

        System.out.println(p6);
        System.out.println();

        // Solicita a quantidade de produtos adicionais
        do {
            System.out.println(
                    "Insira o número de produtos que gostaria de adicionar:"
            );
            System.out.println(
                    "Insira \"0\" (zero) se não quiser adicionar mais produtos:"
            );

            maxSize = in.nextInt();

            if (maxSize < 0) {
                System.out.println("Valor incorreto inserido");
            }

        } while (maxSize < 0);

        // Trata a quantidade informada
        if (maxSize == 0) {
            System.out.println("Não há produtos!");

        } else {

            Produto[] produtos = new Produto[maxSize];

            // Preenche o array com os dados fornecidos pelo usuário
            for (int i = 0; i < maxSize; i++) {

                // Limpa o buffer antes de ler o nome
                in.nextLine();

                System.out.println(
                        "\n===== Produto adicional "
                        + (i + 1) + " de " + maxSize + " ====="
                );

                System.out.print("Nome do produto: ");
                tempName = in.nextLine();

                System.out.print("Quantidade em estoque: ");
                tempQty = in.nextInt();

                System.out.print("Preço: ");
                tempPrice = in.nextDouble();

                System.out.print("Número do item: ");
                tempNumber = in.nextInt();

                produtos[i] = new Produto(
                        tempNumber,
                        tempName,
                        tempQty,
                        tempPrice
                );
            }

            // Exibe os produtos do array usando for-each
            System.out.println("\n===== Produtos adicionais cadastrados =====\n");

            for (Produto produto : produtos) {
                System.out.println(produto);
                System.out.println();
            }
        }

        // Fecha o Scanner
        in.close();
    }
}
