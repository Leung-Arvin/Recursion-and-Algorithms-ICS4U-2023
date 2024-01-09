import java.awt.*;
import javax.swing.*;

public class Bars extends JPanel {

  // consts
  private static final int widthPx = 1000;
  private static final int heightPx = 500;

  private static int numBars = 5;
  public static int[] array;

  Bars(int[] incomingArray) {
    numBars = incomingArray.length;
    array = new int[numBars];
    
    // copy incoming array
    for (int i = 0; i < numBars; i++) {
      array[i] = incomingArray[i];
    }
  }

  // @Override nope nvm
  public void paintComponent(Graphics graphics) {
    // idk man just following the guide
    super.paintComponent(graphics);

    int barWidth = widthPx / numBars;
    int barHeightUnit = heightPx / numBars;

    graphics.setColor(Color.RED);
    //graphics.fillRect(0,400,200,200);

    for (int i = 0; i < numBars; i++) {
      graphics.fillRect(
          i * barWidth,
          (numBars - array[i]) * barHeightUnit,
          barWidth,
          array[i] * barHeightUnit);
    }

  }
}