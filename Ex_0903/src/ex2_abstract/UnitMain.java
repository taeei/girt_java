package ex2_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();
		System.out.println("t1 : " + t1.getEnergy());
		
		Zerg z1 = new Zerg("퀸", 200, true);
		z1.decEnergy();
		System.out.println("z1 : " + z1.getEnergy());
		
		Protoss p1 = new Protoss("셔틀", 150, true);
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1 : " + p1.getEnergy());
		
		
	}//main
}
