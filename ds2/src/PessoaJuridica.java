public class PessoaJuridica extends Cliente{

    private static int cnpj;
    private static String endereçoEmpresa;

    PessoaJuridica(String nome, int docs, String endereco , int numero , int telefone) {
        this.nome = nome;
        this.docs = docs;
        this.endereco = endereco;
        this.numero = numero;
        this.telefone = telefone;

    }
}
