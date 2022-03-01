package Objects;

public class Employee {

    String job;
    String name;
    String lastName;
    String age;

    // sortOfData

    public Employee(String name,String lastName,String age,String job){
        
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public String getJob(){
        return this.job;
    }


    
    

    
}
