package oops;
class BeforeEncapsulation_
{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class AfterEncapsulation {

	public static void main(String[] args) {
		BeforeEncapsulation_ obj=new BeforeEncapsulation_();
		obj.setAge(12);
		obj.setName("Neha");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(16);
		obj.setName("hema");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}
