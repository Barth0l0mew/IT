package Classwork;

import javax.swing.*;
import java.awt.*;

public class Grafics extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;// получаем контекст для рисования
         g2d.setBackground(Color.BLUE); //цвет фона
         g2d.clearRect(0, 0, getParent().getWidth(), getParent().getHeight());//очистка фона
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(0,0,50,50);//рисуем квадрат 50*50 с границей черным цветом с прозрачным фоном
        g2d.setColor(Color.red);//установка цвета
        g2d.fillRect(20,20,100,100);
        g2d.drawString("hello",100,100);

    }

    public static void main(String[] args) {
        // create frame for Main
        JFrame frame = new JFrame("Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //остановка приложения при закрытии экрана
        Grafics app = new Grafics();// создаем панель
        frame.add(app);// создаем паинт панель в фрайме добавив эту панель
        frame.setSize(400, 400); //размеры экрана
        frame.setLocationRelativeTo(null);//позиционирование
       frame.setVisible(true);
    }
}
