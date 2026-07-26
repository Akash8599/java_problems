import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SeniorCitizenEmployee {
    public static void main(String[] args) {
        List<SeniorCitizen> list = Arrays.asList(new SeniorCitizen("Akash", 1, LocalDate.of(1940, 1, 7)),
                new SeniorCitizen("Samyak", 2, LocalDate.of(1930, 1, 7)),
                new SeniorCitizen("Raj", 3, LocalDate.of(1990, 1, 7)));


        List<SeniorCitizen>  seniorCitizens = list.stream().filter(a -> (LocalDate.now().getYear() - a.getDob().getYear()) > 60).collect(Collectors.toList());
        seniorCitizens.forEach(System.out::println);
    }
}
