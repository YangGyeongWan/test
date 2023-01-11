package vcanus.programmingtest.q2;

public class ChainingCalMain {
	public static void main(String[] args) {
		
		ChainingCal cal = new ChainingCal();
		cal.setAdd1(4).setAdd2(5).setSubstract(3);
		
		System.out.print("result: ");
		System.out.println(cal.getAdd1()+cal.getAdd2()-cal.getSubstract());
		
	}
}
