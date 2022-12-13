package com.tns.framework;

public abstract class NormalAcc {
 protected float deliveryCharge=50;
  
 
  public NormalAcc(float deliveryCharge) {
	super();
	this.deliveryCharge = deliveryCharge;
}
public void bookProduct(float charges) {
	 
 }
@Override
public String toString() {
	return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
