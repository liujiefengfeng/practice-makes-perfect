package observer.guava;

import java.util.concurrent.Executor;

public class MoreExecutors {
  public static Executor directExecutor() {
    return new Executor();
  }
}
