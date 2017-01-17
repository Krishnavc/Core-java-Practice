package Constructor;

public class Rectangle {
	int length;
	int bredth;
	
	public double area(){
		return (length * bredth);
	}
	
	Rectangle(){
		length=2;
		bredth=4;
	}
    Rectangle(int l, int b){
		length=l;
		bredth=b;
	}
}
