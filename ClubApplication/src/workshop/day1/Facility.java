package workshop.day1;

public class Facility {
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Facility(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public Facility(String name) {
		super();
		this.name = name;
	}
	public void show() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Facility [name=" + name + ", description=" + (description !=null?description:"")+ "]";
	}

}
