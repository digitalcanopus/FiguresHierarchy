public class Ellipse extends Figure {
    public Ellipse (int x, int y, int a, int b){
        if (a <= 0 || b <= 0)
            throw new RuntimeException("Radius is negative or zero."); //нулевые полуоси
        final int numPoint = 1; //угловатость 
        int n = (int)(Math.PI*(a + b)/numPoint); 
        //задание количества координат
        masX = new int[n];
        masY = new int[n];
        //определение координат эллипса по параметрическим уравнениям 
        for (int i = 0; i < n; i++) {
            double t = 2*Math.PI*i/n; //определение угла
            masX[i] = (int)(a*Math.cos(t) + x);
            masY[i] = (int)(b*Math.sin(t) + y);
        }
    }
}