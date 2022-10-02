package inheritance.pkginterface;
public class InheritanceInterface {
    public static void main(String[] args) {
        System.out.println("==============EMPLOYEE=================");
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[1] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
       
        System.out.println("Before Sorting And didnt get Raise Salary");
        for (i = 0; i < 3; i++) staff[i].print();
        Sortable.shell_sort(staff);
        System.out.println("");
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        System.out.println("After Sorting And Raise Salary");
        for (i = 0; i < 3; i++) staff[i].print();
        
        System.out.println("");
        System.out.println("==============MANAGER==================");
        Employee[] staf = new Employee[3];
        staf[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staf[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staf[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
    }
}
