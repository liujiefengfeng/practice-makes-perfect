package proxy;

import proxy.interfaceBased.MetricsCollector;
import proxy.interfaceBased.RequestInfo;
import proxy.interfaceBased.UserVo;

public class UserControllerOrigin {
  private MetricsCollector metricsCollector;

  public UserVo login(String telephone, String password) {
    long startTimeStamp = System.currentTimeMillis();
    // Do login
    long endTimeStamp = System.currentTimeMillis();
    long responseTime = endTimeStamp - startTimeStamp;
    RequestInfo requestInfo = new RequestInfo("info", responseTime, startTimeStamp);
    metricsCollector.recordRequest(requestInfo);
    // do something
    return new UserVo();
  }

  public UserVo register(String telephone, String password) {
    long startTimeStamp = System.currentTimeMillis();
    // Do register
    long endTimeStamp = System.currentTimeMillis();
    long responseTime = endTimeStamp - startTimeStamp;
    RequestInfo requestInfo = new RequestInfo("info", responseTime, startTimeStamp);
    metricsCollector.recordRequest(requestInfo);
    // do something
    return new UserVo();
  }
}
