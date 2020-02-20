package infoshareacademy;

public class Pizza extends Meal {
    private Size size;
    private Type type;


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String addMeal(Size size, Type type) {
        return size.toString() + " " + type.toString();
    }
}