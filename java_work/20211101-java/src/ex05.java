class C{
	public void doA() {
		System.out.println("static method doA");
	}
}
class Cs{
	public static C cout = new C();
}
public class ex05 {
	public static void main(String[] args) {
		Cs.cout.doA();
		System.out.println("?????ϰ?...");
	}
}
