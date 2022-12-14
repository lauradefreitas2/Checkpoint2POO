import java.time.LocalDate;

public class Cliente extends Pessoa implements Comparable<Cliente>{
    private Carrinho carrinho = new Carrinho();

    public Cliente(String nome, String cpf, String endereco, String dataNascimento) {

        super(nome, cpf, endereco, dataNascimento);
    }

    public Carrinho acessarCarrinho(){

        return carrinho;
   }

    @Override
    public int compareTo(Cliente cliente) {

        return super.nome.compareTo(cliente.nome);
    }

    @Override
    public String toString() {
        return "nome: " + nome + " - " + "data nascimento: " + dataNascimento;
    }
}
