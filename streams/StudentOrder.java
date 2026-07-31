package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//sorted by salaryin  in desc
public class StudentOrder {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(10000,"Akash" ));
        studentList.add(new Student(20000,"Sumit" ));
        studentList.add(new Student(30000,"Raj" ));
        studentList.add(new Student(40000,"Samyak" ));
        studentList.add(new Student(50000,"Bankhu" ));


//        List<Student> sortedList = studentList.stream()
//                .sorted((a,b) -> b.getSalary()-a.getSalary() )
//                .limit(3)
//                .collect(Collectors.toList());
        List<Student> sortedListLessTahnThree = studentList.stream()
                .sorted(Comparator.comparing(Student::getSalary).reversed())
                .skip(3)
                .collect(Collectors.toList());

//        sortedList.forEach(a-> System.out.println(a.getName() + " " + a.getSalary()));
        sortedListLessTahnThree.forEach(a-> System.out.println(a.getName() + " " + a.getSalary()));
    }
}
