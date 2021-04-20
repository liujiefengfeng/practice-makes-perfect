package decorator;

public class ADecorator implements IA {
  private IA a;

  public ADecorator(IA a) {
    this.a = a;
  }

  public void f() {
    // Decorator logic
    a.f();
    // Decorator logic
  }
}
