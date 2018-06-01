import java.util.*;
import clg.*;




public class Main

{

    private static final int MODULE_STUDENT = 0;
	private static final int MODULE_TEACHER = 1;
    static List<Student> student=new ArrayList<Student>();
    static List<Teacher> teacher=new ArrayList<Teacher>();
	static List<Subject> sub=new ArrayList<Subject>();
	
	static Scanner sc=new Scanner(System.in);
	

	public static void main(String args[])
	{
		Subject subject1=new Subject();
		Subject hindi =new Subject("hindi",688,1);
		Subject guj =new Subject("guj",687,1);
		Subject english=new Subject("eng",686,1);

        
        sub.add(hindi);
        sub.add(guj);
        sub.add(english);
        
		System.out.println("welcome to knoxpo");
		
		while(true)
		{
            
			System.out.println("(1)StudentInfo\n(2)TeacherInfo\n(3)Exit\n");
		
			System.out.println("\nEnter Your Choice:");

			int Option=sc.nextInt();
			
			if(Option==1)
			{
                enterModule(MODULE_STUDENT);
			}
			else if(Option==2)
			{
                enterModule(MODULE_TEACHER);
			}
			else if(Option==3)
			{
                break;
			}
			else{
                System.out.println("oops!!!incorrect details");
            }
		}
		System.out.println("Thank u");
    }
	public static void addTeacher()
	{
        System.out.println("enter name of teacher:");
        String name=sc.next();
        System.out.println("enter salary:");
        double salary=sc.nextDouble();
        Teacher t=new Teacher(name,salary);
        teacher.add(t);

    }
	public static void addStudent()
	{
        System.out.println("enter name of student:");
        String name=sc.next();
        System.out.println("enter cpi:");
        double CPI=sc.nextDouble();
        System.out.println("enter fees:");
        double Fees=sc.nextDouble();
        Student s1=new Student(name);
        s1.setCPI(CPI);
        s1.setFees(Fees);
        student.add(s1);
	}

	public static void viewDetails(int moduleType)
    {
    System.out.println("List of " + ((moduleType == MODULE_STUDENT) ? "Students" : "Teachers"));
     List persons=null;
	 if(moduleType==MODULE_STUDENT)
	 {
	         persons=student;
		}
		 else
		 {
        	 persons=teacher;
     	}
	 
		 for (int i = 0; i < persons.size(); i++)
		{
        	Person person = (Person)persons.get(i);
        	String name = person.getName();
			if(person instanceof Student)
			{
            Student s2=(Student)person;
            double CPI=s2.getCPI();
            double Fees=s2.getFees();
            System.out.println("student:"+name+"has cpi"+CPI+"pays amount"+Fees);
			}
			else if(person instanceof Teacher)
			{
            Teacher t=(Teacher)person;
            double salary=t.getSalary();
            System.out.println("teacher:"+name+"has salary"+salary);

    		}
		}
	}


	public static void addSubjectToPerson(int moduleType)
    {
        List persons = null;
		String nameType = null;
		if(moduleType == MODULE_STUDENT)
		{
			persons = student;
			nameType = "student";
		}
		else if(moduleType == MODULE_TEACHER)
		{
        persons=teacher;
        nameType="teacher";
		}
		else
		{
        System.out.println("no any modules:"+moduleType);
        return;
    	}
    	System.out.println("Enter "+ nameType +" name");
		String personName = sc.next();
		Person foundPerson = null;
		for (int i = 0; i < persons.size(); i++)
		{
			Person existingPerson = (Person)persons.get(i);
			if (existingPerson.getName().equalsIgnoreCase(personName))
			 {
				foundPerson = existingPerson;
				break;
            }
            else if(foundPerson==null){
                System.out.println("no"+nameType+"found with name:"+personName);
                return;
			}
			else{

			}
		}
		

		int c=0;
		while(c!=-1)
		{
    	System.out.println("\n CHOOSE OPERATION FOR " + personName);
				System.out.println("\n  [1] View subjects \n [2] Add Subject \n [3] Go Back");
				int Choice = sc.nextInt();
	  			switch(Choice)
        		{
            		case 1: 
                	List<Subject> subjects = foundPerson.getAllSubject();
					for(int j=0;j<subjects.size();j++)
					{
                    	Subject name=subjects.get(j);
                    	System.out.println(name);
                	}
			 		break;

            		case 2:
              		System.out.println("add subjects:");
			  		for(int j=0;j<sub.size();j++)
			  		{
                  		Subject name=sub.get(j);
                 		 System.out.println(name);
              		}
              		int subAddToPerson=sc.nextInt();
			  		try
			  		{
                  		Subject selectedSubject=sub.get(subAddToPerson);
                  		foundPerson.addSubject(selectedSubject);
			 		}
			  		catch(Exception e)
			  		{
                  		System.out.println("invalid input");
              		}
             		 break;

           			case 3: 
                		c =-1;
                		break;
            		default:
                		System.out.print("sorry");

        
                }
    
		}
	}
	public static void enterModule(int moduleType)
	{
        if(moduleType==MODULE_STUDENT)
        {
            System.out.println("student module");

		}
		else if(moduleType==MODULE_TEACHER)
		{
            System.out.println("teacher module");
        }
        int a=0;
		while(a!=-1)
		{
            System.out.println("choose operation:");
            System.out.println("[1]add\n [2]view details\n [3]manipulate\n");
            int stdChoice=sc.nextInt();
			switch(stdChoice)
			{
                case 1:
						if(moduleType==MODULE_STUDENT)
							{
                    			addStudent();
							}
						else if(moduleType==MODULE_TEACHER)
							{
                    		addTeacher();
							}
						else
						{
           		         System.out.println("wrong module:"+moduleType);
               			 }
                break;
                case 2:
                       viewDetails(moduleType);
                       break;
                case 3:
                      addSubjectToPerson(moduleType);
                      break;
                case 4:
                       a=-1;
                       break;
                default:
                  System.out.println("wrong input given");
            }
        }
    }
}


        