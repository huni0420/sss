class Boat{
	public void myboat() {
		System.out.println("이것은 보트");
	}
}
//stack... 스택.... 메모리운영방식... LIFO
//메모리공간에 올려 놓고 사용을 해야된다...
//1. static ..
//2. 객체 생성(인스턴스화, 메모리에 할당) -> non static -> jvm 알아서 관리...
public class Car{
	public void myCar() {
		System.out.println("이것은 내 자동차");
	}
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.myCar();
		Boat boat = new Boat();
		boat.myboat();
		
	}
}
