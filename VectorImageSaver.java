public class VectorImageSaver implements ImageSaver {
    @Override
    public void saveCircle(Circle circle) {
        System.out.println("Saving the circle... with radius= " + circle.getRadius() + " at position " +
                circle.getxPos() + ", " + circle.getyPos() + " as vector");
    }

    @Override
    public void saveRectangle(Rectangle rectangle) {
        System.out.println("Saving the rectangle... with width = " + rectangle.getWidth() +
                " height = " + rectangle.getHeight() + " at position " +
                rectangle.getxPos() + ", " + rectangle.getyPos() + " as vector");
    }

    @Override
    public void saveTriangle(Triangle triangle) {
        System.out.println("Saving the triangle...with base = " + triangle.getBase() +
                " height = " + triangle.getHeight() + " at position " +
                triangle.getxPos() + ", " + triangle.getyPos() + " as vector");
    }
}