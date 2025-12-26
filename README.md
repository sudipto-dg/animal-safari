# animal-safari
An interactive educational Java application designed to introduce common animals to small children through images, sounds, and detailed information.

## Project Information

- **Project Title**: Wild Nature
- **Purpose**: To introduce common animals to small children
- **Version/Date**: 13/12/2015
- **Author**: Sudipto Dasgupta

## Overview

Wild Nature is an educational application that provides information about 16 different animals. When a user selects an animal from the menu, the application displays:

- Animal name and scientific classification
- Detailed information about the animal
- Optional audio playback of the animal's sound
- Visual display of the animal's image

## Features

- Interactive menu-driven interface
- Information about 16 animals:
  1. Peacock
  2. Tiger
  3. Giraffe
  4. Zebra
  5. Nightingale
  6. Lion
  7. Crocodile
  8. Elephant
  9. Chimpanzee
  10. Eagle
  11. Rabbit
  12. Cat
  13. Koala
  14. Dog
  15. Snake
  16. Ostrich

- Audio playback for each animal
- Image display for each animal
- Scientific names and detailed descriptions

## Project Structure

```
animal-safari/
├── Animals.java          # Main application class
├── AudioPlayer.java      # Handles audio playback
├── ShowPicture.java      # Displays animal images
├── package.bluej         # BlueJ project configuration
├── resources/
│   ├── images/          # Animal image files (.jpg)
│   │   ├── peacock.jpg
│   │   ├── tiger.jpg
│   │   └── ... (16 total images)
│   └── audio/           # Animal sound files (.wav)
│       ├── peacock.wav
│       ├── tiger.wav
│       └── ... (16 total audio files)
├── LICENSE              # MIT License
├── .gitignore           # Git ignore rules
└── README.md            # This file
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- BlueJ IDE (optional, for development)

## How to Run

### Using BlueJ

1. Open the project in BlueJ
2. Right-click on the `Animals` class
3. Select "void main(String[] args)"
4. Click "Ok" to run
5. Follow the on-screen prompts

### Using Command Line

1. Compile the Java files:
   ```bash
   javac *.java
   ```

2. Run the application:
   ```bash
   java Animals
   ```

3. Follow the on-screen prompts:
   - Enter a number (1-16) to select an animal
   - Enter 'y' or 'Y' when prompted to play the animal's sound
   - View the animal's image in the displayed window


## Usage Instructions

1. When the program starts, you'll see a numbered list of animals
2. Enter the number corresponding to the animal you want to learn about
3. The program will display:
   - The animal's name
   - Its scientific name
   - Detailed information about the animal
4. You'll be prompted: "Enter y/n to play voice of respective animal"
   - Enter 'y' or 'Y' to hear the animal's sound
   - Enter 'n' or 'N' to skip audio playback
5. An image window will automatically open showing the selected animal

## Resource Files

The application requires the following resource files:

- **Images**: 16 `.jpg` files located in `resources/images/`
  - One image file for each animal (e.g., `peacock.jpg`, `tiger.jpg`, etc.)

- **Audio**: 16 `.wav` files located in `resources/audio/`
  - One audio file for each animal (e.g., `peacock.wav`, `tiger.wav`, etc.)

All resource files must be present for the application to function correctly.

## BlueJ Compatibility

This project was originally created using BlueJ and remains fully compatible with it. Simply open the project folder in BlueJ to get started.

## Version Control

This project uses Git for version control. The `.gitignore` file excludes:
- Compiled `.class` files
- BlueJ context files (`.ctxt`)
- Log files (`.log`)
- Package files (`.jar`, `.war`, etc.)


## Notes

- The application uses Java Swing for image display
- Audio playback uses Java Sound API
- All resource paths are relative to the project root directory
- When running from BlueJ, ensure the working directory is set to the project root (this is the default behavior)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

Copyright (c) 2025 Sudipto Dasgupta
