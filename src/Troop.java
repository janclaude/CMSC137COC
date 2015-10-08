import java.awt.Image;
import java.awt.image.BufferedImage;

public class Troop implements Characters{
	private String type;
	private int health;
	private int attack;
	private BufferedImage sprite;
	
	public Troop(){
		
	}
	
	public Troop(String type){
		this.type = type;
		this.createTroop();
	}
	
	public void createTroop(){
		switch(type){
		case "barbarian":
			this.health = BARB_HP;
			this.attack = BARB_ATTACK;
			break;
		case "archer":
			this.health = ARCHER_HP;
			this.attack = ARCHER_ATTACK;
			break;
		case "mage":
			this.health = MAGE_HP;
			this.attack = MAGE_ATTACK;
			break;
		case "giant":
			this.health = GIANT_HP;
			this.attack = GIANT_ATTACK;
			break;
		case "wallbreaker":
			this.health = WB_HP;
			this.attack = WB_ATTACK;
			break;
		case "hogrider":
			this.health = HR_HP;
			this.attack = HR_ATTACK;
			break;
		case "dragon":
			this.health = DRAGON_HP;
			this.attack = DRAGON_ATTACK;
			break;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
