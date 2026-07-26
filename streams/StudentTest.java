package streams;

public class StudentTest {
    private int age;

    private String name;
    private int salary;

    private String dept;

    public StudentTest(int age, String name, int salary, String dept) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }



    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public StudentTest(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "streams.StudentTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
