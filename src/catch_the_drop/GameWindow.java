package catch_the_drop;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow gameWindow;
    private static Image background;
    private static Image game_over;
    private static Image drop;

    public static void main(String[] args) {
        gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200, 100);
        gameWindow.setSize(906, 478);
        gameWindow.setResizable(false);
        GameField gameField = new GameField();
        gameWindow.add(gameField);
        gameWindow.setVisible(true);

    }


        private static void onRepaint(Graphics g){
        g.fillOval(10, 10, 200,100);
        g.drawLine(500,100,350,150);

        }


        private static class GameField extends JPanel{

        @Override
            protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
        }


        }


}
