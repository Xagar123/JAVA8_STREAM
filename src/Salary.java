import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Salary {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Alok", "Design", 50000),
                new Employee("Rahul", "IT", 25000),
                new Employee("Suman", "Workshop", 27000),
                new Employee("Vivek", "Hr", 30000),
                new Employee("meena", "Hr", 13000));

        try {
            Optional<Employee> SalaryComparision = list.stream().filter(p -> p.getDepartment().equalsIgnoreCase("driving")).max(Comparator.comparing(Employee::getSalary));
            System.out.println(SalaryComparision);
        } catch (Exception e) {
            System.out.println("This department dont exit");
        }
        Employee Empsalary = list.get(0);

        for(int i = 0; i < list.size(); i++){
            if (Empsalary.getSalary() > list.get(i).getSalary()){
                if(list.get(i).getDepartment().equalsIgnoreCase("it")){
                    Empsalary = list.get(i);
                }
            }
        }
        System.out.println(Empsalary);


    }
}
