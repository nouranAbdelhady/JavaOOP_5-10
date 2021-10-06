import java.util.LinkedList;

public class Departments {
    String depTitle;
    int counter;

    LinkedList<Departments> departments = new LinkedList<Departments>();
    LinkedList<Employee> employees = new LinkedList<Employee>();

    Departments(){ }

    Departments(String title,int counter){
        this.depTitle=title;
        this.counter=counter;
    }
 
    public void update(Employee object){
        boolean found=false;
        for (int i=0; i<departments.size();i++)
        {
            if (object.title==departments.get(i).depTitle){
                departments.get(i).counter++;
                found=true;
            }
        }
        if (!found){
            Departments depObj = new Departments(object.title,1);
            departments.add(depObj);
        }
        employees.add(object);
    }

    public void display(){
        for (Departments eachDepartment : departments) {
            {
                //lambda to get special/regular title based on departement count
                SpecialTitle sp;
                sp=eachDepartment.getTitle();            
                System.out.println(sp.check(eachDepartment)+eachDepartment.depTitle);
    
                for (Employee eachEmployee : employees) {
                    if (eachEmployee.title==eachDepartment.depTitle){
                        System.out.println("Name: "+eachEmployee.name);
                        System.out.println("Mobile: "+eachEmployee.mobile);
                    }
                }
                System.out.println();
            }
        }      
    }

    public SpecialTitle getTitle() {
        return (Departments dep) -> {
            if (dep.counter>1) { return "Regular Title: "; }
            return "Special Title: ";
        };
    }
    interface SpecialTitle {
        String check(Departments emp);
    }

    public static String checkTitle(SpecialTitle sp, Departments dp) {
        return sp.check(dp);
    }

}
