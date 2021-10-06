import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Employee> employees = Arrays.asList(
            new Employee("SE", "Nouran", 1236), 
            new Employee("ASE", "Zeina", 9876),
            new Employee("SE", "Sam", 13897),
            new Employee("HR", "Zeyad", 9523),
            new Employee("ASE", "Farah", 8532),
            new Employee("ASE", "Amr", 98563)
        );
          
        Departments depObj = new Departments();
        for (Employee employee : employees) {
            depObj.update(employee);
        }
        
        depObj.display();

    }
}
