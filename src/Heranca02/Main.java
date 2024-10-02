package Heranca02;

public class Main {
    public static void main(String[] args) {
        // Criando um vendedor
        Vendedor vendedor = new Vendedor("Ariane Silva", "123.456.789-00", "10/11/1992", "20/01/2021", 3000.00, 15.0); // percentual de comissão
        
        // Criando um gerente
        Gerente gerente = new Gerente("Carlos Oliveira", "987.654.321-00", "05/06/1988", "01/08/2020", 7000.00, "Marketing");
        
        // Criando um cliente
        Cliente cliente = new Cliente("Weeliton Almeida", "456.789.123-00", "15/05/1995", "weeliton.almeida@email.com", "67890", "015987654321");
        
        // Exibindo as informações do vendedor
        System.out.println("Vendedor:");
        System.out.println("Nome: " + vendedor.getNome()); 
        System.out.println("CPF: " + vendedor.getCpf());
        System.out.println("Data de Nascimento: " + vendedor.getDataNascimento()); 
        System.out.println("Data de Contratação: " + vendedor.getDataContratacao()); 
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Percentual de Comissão: " + vendedor.getPercentualComissao()); 
        System.out.println();
        
        // Exibindo as informações do gerente
        System.out.println("Gerente:"); 
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Data de Nascimento: " + gerente.getDataNascimento());
        System.out.println("Data de Contratação: " + gerente.getDataContratacao());
        System.out.println("Salário Base: " + gerente.getSalarioBase()); 
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println();
        
        // Exibindo as informações do cliente
        System.out.println("Cliente:");
        System.out.println("Nome: " + cliente.getNome()); 
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Número do Cartão de Fidelidade: " + cliente.getNumeroCartaoFidelidade());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
