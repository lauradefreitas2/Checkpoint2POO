import java.util.Scanner;

public class SistemaMain {

    public static void main(String[] args) throws ExisteMedicamentoException {

        Scanner scan = new Scanner(System.in);

        //Como a proposta do projeto estava focada em mudar a forma de compra dos clientes já cadastrados,
        //optamos por incluir os dados no sistema.

        String nomeFarmacia = "santa-rosa";
        String cnpjFarmacia = "2323232";
        String enderecoFarmacia = "Rua da Cura";

        Farmacia farmacia = new Farmacia(nomeFarmacia,cnpjFarmacia, enderecoFarmacia );
        Medicamento rivotril = new Medicamento("Rivotril", 5.65, "preta");
        Medicamento diazepan = new Medicamento("Diazepan", 8.65, "preta");
        Medicamento dipirona = new Medicamento("Dipirona", 15.65, "vermelha");
        Medicamento paracetamol = new Medicamento("Paracetamol", 13.75, "vermelha");

        farmacia.cadastrarMedicamento(rivotril);
        farmacia.cadastrarMedicamento(diazepan);
        farmacia.cadastrarMedicamento(dipirona);
        farmacia.cadastrarMedicamento(paracetamol);


        Cliente laura = new Cliente("Laura", "77658499856", "Rua do código", "12/10/2005");
        Cliente ricardo = new Cliente("Ricardo", "665473899034", "Rua API", "01/01/1991");

        // clientes já cadastrados na base de dados
        farmacia.cadastrarCliente(laura);
        farmacia.cadastrarCliente(ricardo);

        boolean fim = false;

        // sistema carrinho de compras

        while(!fim){

            System.out.println("--------------------------------");
            System.out.println("Bem vindo ao carrinho de compras");
            System.out.println("--------------------------------");

            System.out.println("Digite o nome do medicamento: ");
            String nomeMedicamento = scan.next();


            try {
                laura.acessarCarrinho().incluirMedicamento(nomeMedicamento);

            }catch (ExisteMedicamentoException e){

                System.out.println(e);
            }

            System.out.println("Lista de medicamentos:");
            laura.acessarCarrinho().listaMedicamentos();
            System.out.println("Preço parcial:");
            System.out.printf("R$: %.2f\n" , laura.acessarCarrinho().getTotalPreco());

            System.out.println("Deseja continuar a compra? | Digite (s): para continuar ou (f): para finalizar");
            String validacao = scan.next();

           if(validacao.equalsIgnoreCase("f"))  fim = true;
           if(fim){

               System.out.println("Resumo do pedido: ");
               System.out.println("------------------");
               System.out.print("Medicamentos selecionados: ");
               laura.acessarCarrinho().listaMedicamentos();
               System.out.println("Preço total:");
               System.out.printf("R$: %.2f\n" , laura.acessarCarrinho().getTotalPreco());


           }
        }

        scan.close();


    }
}
