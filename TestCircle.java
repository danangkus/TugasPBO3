public class TestCircle {
	public static void main(String[] args) {
		circle c1 = new circle(2.0,"blue");
		System.out.println("Radius is "+ c1.getRadius()
			+ " Color is " + c1.getColor()
			+ " Area is " + c1.getArea());
		circle c2 = new circle(2.0);
		System.out.println("Radius is " + c2.getRadius()
			+ " Color is " + c2.getColor()
			+ " Area is " + c2.getArea());
		circle c3 = new circle();             // Use 1st constructor
      	System.out.println("Radius is " + c3.getRadius()
         + " Color is " + c3.getColor()
         + " Area is " + c3.getArea());
	}
}