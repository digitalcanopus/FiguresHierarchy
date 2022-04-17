import javax.swing.*;
import java.awt.*;
import java.util.ArrayList; //крутой массив

public class Panel extends JPanel {
    ArrayList<Figure> arr = new ArrayList<>();
    {
        //добавление фигур
        arr.add(new Ellipse(100, 100, 75, 50));
        arr.add(new Triangle(250, 250, 300, 100, 350, 250));
        arr.add(new Polygon(100, 180, 150, 210, 125, 260, 75, 260, 50, 210));
        arr.add(new Square(100, 300, 100));
        arr.add(new Rectangle(250, 300, 100, 200));
        arr.add(new Circle(450, 300, 60));
    }
    public void reDraw(){
        repaint();
    }
    @Override
    public void paint(Graphics g){
        //закрашивание панели
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        //массив координат точек фигур
        for (Figure f: arr) {
            int masX[] = f.getMasX();
            int masY[] = f.getMasY();
            //отрисовка
            g.setColor(Color.black);
            for (int i = 0; i < masX.length; i++)
                g.drawLine(masX[i], masY[i], masX[(i + 1) % masX.length], masY[(i + 1) % masY.length]);
        }
    }
}