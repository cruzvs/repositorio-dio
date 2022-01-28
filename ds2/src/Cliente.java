import java.util.Set;


public abstract class Cliente {
    String nome ;
    int docs;
    String endereco;
    int numero;
    int telefone;

    public String toString(){
        return "Cliente: " + nome + "\n"+
                "Documentos: " + docs +"\n"+
                "Endereço: " + endereco +"\n"+
                "Numero: " + numero +"\n"+
                "Telefone: " + telefone;
    }



}

