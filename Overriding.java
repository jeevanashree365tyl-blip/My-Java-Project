package citnc;


	public class Overriding extends Parents {
		void marry() {
			System.out.println("campus selection girl/boy");
		}

		public static void main(String[] args) {
			Overriding tt = new Overriding();
			tt.marry();
			tt.property();
		}
	

}


