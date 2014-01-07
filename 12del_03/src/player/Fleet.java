package player;

public class Fleet extends Ownable {
	private int RENT_1=500, RENT_2=1000, RENT_3=2000, RENT_4=4000;


	public Fleet(int price, Player owner) {
		super(price,owner);

	}


	@Override
	public int getRent() {
		int amount = owner.getFleet();
		int rent=0;
		switch(amount) {
		
		case 1: rent = RENT_1;
		break;
		case 2: rent = RENT_2;
		break;
			
		case 3: rent = RENT_3; 
		break; 
		
		case 4: rent = RENT_4; 
		break; 
		
			
		}
		return rent; 
		
	}

	

	
}
