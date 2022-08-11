import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*

   Since this exercise has a difficulty of > 4 it doesn't come
   with any starter implementation.
   This is so that you get to practice creating classes and methods
   which is an important part of programming in Java.

   Please remove this comment when submitting your solution.

*/

public class Robot {
    private String name = "";
    public static Set<String> nameInUse = new HashSet<>();

    public Robot() {
        reset();
    }

    public String getName() {
        return name;
    }

    public void reset() {

        String oldName = this.name;
        while (this.name.isEmpty() || nameInUse.contains(this.name)){
            Random r = new Random();
            this.name = "";
            this.name += (char)(r.nextInt(26) + 65);
            this.name += (char)(r.nextInt(26) + 65);
            this.name += Integer.toString(r.nextInt(1000));
        }
        nameInUse.add(this.name);
        nameInUse.remove(oldName);
    }
}

