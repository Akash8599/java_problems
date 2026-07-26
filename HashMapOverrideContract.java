import java.util.HashMap;
import java.util.Objects;

public class HashMapOverrideContract
{


    public static void main(String[] args) {

        HashMap<Student1, String> map = new HashMap<>();
        Student1 s1 = new Student1("Tejas");
        Student1 s2 = new Student1("Tejas"); // Different object but logically equal


        map.put(s1, "Java Expert");

        System.out.println(map.get(s1));
        System.out.println(map.get(s2));


    }
}

class Student1 {
    private String name;

    Student1(String name ){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if(obj == null || getClass() !=  obj.getClass()) return  false;

        Student1 student1 = (Student1) obj;

        return Objects.equals(name, student1.name);

    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }


}
