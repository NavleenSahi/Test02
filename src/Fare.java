
public class Fare {

	public double calculateTotal(String[] from,String[] to) {
		String[] from1 = new String[] {"Leslie"};
		String[] to1 = new String[] {"Don Mills"};
		
		if(from[0].contains("Leslie") && to[0].contains("Don Mills")) {
			return 2.50;
		}
		
		if(from[0].contains("Sheppard") && to[0].contains("Finch Station")) {
			return 3.00;
		}
		
		if(from[0].contains("Don Mills") && to[0].contains("Finch Station")) {
			return 3.00;
		}
		
		if(from[0].contains("Finch") && to[1].contains("Sheppard") && from[1].contains("Leslie") && to[0].contains("Don Mills")) {
			
		}
		return 5.50;
	}
	
	
}
