import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SwingDodgingGame extends JFrame {
    private final int WIDTH = 400;
    private final int HEIGHT = 600;
    private final int PLAYER_SIZE = 20;
    private final int OBSTACLE_SIZE = 20;
    private final int OBSTACLE_SPEED = 3;
    private final int INTERVAL = 20;

    private Timer timer;
    private List<Point> obstacles;
    private Point player;
    private int score;
    private boolean isGameOver;

    public SwingDodgingGame() {
        setTitle("Dodging Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    player.x -= 10;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    player.x += 10;
                }
                repaint();
            }
        });

        obstacles = new ArrayList<>();
        player = new Point(WIDTH / 2, HEIGHT - 50);
        score = 0;
        isGameOver = false;

        timer = new Timer(INTERVAL, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isGameOver) {
                    moveObstacles();
                    checkCollision();
                    score++;
                    repaint();
                }
            }
        });
        timer.start();
    }

    private void moveObstacles() {
        for (int i = 0; i < obstacles.size(); i++) {
            obstacles.get(i).y += OBSTACLE_SPEED;
            if (obstacles.get(i).y >= HEIGHT) {
                obstacles.remove(i);
                i--;
            }
        }
        if (Math.random() < 0.05) {
            int x = new Random().nextInt(WIDTH - OBSTACLE_SIZE);
            obstacles.add(new Point(x, 0));
        }
    }

    private void checkCollision() {
        Rectangle playerRect = new Rectangle(player.x, player.y, PLAYER_SIZE, PLAYER_SIZE);
        for (Point obstacle : obstacles) {
            Rectangle obstacleRect = new Rectangle(obstacle.x, obstacle.y, OBSTACLE_SIZE, OBSTACLE_SIZE);
            if (playerRect.intersects(obstacleRect)) {
                isGameOver = true;
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over! Your score: " + score);
                break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.RED);
        g.fillRect(player.x, player.y, PLAYER_SIZE, PLAYER_SIZE);
        g.setColor(Color.WHITE);
        for (Point obstacle : obstacles) {
            g.fillRect(obstacle.x, obstacle.y, OBSTACLE_SIZE, OBSTACLE_SIZE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingDodgingGame game = new SwingDodgingGame();
            game.setVisible(true);
        });
    }
}



