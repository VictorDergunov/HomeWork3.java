public class Person {
    String name;
    String email;
    int age;

    public Person(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public void info(){
        System.out.println("Имя: " + this.name + " Почта: " + this.email + " Возраст: " + this.age);
    }
}


