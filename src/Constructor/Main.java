package Constructor;

public class Main {
	public static void main(String[] args){
		Marks s1 = new Marks();
		Marks s2 = new Marks(95,99,98);
		float Totalscore = s1.Totalscore();
		System.out.println(Totalscore);
		Totalscore = s2.Totalscore();
		System.out.println(Totalscore);
	}
}
