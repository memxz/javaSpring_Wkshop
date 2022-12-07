package workshop.day1;

public class ClubApplication {
	public static void main(String[]args) {
		Person p=new Person("san","zhang","xiao");
		Person p1=new Person("si","li","xiao");
		Facility f=new Facility("hah");
		p.show();
		p1.show();
		f.show();
		System.out.println(p+"\n"+p1);
	}
}
