package entities;

public class Account {
	
	private int number;
	private String holder;	
	private double balance;
	


public Account (int number , String holder) {
	this.number = number;
	this.holder = holder;
	
}

public Account (int number , String holder , double initialDeposit) {
	this.number = number;
	this.holder = holder;
	depositValue(initialDeposit);
	
}



public int getAccount ()  {
	return number;
}

public String getName() {
	return holder;
}

public void setName (String holder) {
	this.holder = holder;	
}



public double getBalance() {
	return balance;
}


public void depositValue (double amount) {
	balance = balance +amount;   // ou balance+=amount;
	 // variavel double amount no parametro do metodo. Porem no Program esta outra, indentificando
	// o saque e o deposito, substituindo no parametro do método.
	//apenas observação. Resultados iguais porem indetificando o valor ( amount ) para cada operação. 
	// se colocasse a variavel que esta no Program = resulto igual.
}              
//Atributo não esta repetindo o nome com uma variavel no parametro,nem metodo.
               // Entao tanto faz usar .this ou nao.

public void whitdrawValue (double amount) {
	this.balance = (this.balance - amount) - 5.00;
}




public String toString () {
	return number
	+ ", Holder : "
	+ holder
	+", Balance : $ "
	+ String.format("%.2f", balance);
}
}


