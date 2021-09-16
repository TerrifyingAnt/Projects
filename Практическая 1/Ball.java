public class Ball {
    private String material;
    private String color;

    public Ball (String m, String c) {
        material = m;
        color = c;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void setMaterial(String m) {
        this.material = m;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return this.material + " ball of " + this.color + " color";
    }
}