import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, ShapeType> shapeMap = new HashMap<>();

    public static ShapeType getShape(String shapeName, String color) {
        String key = shapeName + "-" + color;
        if (!shapeMap.containsKey(key)) {
            shapeMap.put(key, new ShapeType(shapeName, color));
        }
        return shapeMap.get(key);
    }
}
