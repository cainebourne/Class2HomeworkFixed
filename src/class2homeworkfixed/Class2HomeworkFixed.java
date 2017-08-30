
package class2homeworkfixed;

/**
 *
 * @author Cainebourne
 */
public class Class2HomeworkFixed {

    public static void main(String[] args) {
         Person p = new Person("John", "Miller", 35);
         Person p2 = new Person("Mary", "Miller", 32);

   System.out.println("First Name: " + p.getFirstName());
   System.out.println("Last Name: " + p.getLastName());
   System.out.println("Age: " + p.getAge());
   
   System.out.println("First Name: " + p2.getFirstName());
   System.out.println("Last Name: " + p2.getLastName());
   System.out.println("Age: " + p2.getAge());
    }
    
}
