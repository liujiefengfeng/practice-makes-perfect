package adaptor.compose;

import adaptor.Adaptee;
import adaptor.ITarget;

public class ComposeAdaptor implements ITarget {
  private Adaptee adaptee;

  public ComposeAdaptor(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public void f1(){
    adaptee.fa();
  }

  public void f2(){

  }

  public void fc(){
    adaptee.fc();
  }
}
