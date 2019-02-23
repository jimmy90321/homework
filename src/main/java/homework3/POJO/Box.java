package homework3.POJO;

public abstract class Box {
    private float length, width, height;

    Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, float height) {
        if (length > this.length) {
            return false;
        }
        if (width > this.width) {
            return width <= this.length && length <= this.width;
        }
        if (height > this.height) {
            if (width <= this.height && height <= this.width) {
                return true;
            }
            return length <= this.height && height <= this.length;
        }
        return true;
    }
}
