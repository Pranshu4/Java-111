package exam_c1;

public class CarMain {

	public static void main(String[] args) {
		Car s1=new Car();
		s1.model="Harrier";
		s1.companyName="Tata";
		s1.Color="black";
		s1.engine=new Engine();
		s1.engine.rmp=10000;
		s1.engine.Power=110;
		s1.engine.manufacturer="tata";
		s1.engine.enableturbo(true);
		
		System.out.println("Car Model : "+s1.model);
		System.out.println("Car companyName : "+s1.companyName);
		System.out.println("Car Color : "+s1.Color);
		System.out.println("Car RPM : "+s1.engine.rmp);
		System.out.println("Car power : "+s1.engine.Power);
		System.out.println("Car Engine Manufacture : "+s1.engine.manufacturer);
		System.out.println("Car Has Turbo : " + s1.engine.hasTurbo);
	}

}
