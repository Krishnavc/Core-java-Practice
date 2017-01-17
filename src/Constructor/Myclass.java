package Constructor;

public class Myclass {
	public static void main(String[] args){
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(22, 40);
		double area = rectangle1.area();
		System.out.println(area);
	    area = rectangle2.area();
		System.out.println(area);
		}
}