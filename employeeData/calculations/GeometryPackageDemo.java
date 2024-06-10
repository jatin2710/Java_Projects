package calculations;

import geometry.*;

public class GeometryPackageDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		
		c1.setRadius(3.4f);
		System.out.println("Primeter of circle is : "+ c1.priemeter());
		
		r1.setParameters(3.0,5.0,6.0);
		System.out.println("Primeter of circle is : "+ c1.priemeter());

	}

}
