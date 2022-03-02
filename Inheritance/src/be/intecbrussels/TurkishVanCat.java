package be.intecbrussels;


public class TurkishVanCat extends Felis{
	
	private String nickname;
	
	
	public TurkishVanCat() {
		
	}
	
	public TurkishVanCat(String name, int age, int shelterNo, int badgeNo, String nickname) {
		super(name, age,shelterNo, badgeNo);
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "TurkishVanCat [nickname=" + nickname + "]" + super.toString();
	}
	
	

}

