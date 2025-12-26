import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
class ShowPicture {
    static String resourcePath = "resources/images/";
 public void peacock() {
  JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "peacock.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
  public void tiger() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "tiger.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
 public void giraffe(){
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "giraffe.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
 public void zebra() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "zebra.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
 public void nightingale() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "nightingale.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
 public void lion() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "lion.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
 public void crocodile() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "crocodile.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void elephant() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "elephant.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void chimpanzee() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "chimpanzee.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void eagle() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "eagle.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void rabbit() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath +   "rabbit.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void cat() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "cat.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void koala() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "koala.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void dog() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "dog.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void snake() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "snake.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
public void ostrich() {
     JFrame frame = new JFrame() {
      public void paint(Graphics g) {
          Image img = Toolkit.getDefaultToolkit().getImage(resourcePath + "ostrich.jpg");
          MediaTracker mt = new MediaTracker(this);
          mt.addImage(img, 0);
          try {
              mt.waitForAll();
            } catch(InterruptedException e) {}
          g.drawImage(img, 0, 0, 1000, 700, this);
        }
    };
    frame.setSize(1000, 700);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}