public class Circle extends Ellipse {
    public Circle (int x, int y, int r) {
        super(x, y, r, r); //передача в метод Ellipse родительского класса
        if (r <= 0)
            throw new RuntimeException("Radius is negative or zero."); //нулевой радиус
    }
}
