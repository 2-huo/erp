package demo;

public class Foreign {
	private int fangjian;
	private String color;
	private String national;
	private String drink;
	private String yan;
	
	public Foreign() {
		
	}

	public Foreign(int fangjian, String color, String national, String drink, String yan, String pet) {
		
		this.fangjian = fangjian;
		this.color = color;
		this.national = national;
		this.drink = drink;
		this.yan = yan;
		this.pet = pet;
	}
	
	@Override
	public String toString() {
		return "Foreign [fangjian=" + fangjian + ", color=" + color + ", national=" + national + ", drink=" + drink
				+ ", yan=" + yan + ", pet=" + pet + "]";
	}

	private String pet;
	public int getFangjian() {
		return fangjian;
	}
	public void setFangjian(int fangjian) {
		this.fangjian = fangjian;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNational() {
		return national;
	}
	public void setNational(String national) {
		this.national = national;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getYan() {
		return yan;
	}
	public void setYan(String yan) {
		this.yan = yan;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
}
