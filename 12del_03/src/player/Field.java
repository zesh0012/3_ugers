package player;


public abstract class Field {
	

	

	// konstruktør til Field klassen
	public Field() {

	}
	
	public abstract void landOnField(Player player,int fieldnum,Field field);

	public abstract void releaseFields(Player player);

	

}
