class Rectangle implements FootShape {
    @Override
    public void drawAsEllipse() {
        // Empty method as this class represents a rectangle
    }

    @Override
    public void drawAsRectangle() {
        System.out.println("draw rectangle");
    }
}