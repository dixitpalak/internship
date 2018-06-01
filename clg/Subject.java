package clg;
import java.util.*;
public class Subject {
    private String mName;//hnmesha private lkhvu agal declare krti vkhte
    private int mCode;
    private int mSyllabus;
    
    
        public Subject(){//jo aa ekey sathe sanklayelo hoy tyare hnmesha public lkhvu costructor ni agal

            mName="hindi";
            mCode=299877;
            mSyllabus=10;
            

        }
        public Subject(String name,int code,int syllabus){
            mName=name;
            mCode=code;
            mSyllabus=syllabus;
            
            
        }

        public int getCode(){
            return mCode;
        }

        public String toString(){
            return "code:"+mCode+"syllabus:"+mSyllabus+"name:"+mName;
        }
        
    
}
