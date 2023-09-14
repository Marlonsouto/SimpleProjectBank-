package model.entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withDraw) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDraw;	
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithDraw() {
		return withDrawLimit;
	}

	public void setWithDraw(Double withDraw) {
		this.withDrawLimit = withDraw;
	}
	
	public void deposit (Double amount) {
		if (amount < 0.0 ){
			System.out.println("error in your request");
		} else {
			balance+= amount; 
		}
	}
	
	public void withdraw (Double amount){
		if(amount<balance && amount < 0 && amount > withDrawLimit) {
			System.out.println("sorry, there was a error in your request.");
		}else{
			balance-= amount;	
		}
	}
	
	
	
	
	

}
