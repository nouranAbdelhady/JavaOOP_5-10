public class App {
    public static void main(String[] args) throws Exception {
        
        Employee emp1 = new Employee("SE", "Nouran", 012);
        Employee emp2 = new Employee("SE", "Sam", 013);
        Employee emp3 = new Employee("HR", "Nancy", 01);

        Departments depObj = new Departments();
        depObj.addCounter(emp1);
        depObj.addCounter(emp2);
        depObj.addCounter(emp3);

        depObj.display();

    }
}
