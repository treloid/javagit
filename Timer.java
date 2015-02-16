import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon.zeltner
 */
public class Timer {

    private int time = 0;

    public void time() {
        while(true)
        {        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
        }
        time++;
        System.out.println(time);
    }
    }
    public static void main(String[] args) {

        Timer t = new Timer();

        t.time();

    }
}

