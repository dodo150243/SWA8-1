
public class Client {
public static void main(String[] args) {
Person john = new Person("Mr","John",25);
Employee emp = new Employee(john,5000);
emp.showDetail();
}
}

