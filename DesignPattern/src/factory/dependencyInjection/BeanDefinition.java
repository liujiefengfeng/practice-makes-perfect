package factory.dependencyInjection;

import com.sun.source.tree.Scope;

import java.util.ArrayList;
import java.util.List;

public class BeanDefinition {
  private String id;
  private String className;
  private List<ConstructorArg> constructorArgs = new ArrayList<ConstructorArg>();
  private Scope scope = Scope.SINGLETON;
  private boolean lazyInit = false;

  public boolean isSingleton(){
    return scope.equals(Scope.SINGLETON);
  }

  public String getId() {
    return null;
  }

  public boolean isLazyInit() {
    return false;
  }

  public String getClassName() {
    return null;
  }

  public List<ConstructorArg> getConstructorArgs() {
    return null;
  }

  public static enum Scope {
    SINGLETON,
    PROTOTYPE
  }

  public static class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    public boolean getIsRef() {
      return false;
    }

    public Class getType() {
      return null;
    }

    public String getArg() {
      return null;
    }
  }
}
