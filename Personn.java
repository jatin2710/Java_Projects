package javafullstackcourse;

public class Personn implements Comparable<Personn>{
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Personn [name=" + name + ", city=" + city + "]";
	}
	public Personn(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
public Personn() {
		super();
	}
	@Override
	public int compareTo(Person o) {
		return this.city.compareTo(o.city);
	}	
}