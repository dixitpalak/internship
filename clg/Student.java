package clg;

import java.util.*;

public class Student extends Person {
  private String mName;
  private double mCPI;
  private double mFees;
  public Student(String name){
    super(name);
    mCPI=0;
  }
  public String getName(){
    return mName;
  }
  public double getCPI(){
    return mCPI;
  }
  public double getFees(){
    return mFees;
  }
  public void setCPI(double cpi){
    mCPI=cpi;
  }
  public void setFees(double Fees){
    mFees=Fees;
  }
  public void setName(String name){
    mName=name;
  }

 
}
