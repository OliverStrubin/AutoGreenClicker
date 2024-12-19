# Reaction Time Test Automation (Java)

A Java program designed to automate the Reaction Time Test on [Human Benchmark](https://humanbenchmark.com/tests/reactiontime). This script detects color changes on the screen and simulates a mouse click when the green color appears, providing fast and precise reaction times.

## Features

- Detects the green screen change during the Reaction Time Test.
- Simulates a mouse click with precise timing.
- Configurable capture area for screen detection.
- Lightweight and efficient.

## Requirements

- **Operating System**: Windows, macOS, or Linux
- **Java Version**: 8 or higher

## Installation

1. Clone the repository

2. Compile the Java program

3. Run the program

## Usage

1. Open the Reaction Time Test on [Human Benchmark](https://humanbenchmark.com/tests/reactiontime).
2. Position the browser window such that the area where the green screen will appear is at the configured coordinates in the program.
3. Run the program as described above.

## Configuration

Modify the following variables in the `Main` class to adjust the detection area:

```java
int x = 2554;  // X-coordinate of the area to monitor
int y = 614;   // Y-coordinate of the area to monitor
int width = 1; // Width of the area to monitor
int height = 1;// Height of the area to monitor
```

### Example:
If the green area appears at a different position, update the `x` and `y` values accordingly. The `width` and `height` define the size of the area to monitor for the color change.

## How It Works

1. The program captures a specific area of the screen repeatedly.
2. It checks if any pixel in the capture area matches the green color (based on RGB values).
3. If green is detected, it simulates a mouse click at the center of the capture area.
4. The program stops after clicking.

## Disclaimer

This program is for educational purposes only. Use responsibly and respect the terms of service of [Human Benchmark](https://humanbenchmark.com/).
