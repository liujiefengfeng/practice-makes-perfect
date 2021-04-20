package adaptor.inherit;

import adaptor.Adaptee;
import adaptor.ITarget;

public class InheritAdaptor extends Adaptee implements ITarget {
  public void f1(){
    super.fa();
  }

  public void f2(){

  }
}
