                         
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(){
	    System.out.println("Criando uma conta");
	}

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("estou criando uma conta " + this.numero);
    }
	
	public static void main(String args[]){
	    Conta conta = new Conta(123,456);
	    
	    public class Conta{
	    	   //outros atributos omitidos
	    	   private static int total = 0;

	    	   //outros métodos omitidos
	    	}
	    
	    public static int getTotal(){
	        return Conta.total;
	    }
	    
	    System.out.println(Conta.getTotal());
	    
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void saca(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		}
	}

	public void deposita(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getTotal() {
		
	}

}
       