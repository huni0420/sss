import AA.aa;

// oop - 객체 지향 프로그래밍

public class ex02 {
	public static void main(String[] args) {
		int num1ary[] = new int[3];
		String nameary[] = new String[3];
		
		aa aarray[] = new aa[3];
		for (int i = 0; i < 3; i++) {
			aarray[i] = new aa((i + 1) * 10, "a" + i);
		}
		
		for (int i = 0; i < 3; i++) {
//			System.out.println("aarray["+i+"] = " + aarray[i]);
			aarray[i].doprint();
		}
	}
}
