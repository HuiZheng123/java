package mytest;

public class Simple {
	private int n;		
		public Simple(int n) {
		this.n = n;
		}
		
		public int foo() {
		return n>0 ? n : (-n);
		//return n;
		}

}
