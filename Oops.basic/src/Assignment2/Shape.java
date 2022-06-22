package Assignment2;

public abstract class Shape {
    abstract void draw();
}

class line extends Shape {
    public void draw(){
        System.out.println("Line is drawn");
    }
}
class rectangle extends Shape {
    public void draw(){
        System.out.println("rectangle is drawn");
    }
}
class cube extends Shape{
    public void draw(){
        System.out.println("cube is drawn");
    }
}
class square extends Shape{
    public void draw(){
        System.out.println("square is drawn");
    }
}


