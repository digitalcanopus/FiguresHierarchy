import javax.swing.*;
import java.awt.*;
//подключение пакетов для GUI

public class Frame extends JFrame {
    //создание "холста"
    Panel p = new Panel();
    //создание окна
    public Frame(){
        setSize(700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //способ закрытия окна
        setLayout(new BorderLayout()); //метод компоновки
        add(p/*, BorderLayout.CENTER*/);
        setVisible(true);
    }
}
