public class A5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Михаил Иванов");
        student1.setAge(19);
        student1.setKurs(2);
        student1.speak();
    }
}
class Student {
    private String name;
    private int age;
    private int kurs;
    public void setKurs(int kursStudent){
        if (kursStudent <=0){
            System.out.println("Введите число в поле курса больше нуля");
        }else {kurs = kursStudent;}
    }
    private int getKurs(){return kurs;}
    public void setName(String nameStudent){
        if (nameStudent.isEmpty()){
            System.out.println("Вы ввели пустоту");
        }else{name = nameStudent;}
    }
    public String getName(){ return name;}
    public void setAge(int ageStudent){
        if (ageStudent<=0){
            System.out.println("Возраст должен быть положительным");
        }else {age=ageStudent;}
    }
    public int getAge() {return age;}
    void speak() {
        System.out.println("Меня зовут " + name + "," + " мне " + age + " лет" + " и я студент " + kurs + " курса.");
    }
}