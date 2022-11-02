import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/* ****************************************************************************
 *  Compilation:  javac Barnsley.java
 *  Execution:    java Barnsley n
 *  Dependencies: StdDraw.java
 *
 *  Play chaos game to produce Barnsley's fern.
 *
 *  % java Barnsley 10000
 *
 * ****************************************************************************/
public class Barnsley {

  public static void main(String[] args) {
    // -------------------------------------------------------------------- //
    // ENVIRONMENT VARIABLES
    // -------------------------------------------------------------------- //
    String[] makeme = { "8000" };
    int n = Integer.parseInt(makeme[0]); // first arg is number of points to draw
    StdDraw.setScale(-0.1, 1.1); // leave a 10% border
    StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE); // set the background colour
    StdDraw.setPenColor(0, 114, 0); // pen should be green in colour

    // set the starting point
    double x = 0.5;
    double y = 0.0;

    // repeat
    for (int i = 0; i < n; i++) {
      double tempx;
      double tempy;
      // System.out.println(i);
      // start with a random location of pen
      double r = StdRandom.uniformDouble(0.0, 1.0);

      // set the stem of the leaf
      if (r <= 0.01) {
        tempx = 0.5;
        tempy = 0.16 * y;
      }
      // the largest part of stem
      else if (r <= 0.08) {
        tempx = 0.2 * x - 0.26 * y + 0.4;
        tempy = 0.23 * x + 0.22 * y - 0.045;
      }
      // largest right-hand leaflet
      else if (r <= 0.15) {
        tempx = -0.15 * x + 0.28 * y + 0.575;
        tempy = 0.26 * x + 0.24 * y - 0.086;
      }
      // successively smaller leaflets
      else {
        tempx = 0.85 * x + 0.04 * y + 0.075;
        tempy = -0.04 * x + 0.85 * y + 0.180;
      }

      // update (x, y) and draw point
      x = tempx;
      y = tempy;
      StdDraw.point(x, y);
    }
  }
}
