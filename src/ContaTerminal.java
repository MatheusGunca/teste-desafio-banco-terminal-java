import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite a Agência:");
        String agencia = scan.next();

        System.out.println("Por favor, digite o seu nome:");
        String nome = scan.next();

        System.out.println("Por favor, digite o valor a ser depositado na sua nova conta:");
        float saldo = scan.nextFloat();

        scan.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                          " sua agência é %s, conta %s e seu saldo R$%.2f já está disponível para saque", nome, agencia, numero, saldo);
    }
    
}