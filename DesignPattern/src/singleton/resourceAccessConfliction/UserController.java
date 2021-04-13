package singleton.resourceAccessConfliction;

import java.io.IOException;

public class UserController {
    public void login(String username, String password) throws IOException {
        Logger.getInstance().log(username + "logined!");
    }
}
