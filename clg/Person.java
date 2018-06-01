package clg;
import java.util.*;
abstract public class Person
{
  private String mName;
  private List<Subject> mSubjects;
  
  public Person(String name){
    mName=name;
    mSubjects=new ArrayList<Subject>();
  }
  public void addSubject(Subject subject){
    mSubjects.add(subject);
  }
  public void addSubject(List<Subject> subject){
    mSubjects.addAll(subject);
  }
  public void removeSubject(int code)//subid a index na reference ma levanu hoy etle
  {
    int index = -1;
    for(int i=0;i<mSubjects.size();i++){
      Subject subject = mSubjects.get(i);
      if(subject.getCode() == code){
        index = i;
        break;
      }
    }

    if(index != -1){
      mSubjects.remove(index);
    }
  }
  public void removeAllSubject(){
    mSubjects.removeAll(mSubjects);
  }
  public void removeSubject(Subject subject)//subject na object ni return type object hoy etle
  {
    mSubjects.remove(subject);
  }
  public List<Subject> getAllSubject(){
    return mSubjects;
  }
 
  public String getName(){
    return mName;
  }
}



