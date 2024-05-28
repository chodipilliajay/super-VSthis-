public class House {

    private String color;
    public House(String color){
        this.color = color;
        //this keyword is required, same parameter name as field
    }

    public String getColor(){
        //this is optional
        //return this.color;
        return color;
    }

    public void setColor(String color){
        // this keyword is required, same parameter name as field
        this.color = color;
    }
}
