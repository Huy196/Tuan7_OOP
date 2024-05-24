package Chacon;

public class Cha_con {
    private String color = "white";
    private String filled = null;
    public Cha_con() {

    }
    public Cha_con(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString(){
        return "created with \" " + color + "\" color and " + (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}
