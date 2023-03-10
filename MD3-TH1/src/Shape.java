public class Shape {
    String color="green";
    boolean filled= true;
    public  Shape(){
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled= filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of  "+
                getColor()+
                " and " +
                ((getFilled())?"filled": "not filled");

    }
}
