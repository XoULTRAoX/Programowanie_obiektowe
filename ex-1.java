class Student{  
    int id;  
    String name; 
    String surname;  
    void insertRecord(int i, String n, String s){  
        id=i;  
        name=n; 
        surname=s;
    }
}  
class Teacher{
    int id;  
    String name; 
    String surname; 
    void insertRecord(int i, String n, String s){  
        id=i;  
        name=n; 
        surname=s;
    }
}
class Grade{
    int student_id;
    int teacher_id;
    int grade;
    void insertGrade(int s, int t, int g){  
        student_id=s;  
        teacher_id=t; 
        grade=g;
    }
}
class Student_record{ 
    public static void main(String args[]){  
        Student s1=new Student();  
        Student s2=new Student(); 
        s1.insertRecord(1540111,"Szymon","Nowak");  
        s2.insertRecord(1540112,"Eryk","Komrat");  
        System.out.println(s1.id+" "+s1.name+" "+s1.surname+"\n");
        System.out.println(s2.id+" "+s2.name+" "+s2.surname+"\n");
        Teacher t1=new Teacher();
        Teacher t2=new Teacher();
        t1.insertRecord(154,"Adam","Kamyk");  
        t2.insertRecord(155,"Ewa","Kmur");  
        System.out.println(t1.id+" "+t1.name+" "+t1.surname+"\n");
        System.out.println(t2.id+" "+t2.name+" "+t2.surname+"\n");
        Grade g1=new Grade();
        Grade g2=new Grade();
        g1.insertGrade(15440111,154,4);
        g2.insertGrade(15440111,155,5);
        System.out.println(g1.student_id+" "+g1.teacher_id+" "+g1.grade+"\n");
        System.out.println(g2.student_id+" "+g2.teacher_id+" "+g2.grade);
 }  
}  
