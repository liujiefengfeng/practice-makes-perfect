package singleton.resourceAccessConfliction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter writer;
    private static Logger instance = null;

    static {
        try {
            instance = new Logger();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Logger() throws IOException {
        File file = new File("~/log.text");
        writer = new FileWriter(file, true);
    }

    public static Logger getInstance(){
        return instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }
}
