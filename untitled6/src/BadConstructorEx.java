public class BadConstructorEx {
    private int x;
    private int y;
    private int width;
    private int height;

    public BadConstructorEx(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public BadConstructorEx(int width, int height){
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public BadConstructorEx(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //here we have three constructors
    //all three constructors initialize variables
    //there's repeated code in each constructor
    //we're initializing variables in each constructor, with some default values
    //you should never write constructor like this


}


