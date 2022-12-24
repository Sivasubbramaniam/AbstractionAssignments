package abstractionAssignments;

public class Automation extends MultipleLanguage implements Language,TestTool {
	

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("This is Java program");
	}
	
	public void Selenium() {
		System.out.println("Testleaf selenium course");
	}
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
	
		
		Automation A = new Automation();
		A.java();
		A.Selenium();
		
		
	
	
}
}

