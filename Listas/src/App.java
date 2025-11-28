import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List <String> list = new ArrayList<>();

        String name = "Alex";
        list.add(name);
        list.add("bob");
        list.add("Anna");
        list.add(2, "Marco");
        list.add("Maria");
    
        System.out.println(list.size());


        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------");

        list.removeIf(x -> x.charAt(0) == 'M' );
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------");

        System.out.println("index of bob: " + list.indexOf("bob"));
        System.out.println("index of Marco: " + list.indexOf("Marco"));
        
        System.out.println("----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
 
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------------");

        name = list.stream().filter(x -> x.charAt(0) == 'q').findFirst().orElse(null);
        System.out.println(name);
        
    }
}
