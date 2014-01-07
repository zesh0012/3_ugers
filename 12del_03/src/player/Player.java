package player;

public class Player {

	private String name;
	private Account balance;
	private int fieldNum,fleetamount,laboramount;

	// konstruktør til at oprette en spiller der har en konto
	public Player(String name, Account balance, int fieldNum) {

		this.name = name;
		this.balance = balance;
		this.fieldNum = fieldNum;
		fleetamount=0;
		laboramount=0;
	}
	public int getFleet(){
		return fleetamount;
	}
	public int getLabor(){
		return laboramount;
	}
	public int updateFleet(){
		fleetamount=fleetamount+1;
			return fleetamount;
	}
	public int updateLabor(){
		laboramount=laboramount+1; 
		return laboramount;
	}
	//tælleren til antallet af runder i jail
	public int getJailcount(){
		return jailcount;
	}
	public int updatejailcount(){
		jailcount=jailcount+1; 
		return jailcount;
	}
	public int restartjailcount(){
		jailcount=0; 
		return jailcount;
	}
	
	public Account getPlayerAcc() {

		return balance;
	}

	public String getPlayerName() {

		return name;
	}

	public int updateFieldNum(int diceSum){
		if(fieldNum+diceSum>21){
			fieldNum=diceSum-(21-fieldNum);
			return fieldNum;
		}
		else {
			fieldNum=fieldNum+diceSum;
			return fieldNum;
			
		}
	
		
	}
	public int getFieldNum(){
		return fieldNum; 
	}

	public String toString() {
		TUI tui = new TUI();

		String stringresult;

		stringresult = name + tui.s() + tui.currentBalance() + balance;

		return stringresult;

	}
}
