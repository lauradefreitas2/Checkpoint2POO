import java.util.ArrayList;

public class Estoque {

    private static Estoque instance = new Estoque();

    private ArrayList<Medicamento> listaMedicamento = new ArrayList<>();

    private Estoque() {}

    public static Estoque getInstance(){
        return instance;
    }

    public void insereMedicamento(Medicamento medicamento)  {

        listaMedicamento.add(medicamento);
    }

    public void removerMedicamento(Medicamento medicamento){

        listaMedicamento.remove(listaMedicamento.indexOf(medicamento));
    }

    public int buscaMedicamentoIndex(String nome){

        for(int i = 0; i < listaMedicamento.size(); i++ ){

            if(listaMedicamento.get(i).getNome().equalsIgnoreCase(nome)) return i;
        }
        return -1;
    }

    public int quantidadeTarjaVermelha(){

            return contalemento("vermelha");
    }

    public int quantidadeTarjaPreta(){

        return contalemento("preta");
    }

    public int contalemento(String nome){

        int quantidade = 0;

        for(int i = 0; i < listaMedicamento.size(); i++ ){

            if(listaMedicamento.get(i).getTipo() == nome) quantidade++;
        }

        return quantidade;

    }

    public ArrayList<Medicamento> getListaMedicamento() {
        ArrayList<Medicamento> novaLista = new ArrayList<>(listaMedicamento);
        return novaLista;
    }
}
