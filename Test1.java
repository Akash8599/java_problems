import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        // rocky, uno, tiger, pooja, ram

        List<String> list = new ArrayList<>();

        list.add("rocky");
        list.add("uno");
        list.add("tiger");
        list.add("pooja");
        list.add("ram");

//        List<String> newList =


        List<String> upparCase = list.stream().map( element-> element.substring(Math.max(element.length()-2,0)))
                .collect(Collectors.toList());

        System.out.println(upparCase.toString());




    }
}
