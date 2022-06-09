
public class Bank {
	
	int Amount=10000;
	int TA;
	
	synchronized void withdraw(int amount){
		System.out.println("Withdraw Request");
		
		if(Amount<amount){
			System.out.println("unsufficent balance!!");
			try{wait();}catch(Exception e){}
			}
		else if(Amount>amount){
			System.out.println("now you can withdraw");
			
			try{wait();}catch(Exception e){}
			}
		
		
		TA=Amount-amount;
		
		
		if(amount<=Amount) {
			System.out.println("withdraw completed");}
		
			else {
				System.out.println("withdraw not completed");
			}
			
		
		//System.out.println("withdraw completed");
		    
		}
	
	synchronized void deposit(int depositAmount){
		System.out.println("going to deposit");
		Amount+=depositAmount;
		if (depositAmount>=1) {
			System.out.println("deposit completed");
		}
		notify();
		}
	}
class Display{
	public static void main(String args[]) throws InterruptedException{
		final Bank bank=new Bank();
		new Thread(){
			public void run(){
				bank.withdraw(11000);
				}
			}.start();
			new Thread(){
				public void run(){
					
					bank.deposit(1000);
					}
				}.start();
				}
	}    