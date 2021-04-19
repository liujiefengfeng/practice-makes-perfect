package proxy.interfaceBased;

public class RequestInfo {
  private String info;
  private long responseTime;
  private long startTimeStamp;

  public RequestInfo(String info, long responseTime, long startTimeStamp) {
    this.info = info;
    this.responseTime = responseTime;
    this.startTimeStamp = startTimeStamp;
  }
}
