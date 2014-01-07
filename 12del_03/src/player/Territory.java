package player;

public class Territory extends Ownable {
	
	private int rent;
	
	public Territory(int price,Player owner,int rent) {
		super(price,owner);
		this.rent = rent;	
	}

	@Override
	public int getRent() {
		
		return rent;
	}

	
	


}
