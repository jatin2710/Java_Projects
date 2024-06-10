package geometry;

public class Triangle {
	
	float a, b, c;
	
	public void setParameters(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float priemeter() {
		
		return a+b+c;
	}
	
	public float area() {
		return (b * c)/2;
	}
}
