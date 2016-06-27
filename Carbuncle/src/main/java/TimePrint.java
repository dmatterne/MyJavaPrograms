import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This is the Time Visualization and Reporting Device.
 */
public final class TimePrint {

    /**
     * LENGTH VARIABLE.
     */
    private static final Long LENGTH = 10000000000L;

    /**
     * SLEEPTIME VARIABLE.
     */
    private static final int SLEEP_TIME = 2000;

    /**
     * This is the void main.
     *
     * @param args The final String array of arguments.
     */
    public static void main(final String[] args) {
        long start = System.nanoTime(), current = System.nanoTime();
        long delta = current - start;
        Logger logger = LoggerFactory.getLogger(TimePrint.class);
        int count = 0;

        while (delta <= LENGTH) {


            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("d MMMM yyyy. HH:mm:ss");
            String value = formatter.format(LocalDateTime.now());
            logger.info(value);
            logger.debug(delta + "");
            logger.warn(count++ + "");
            delta = System.nanoTime() - start;
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                logger.error("Interrupted exception.");
                e.printStackTrace();
            }

            logger.error("Error: Your thread has been sleeping");
        }


    }

    /**
     * This is a private constructer.
     */
    private TimePrint() {


    }
}
