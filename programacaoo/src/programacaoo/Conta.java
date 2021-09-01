package programacaoo;

/**
 *
 * @author Gabriel Vilanova
 */
public class Conta {

    private int conta;
    private int agencia;
    private String nomePessoa;
    private double saldo;
    
    public Conta(int agencia, int conta, String nomePessoa, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.nomePessoa = nomePessoa;
        this.saldo = saldo;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "Conta: " + this.conta + "\nSaldo: " + Tools.formataValor(this.saldo);
    }
    
    public void sacar(double valor){
        double saldoNovo = this.saldo - valor;
        this.saldo -= valor;
    }
    
    //criar o método para depósito em conta
    public void deposito(double valor){
        this.saldo += valor;
    }

    //método para transferencia entre duas contas
    public void transferir(Conta conta2, double valor){
        sacar(valor);
        conta2.deposito(valor);
       
    }
    
    public void transferencia(Conta transferencia, double v) {
        try {
            sacar(v);
            transferencia.deposito(v);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }    
    
}
