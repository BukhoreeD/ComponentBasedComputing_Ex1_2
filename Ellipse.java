class Ellipse implements FootShape {
    @Override
    public void drawAsEllipse() {
        System.out.println("draw ellipse");
    }

    @Override
    public void drawAsRectangle() {
        // Empty method as this class represents an ellipse
    }
}