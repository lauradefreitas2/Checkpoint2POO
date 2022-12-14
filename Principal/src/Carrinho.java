import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();

    private Double totalPreco;

    private String formaPagamento;

    private Estoque estoque = Estoque.getInstance();

    public Carrinho() {}

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void incluirMedicamento(String nome) throws ExisteMedicamentoException {

        int indexMedicamento = estoque.buscaMedicamentoIndex(nome);

       if( indexMedicamento == -1)
           throw new ExisteMedicamentoException("Não existe medicamento em estoque");

            listaMedicamentos.add(estoque.getListaMedicamento().get(indexMedicamento));
    }

    public void removerMedicamento(Medicamento medicamento){

        listaMedicamentos.remove(listaMedicamentos.indexOf(medicamento));
    }


    public Double getTotalPreco() {

        double total = 0;

        for (int i = 0; i < listaMedicamentos.size(); i++) {

             total += listaMedicamentos.get(i).getValor();

        }
        
        return total;
    }

    public void listaMedicamentos(){

        System.out.println(listaMedicamentos);

    }
}
