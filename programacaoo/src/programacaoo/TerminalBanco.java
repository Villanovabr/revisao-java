package programacaoo;

/**
 *
 * @author Gabriel Vilanova
 */
public class TerminalBanco {

    public static void main(String[] args){

        Conta conta1 = new Conta(1, 001, "Gabriel", 500);

        Conta conta2 = new Conta(1, 002, "Marcelo", 1000);

        //conta1.sacar(100);    
        //sacar(conta2, 100);        
        //conta1.deposito(300);
        //conta1.transferir(conta2, 100);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
   
}
