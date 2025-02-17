import java.util.Scanner;

public class ContaTerminal { //classe conta

    //atributos da minha conta 
    int numeroConta;
    String agencia;
    String nomeCliente;
    Double saldoConta;

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) { //metodo main
        ContaTerminal conta = new ContaTerminal(); // Criando objetivo da classe conta

        conta.lerContaCliente();
        conta.lerAgenciaCliente();
        conta.lerNomeCliente();
        conta.lerSaldoCliente();
        conta.escreverDadosCliente();
    }

    public int lerContaCliente() { // metodo 
        System.out.print("Digite o número de sua conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
        return numeroConta;
    }

    public String lerAgenciaCliente() { // metodo 
        System.out.print("Digite sua agência: ");
        agencia = scanner.nextLine();
        return agencia;
    }

    public String lerNomeCliente () { // metodo 
        System.out.print("Digite seu nome completo: ");
        nomeCliente = scanner.nextLine();
        return nomeCliente;
    }

    public double lerSaldoCliente () {
        System.out.print("Digite o saldo de sua conta: ");
        saldoConta = scanner.nextDouble();
        return saldoConta;
    }

    public void escreverDadosCliente () {
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
    }

}