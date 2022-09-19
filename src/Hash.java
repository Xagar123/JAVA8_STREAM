

import java.util.*;
import java.util.stream.Collectors;

public class Hash {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Sunny", "Hr", 16000),
                new Employee("Gunjun", "IT", 25000),
                new Employee("Honey", "Hr", 17000));
       Optional<Employee> emp1 = list.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("Minimum salary"+ emp1.get().getName());

        //Counting the total hr
        long departmentlist = list.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Hr")).count();

        System.out.println("Total count of Hr department is : " + departmentlist);

        //Counting the total employee in each department

        Map<String, Long> empCountinDpt = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        empCountinDpt.entrySet().forEach(enter -> {
            System.out.println("Department " + enter.getKey() + " Total Employee  " + enter.getValue());
        });


    }
}


