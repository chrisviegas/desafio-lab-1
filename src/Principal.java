import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar produto");
        System.out.println("(2) sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        Loja loja = null;

        switch (opcao) {
            case 1:
                System.out.print("Nome da loja: ");
                String nomeLoja = sc.next();
                System.out.print("Quantidade de funcionários: ");
                int qtdFuncionarios = sc.nextInt();
                System.out.print("Salário base dos funcionários: ");
                int salarioBase = sc.nextInt();

                System.out.println("Endereço da loja: ");
                System.out.print("Nome da rua: ");
                String nomeRua = sc.next();
                System.out.print("Cidade: ");
                String cidade = sc.next();
                System.out.print("Estado: ");
                String estado = sc.next();
                System.out.print("País: ");
                String pais = sc.next();
                System.out.print("CEP: ");
                String cep = sc.next();
                System.out.print("Número: ");
                String numero = sc.next();
                System.out.print("Complemento: ");
                String complemento = sc.next();
                Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                System.out.println("Data de fundação da loja: ");
                System.out.print("Dia: ");
                int dia = sc.nextInt();
                System.out.print("Mês: ");
                int mes = sc.nextInt();
                System.out.print("Ano: ");
                int ano = sc.nextInt();
                Data dataLoja = new Data(dia, mes, ano);

                System.out.print("Qual o tamanho do estoque de produtos da loja? ");
                int tamanhoEstoque = sc.nextInt();

                loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, enderecoLoja, dataLoja, tamanhoEstoque);
            case 2:
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.next();
                System.out.print("Preço do produto: ");
                int precoProduto = sc.nextInt();

                System.out.println("Data de validade do produto: ");
                System.out.print("Dia: ");
                int diaValidade = sc.nextInt();
                System.out.print("Mês: ");
                int mesValidade = sc.nextInt();
                System.out.print("Ano: ");
                int anoValidade = sc.nextInt();
                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                Produto produto = new Produto(nomeProduto, precoProduto, dataValidade);
                System.out.println("Produto criado: " + produto);
                if (produto.estaVencido(new Data(20, 10, 2023))) {
                    System.out.println("CUIDADO! O produto está vencido.");
                } else {
                    System.out.println("O produto está dentro do prazo de validade.");
                }
            case 3:
                if (loja != null){
                    System.out.println("---- Informações da sua loja ----");
                    System.out.println("Gastos com salário: " + loja.gastosComSalario());
                    System.out.println("Tamanho da loja: " + loja.tamanhoDaLoja());
                }
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");

        }
    }
}