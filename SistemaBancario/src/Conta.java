public abstract class Conta implements IConta{
    
    private static int Agencia = 1;
    private static int NumeroConta  = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Agencia;
        this.numeroConta = NumeroConta++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Sacar(double valor){
        saldo -= valor;
    }

    public void Depositar(double valor){
        saldo += valor;
    }

    public void Transferir(double valor, Conta contaDestino){
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    protected void imprimirInformacao(){
        System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
