package singleton.resourceAccessConfliction;

import java.io.IOException;

public class OrderController {
    public void create() throws IOException {
        Logger.getInstance().log("Create a order: ~");
    }
}
