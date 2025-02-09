class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  
}  
public class info {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    e1.insert(001,"Aryan",250000);  
    e2.insert(004,"Avinash",250000);  
    e3.insert(025,"nakul",250000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  