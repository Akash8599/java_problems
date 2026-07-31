package streams;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary {
    public static void main(String[] args) {
        List<StudentTest> studentList = new ArrayList<>();

        studentList.add(new StudentTest(12, "Akash", 60000, "MECH"));
        studentList.add(new StudentTest(12, "Akash", 60000, "MECH"));
        studentList.add(new StudentTest(12, "Akash", 20000, "MECH"));
        studentList.add(new StudentTest(13, "Sumit", 70000, "MECH"));
        studentList.add(new StudentTest(11, "Raj", 70000, "IT"));
        studentList.add(new StudentTest(17, "Samyak", 80000, "IT"));

        studentList.add(new StudentTest(18, "Bankhu", 90000, "IT"));
        studentList.add(new StudentTest(18, "Bankhu", 20000, "IT"));
        studentList.add(new StudentTest(18, "Bankhu", 10000, "IT"));

//       Optional<streams.StudentTest> high=  studentList.stream().sorted((a,b)-> Integer.compare(b.getSalary(),a.getSalary())).findFirst();
//       Optional<streams.StudentTest> high=  studentList.stream().max(Comparator.comparing(a-> a.getSalary()));
//        System.out.println(high.get(high.size()-1).getName() + " : " + high.get(high.size()-1).getSalary());

//         Map<String, streams.StudentTest> high = studentList.stream().sorted((a,b) -> Integer.compare(b.getSalary(), a.getSalary())).collect(Collectors.groupingBy(a  -> a.getDept()))
//                 .entrySet().stream().collect(Collectors.toMap(item -> item.getKey(), item-> item.getValue().get(0)));

//        Map<String, Optional<Student>> high = studentList.stream().collect(Collectors.groupingBy(s-> s.getDept(), Collectors.maxBy(Comparator.comparing(a -> a.getSalary()))));
////                 gaddamvar
////        if (high.isPresent()){
////            System.out.println(high.get().getSalary());
////        }
//
//
//        for (Map.Entry a : high.entrySet()){
//
//            System.out.println(a.getKey()+ " "+ a.getValue());
//        }
        List<StudentTest> result = studentList.stream()
                .sorted(Comparator.comparing(StudentTest::getName)
                        .thenComparing(StudentTest::getAge))
                .collect(Collectors.groupingBy(
                        student -> student.getName() + " " + student.getAge(),
                        LinkedHashMap::new,
                        Collectors.reducing((s1, s2) ->
                                new StudentTest(s1.getAge(), s1.getName(), s1.getSalary() + s2.getSalary() , s1.getDept())
                        )
                ))
                .values()
                .stream()
                .map(m->{
                    return m.orElse(null);



                }) // Extracts the StudentTest object from Optional
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
