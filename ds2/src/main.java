import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente pf = new PessoaFisica("Vitor", 1234567891 , "Rua da minha casa", 171, 987456789 );
        Cliente pj = new PessoaFisica("Vitor", 98764321 , "Rua da minha empresa", 987, 11239832);

        Produto computador = new Produto();
        computador.setNomeProduto("Dell");
        computador.setQuantidade(10);
        computador.setPreco(1000);


        Produto computador1 = new Produto();
        computador1.setNomeProduto("Samsung");
        computador1.setQuantidade(5);
        computador1.setPreco(1500);


        Produto computador2 = new Produto();
        computador2.setNomeProduto("MacBook");
        computador2.setQuantidade(7);
        computador2.setPreco(3000);


        Produto computador3 = new Produto();
        computador3.setNomeProduto("Lenovo");
        computador3.setQuantidade(5);
        computador3.setPreco(2000);

        System.out.println(computador);
        System.out.println(computador1);
        System.out.println(computador2);
        System.out.println(computador3);
        System.out.println("Qual Produto:");
        int produto = sc.nextInt();
        System.out.println("Quantidade do Produto:");
        int qtt = sc.nextInt();

        if(produto == 1){
            System.out.println("Pedido Realizado ");
            System.out.println(pj);
            System.out.println(computador.getNomeProduto());
            computador.valorPedido(qtt);

        }else if(produto == 2){
            System.out.println("Pedido Realizado ");
            System.out.println(pj);
            System.out.println(computador1.getNomeProduto());
            computador1.valorPedido(qtt);

        }else if(produto == 3){
            System.out.println("Pedido Realizado ");
            System.out.println(pf);
            System.out.println(computador2.getNomeProduto());
            computador2.valorPedido(qtt);

        }else if(produto == 4){
            System.out.println("\nPedido Realizado ");
            System.out.println(pf);
            System.out.println(computador3.getNomeProduto());
            computador3.valorPedido(qtt);

        }else {
            System.out.println("Não temos o produto");
        }
    }
}
