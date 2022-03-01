package Objects;

public class Student {

    String name;
    String lastName;
    String age;
    String faculty;

    //sortOfData

    public Student(String name,String lastName,String age,String faculty){
        
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.faculty = faculty;
    }

    public String getName(){
        return this.name;
    }

    public String getFaculty(){
        return this.faculty;
    }
    
}
