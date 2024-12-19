package org.example;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();

        // area of where to look on screen
        int x = 2554;
        int y = 614;
        int width = 1;
        int height = 1;

        while (true) {
            // look at the thing using the things defined above
            Rectangle captureArea = new Rectangle(x, y, width, height);
            BufferedImage screenCapture = robot.createScreenCapture(captureArea);

            boolean isGreen = false;

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int pixelColor = screenCapture.getRGB(i, j);
                    Color color = new Color(pixelColor);

                    // check if green is on screen
                    if (color.getRed() < 100 && color.getGreen() > 150 && color.getBlue() < 120) {
                        isGreen = true;
                        break;
                    }
                }
                if (isGreen) break;
            }

            // click it
            if (isGreen) {
                robot.mouseMove(x + width / 2, y + height / 2);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                break;
            }
        }

        System.out.println("Clicked for green.");
    }
}
