import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    /*
    Ввод информации о студентах;
    Вывод списка студентов.
+ Создайте класс Student с полями name, group, studentId. Тип каждого поля – String.
+ Переопределите методы hashcode и equals для класса Student так,
чтобы нельзя было сохранить двух студентов с одинаковым номером студенческого билета.
+ Продемонстрируйте добавление объектов класса в HashSet,
ошибку при добавлении студентов с одинаковым номером, возможность существования студентов с одинаковыми именами.
     */

    private static Set<Student> allStudents = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            } else {
                //чекнуть и исправить алгоритм - работает неверно
                String[] wtf = input.split(" ");
                allStudents.add(new Student(wtf[0], wtf[1], wtf[2]));
                for (Student allStudent : allStudents) {
                    if (wtf[2].equals(allStudent.getStudentId())){
                        System.out.println("Студент с таким номер студенческого билета уже существует!");
                    }
                }
            }
        }
        showStudents(allStudents);
    }
    public static void showStudents(Set<Student> students) {
        System.out.println("Список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}