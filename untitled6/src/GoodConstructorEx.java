public class GoodConstructorEx {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public GoodConstructorEx(){
        this(0, 0);  //calls 2nd constructor
    }
    //2nd constructor
    public GoodConstructorEx(int width, int height){
        this(0, 0, width, height); //calls 3rd constructor
    }
    //3rd constructor
    public GoodConstructorEx(int x, int y, int width, int height){
        //initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
