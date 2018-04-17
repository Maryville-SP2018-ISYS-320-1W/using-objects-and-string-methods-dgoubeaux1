/*
	ISYS 320
	Name(s):
	Date: 
*/


public class P2_BananaStand {
	
	
	
	public static void main(String[] args) {
		BANANA();
		lastHalf();
		
}
	public static void BANANA(){
		String quote = "There's always money in the banana stand.";
		quote = quote.toUpperCase();
			System.out.print(quote.substring(28, 34));
	}
	


	public static void lastHalf() {
		
		String quote = "There's always money in the banana stand.";
			System.out.print(quote.substring(21,40));
	}
}
