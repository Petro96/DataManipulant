package ReadFile;

import java.io.*;
import java.util.*;

import Objects.Student;
import Objects.Employee;

public class ReadFile{

    static String[] arrOfData;

    static ArrayList<Student> ArrayListOfStudents = new ArrayList<Student>();

    static ArrayList<Employee> arrayListOfEmployees = new ArrayList<Employee>();

    String name;
    String lastName;
    int age;
    String status;
    String nameOfCompany,nameOfFaculty;

    public ReadFile(String fileName){

        try{

            BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
            
            String s;

            while((s=reader.readLine())!=null){

                arrOfData = s.split("-");

                if(arrOfData[3].equals("Student")){
                    var student = new Student(arrOfData[0],arrOfData[1],arrOfData[2],arrOfData[4]);
                    ArrayListOfStudents.add(student);
                }
                if(arrOfData[3].equals("Employee")){
                    var employee = new Employee(arrOfData[0],arrOfData[1],arrOfData[2],arrOfData[4]);
                    arrayListOfEmployees.add(employee);
                }
                System.out.println(s);

            }


        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }


    }

    public static void printArraOfData(){

        System.out.println("Array of data: "+Arrays.toString(arrOfData));

    }

    public static void printArrayListOfStudents(){
        System.out.println("Array list: "+ArrayListOfStudents);
    }

    public static void printStudentsInfo(){
        for(Student student:ArrayListOfStudents){
            System.out.println(student.getName()+" his faculty: "+student.getFaculty());
        }
    }

    public static void printEmployeeInfo(){
        for(Employee employee:arrayListOfEmployees){
            System.out.println(employee.getName()+" his job : "+employee.getJob());
        }
        
    }


}