public class SuperClass {
    private int x;
    private int y;
    public SuperClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    //parentClass or superClass
    public void printMethod(){
        System.out.println("Printed in SuperClass");
    }
}
class SubClass extends SuperClass {
    private int width;
    private int height;
    //1st constructor
    public SubClass(int x, int y){
        this(x, y, 0, 0); // calls 2nd constructor
    }
    //2nd constructor
    public SubClass(int x, int y, int width, int height){
        super(x,y);  //calls constructor from parent
        this.width = width;
        this.height = height;
    }
    //subClass or childClass
    //Override methods from the superClass or parentClass
    @Override
    public void printMethod(){
        super.printMethod(); //calls the method in the parentClass(SuperClass)
        System.out.println("Printed in subClass");
    }
}

class MainClass{
    public static void main(String[] args) {
        SubClass sc = new SubClass(5, 4);
        sc.printMethod();
    }
}