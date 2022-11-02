import edu.princeton.cs.algs4.CollisionSystem;
import edu.princeton.cs.algs4.Particle;
import edu.princeton.cs.algs4.StdDraw;

/*
 * ***************************************************************************************************************
 * @desc: Colliding disc demo allows us to use particle physics to make hard disks that obey the law of ELASTIC COLLISION
 * @author: Its me but I am basically testing Princeton's code below to see if their library "algs4.jar" is working or NOT ??
 * ***************************************************************************************************************
 */
public class CollidingDiscs {

  public static void main(String[] args) {
    // set number of particles to generate
    int n = 20;
    if (args.length == 1) {
      n = Integer.parseInt(args[0]);
    }

    // enable double buffering to support enimations
    StdDraw.enableDoubleBuffering();

    // create n particles
    Particle[] particles = new Particle[n];
    for (int i = 0; i < n; i++) {
      particles[i] = new Particle();
    }

    // enforce physics on this system
    CollisionSystem system = new CollisionSystem(particles);

    // simulate the system for an infinite time
    system.simulate(Double.POSITIVE_INFINITY);
  }
}
