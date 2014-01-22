package taojava.lab.codereading;

/**
 * The puppetmaster for this lab.  Runs some of our sample programs.
 *
 */
public class Main 
{
  /**
   * Print some not-very-interesting output.
   */
  public static void 
    main (String[] args) 
  {
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
    for (double i = 0; i < 1; i+=0.1) 
      {
        pen.println (i + " squared is " + MathUtils.square (i));
      } // for
    pen.close ();
  } // main(String[])
} // class Main
