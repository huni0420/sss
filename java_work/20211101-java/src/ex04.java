class A{
	static int num = 0;
	static void addNum(int n) {
		num += n;
	}
}
public class ex04 {
	public static void main(String[] args) {
		A.addNum(10);
		
		A a = new A();
		a.addNum(10);
	}
}
