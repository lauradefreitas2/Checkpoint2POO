public class Medicamento implements Comparable<Medicamento>{
    private String nome;
    private Double valor;
    private String tarja;

    public Medicamento(String nome, Double valor, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tarja = tipo;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public String getTipo() {
        return tarja;
    }



    @Override
    public String toString() {
        return "{" + "nome: " + this.nome + "," +"valor: " + this.valor + "}" ;
    }


    @Override
    public int compareTo(Medicamento o) {
        return this.getNome().compareTo(o.getNome());
    }
}
