import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ColorText implements Runnable {
    private JLabel label;

    public ColorText(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (label) {
                    label.setForeground(getRandomColor());
                }
                Thread.sleep(1000); // wait for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        JLabel label = new JLabel("Show Some Respect to ME");
        JFrame frame = new JFrame();
        frame.add(label);
        frame.setSize(400, 400);
        frame.setVisible(true);
        ColorText colorText = new ColorText(label);
        Thread thread = new Thread(colorText);
        thread.start();
    }
}