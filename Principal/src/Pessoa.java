public abstract class  Pessoa {

String nome;
String cpf;
String endereco;

String dataNascimento;

    public Pessoa(String nome, String cpf, String endereco, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public void imprimirDadosCadastrais(){
        System.out.printf("Nome: %s, Cpf: %s, Endereço: %s, Data: %s", nome, cpf, endereco, dataNascimento);
    }


    @Override
    public String toString() {
        return this.nome + "-" + this.dataNascimento ;
    }
}
