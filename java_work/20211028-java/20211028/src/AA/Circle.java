package AA;

public class Circle{
	public int xPos,yPos,rad;
	public Circle(int x, int y,int z) {
		xPos = x;
		yPos = y;
		rad = z;
	}
	public void showCircleInfo() {
		System.out.println("["+xPos+","+yPos+"]");
		System.out.println("원의 반지름 = "+rad);
	}
}