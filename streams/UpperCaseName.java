package streams;


import java.util.ArrayList;
import java.util.List;

//ntt data asked quetion
public class UpperCaseName {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(10000,"Akash" ));
        studentList.add(new Student(20000,"Sumit" ));
        studentList.add(new Student(30000,"Raj" ));
        studentList.add(new Student(40000,"Samyak" ));
        studentList.add(new Student(50000,"Bankhu" ));

        studentList.stream().map(b ->{
            Student student  = new Student(b.getSalary(), b.getName().toUpperCase());
            return student;
        }).forEach(c -> System.out.println(c.getName() + " " + c.getSalary()));

    }
}

