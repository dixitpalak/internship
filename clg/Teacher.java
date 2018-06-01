package clg;

import java.util.*;

public class Teacher extends Person {
  private String mName;

  private double mSalary;

  public Teacher(String name,double salary)
  {
    super(name);
    mSalary = salary;
  }
  

  public String getName(){
    return mName;
  }
  public void setName(String name){
    mName=name;
  }
  public double getSalary(){
    return mSalary;
  }
  public void setSalary(double salary){
    mSalary=salary;
  }
}
