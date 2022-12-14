import java.util.ArrayList;

public class Farmacia {

        private String nome;
        private String cnpj;
        private String endereco;

        private ArrayList<Cliente> cliente = new ArrayList<>();

        private Estoque estoque = Estoque.getInstance();


    public Farmacia(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarMedicamento(Medicamento medicamento) throws ExisteMedicamentoException {

        estoque.insereMedicamento(medicamento);
    }

    public void cadastrarCliente(Cliente cliente){

        this.cliente.add(cliente);
    }

    public ArrayList<Medicamento> listaMedicamento(){

        return this.estoque.getListaMedicamento();

    }


    public ArrayList<Cliente> listaClientes() {

        ArrayList<Cliente> novaLista = new ArrayList<>(cliente);
        return novaLista;
    }
}
