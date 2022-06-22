package Assignment2;

public class ShapeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape l=new line();
        Shape r=new rectangle();
        Shape c=new cube();
        Shape s=new square();
        draw_All(l);
        draw_All(r);
        draw_All(c);
        draw_All(s);
    }
    //just one method to call methods from four different classes
    public static void draw_All(Shape obj){
        obj.draw();
	}

}


