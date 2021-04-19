package proxy;

import proxy.interfaceBased.IUserController;
import proxy.interfaceBased.UserVo;

public class UserController implements IUserController {
  public UserVo login(String telephone, String password) {
    // Do login
    return new UserVo();
  }

  public UserVo register(String telephone, String password) {
    // Do register
    // do something
    return new UserVo();
  }
}
