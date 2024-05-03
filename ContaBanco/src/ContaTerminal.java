import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int conta = Integer.parseInt(sc.nextLine());

        System.out.print("Por favor, digite o nome do Titular: ");
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nome, agencia, conta, saldo);
    }
}
