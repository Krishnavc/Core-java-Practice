package Constructor;

public class Marks {
	int maths;
	int dbms;
	int java;
	
	public float Totalscore(){
		return (maths + dbms + java);
	}
	Marks(){
		maths=100;
		dbms=95;
		java=99;
	}
	Marks(int m, int db, int j){
		maths = m;
		dbms = db;
		java = j;
	}
}
