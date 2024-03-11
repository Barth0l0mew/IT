package Patterns.Composite;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//frame.getContentPane().setBackground(Color.BLACK);

        Container container = new Container();
        frame.add(container);

        Shape recr1 = new Rect(100,100,Color.BLUE);
        //container.add(recr1);
        Shape recr12 = new Rect(300,300,Color.RED);
        //container.add(recr12);
        Group group1 = new Group(0,0,Color.cyan);
        group1.add(recr1);
        group1.add(recr12);

        Shape recr3 = new Rect(200,100,Color.BLUE);
        //container.add(recr1);
        Shape recr4 = new Rect(400,300,Color.RED);
        //container.add(recr12);
        Group group2 = new Group(0,0,Color.cyan);
        group2.add(recr3);
        group2.add(recr4);


        Group group3 = new Group(0,0,Color.cyan);
        group3.add(group1);
        group3.add(group2);


        container.add(group3);

        frame.setVisible(true);

    }
}
interface ShapeProcessor {
     void paint(Graphics graphics);
}

abstract class Shape implements ShapeProcessor {
    public int x;
    public int y;
    public Color color;
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    @Override
    public void paint(Graphics graphics){
        graphics.setColor(color);
    }

}

class Rect extends Shape {
    public Rect(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x, y, 20, 20);
    }

    public void make() {
        int count = (int)Math.round(Math.random()*5+1);
        for (int i = 0; i<count; i++) {
            int xOffset = (int)Math.round(Math.random()*100-50);
            int yOffset = (int)Math.round(Math.random()*100-50);
            Rect rect = new Rect(x+xOffset,y+yOffset,
                    Color.BLUE
            );
        }
    }
}
//Composite pattern
class Group extends Shape {
    private final List<Shape> shapes = new ArrayList<>();

    public Group(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics graphics) {
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }

    public void add(Shape shape){
        shapes.add(shape);
    }
}

class Container extends JPanel {
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        setBackground(
                Color.BLACK
        );
        super.paintComponent(graphics);
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }
}