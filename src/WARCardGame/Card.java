package WARCardGame;

public class Card {
	
	private String name;
	private int value;
	

	
	public Card(String name, int value) {
		this.setName(name);
		this.setValue(value);
	}
	
	public void describe(){
		System.out.println(toString());
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return Card.class.getSimpleName() + " [name=" + name +", value=" + value + "]";
	}
	
	
	
	

}
