package Colors.Color.model;

public class Color {

    private String id;

    private String colorName;

    private String colorValue;


    public Color(String id, String colorName, String colorValue) {
        this.id = id;
        this.colorName = colorName;
        this.colorValue = colorValue;
    }

    public Color() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "id='" + id + '\'' +
                ", colorName='" + colorName + '\'' +
                ", colorValue='" + colorValue + '\'' +
                '}';
    }
}
