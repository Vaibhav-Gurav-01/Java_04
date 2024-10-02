/*5.Implement Multilevel Inheritance with Method Overriding
    Create a base class Person.Create a subclass Employee that extends Person, and includes the methods work() and getSalary().Create another subclass HRManager that extends Employee, overrides the work() method, and adds a new method addEmployee() to simulate adding employees.
*/

package Five;

public class Person {
    
    public void displayInfo() {
        System.out.println("This is a person.");
    }
}

