import java.util.LinkedList;

public class Departments {
    String title;
    int counter;

    LinkedList<Departments> departments = new LinkedList<Departments>();
    LinkedList<Employee> employees = new LinkedList<Employee>();
 
    public void addCounter(Employee object){
        boolean found=false;
        for (int i=0; i<departments.size();i++)
        {
            if (object.title==departments.get(i).title){
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
        for (int i=0; i<departments.size();i++)
        {
            if (departments.get(i).counter>1){
                System.out.println("Regular Title: " + departments.get(i).title);
            }
            else {
                System.out.println("Special Title: "+ departments.get(i).title);
            }

            for(int j=0; j<employees.size();j++){
                if (employees.get(j).title==departments.get(i).title){
                    System.out.println("Name: "+employees.get(j).name);
                    System.out.println("Mobile: "+employees.get(j).mobile);
                }
            }
            System.out.println();
        }  
    }

    Departments(String title,int counter){
        this.title=title;
        this.counter=counter;
    }

    Departments(){ }

}
