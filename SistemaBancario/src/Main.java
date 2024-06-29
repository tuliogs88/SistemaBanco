public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("Gabriel");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNomeCliente("Ana");
        
        Conta cc = new ContaCorrente(cliente1);
        cc.Depositar(30);
        
        Conta cp = new ContaPoupanca(cliente2);
        cp.Depositar(80);
        cc.Transferir(5, cp);

        cc.imprimirInformacao();
        cp.imprimirInformacao();

    }
}
