package week5;

public class Automation extends MultipleLangauage{

	public void Java() {
		System.out.println("java");
		
	}

	public void Selenium() {
		System.out.println("selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
public static void main(String[] args) {
	Automation oops =new Automation();
	oops.Java();
	oops.python();
	oops.ruby();
	oops.Selenium();
}


}
