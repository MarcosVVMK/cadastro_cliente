public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite seu nome: ");
        String nome = System.console().readLine();
        System.out.println("Digite seu CPF: ");
        String cpf = System.console().readLine();
        System.out.println("Digite seu RG: ");
        String rg = System.console().readLine();
        System.out.println("Digite sua endereço: ");
        String endereco = System.console().readLine();
        System.out.println("Digite seu telefone: ");
        String telefone = System.console().readLine();

        Cliente cliente = new Cliente(nome, cpf, rg, endereco, telefone);

        cliente.imprimir();

        System.out.println("O cliente " + 
            cliente.getNome() + " portador do CPF " + 
            cliente.getCpf() + " e RG " + 
            cliente.getRg() + " mora no endereço " + 
            cliente.getEndereco() + " e seu telefone é " + 
            cliente.getTelefone()
        );
    }
}
