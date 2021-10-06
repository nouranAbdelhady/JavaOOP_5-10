public class Employee {

    String title;
    String name;
    int mobile;    
 
    //constructor
    public Employee(String title, String name, int mobile) {
       this.title=title;
       this.name=name;
       this.mobile=mobile;
    }

    public void getDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Mobile: "+this.mobile);
    }

}