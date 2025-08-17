package corejava_vaishnavi;

public class Variable {

		int a = 10;
		void print() {
		String msg= "hello";
		System.out.println(msg);
	   }
		static String message="hello students";
public static void main(String[] args) {
	Variable obj=new  Variable();
	System.out.println("the value of a : "+obj.a);
	obj.print();
	System.out.println(message);

	}
}
