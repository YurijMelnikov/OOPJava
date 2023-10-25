package HomeWork3;


import java.util.*;

class Main {
    public static void main(String[] args) {
        //Список сотрудников
        List<Employee> listEmployee = new ArrayList<>();
        //3 массива, имя, фамилия и отдел, на основе которых будут генерироваться сотрудники случайным образом
        String [] firstName = {"Михаил", "Лев", "Егор","Ярослав","Степан","Дмитрий", "Егор", "Илья","Иван","Михаил","Ярослав","Кирилл","Тигран","Марк","Никита","Фёдор","Алексей","Никита","Дмитрий","Игорь"};
        String [] secondName = {"Соловьев","Шубин","Поляков","Давыдов","Карпов","Фролов","Денисов","Моргунов","Стариков","Головин","Титов","Панин","Козлов","Николаев","Черепанов","Ковалев","Быков","Давыдов","Емельянов"};
        String [] department = {"Финансы", "Бухгалтерия", "Продажи", "Закупки", "Контроль качества", "HR"};
        Random rnd = new Random();
        //Цикл наполнения списка сотрудников, возраст, зарплата - задаётся случайно в определённом диапазоне, а ФИО и отдел берётся случайном образом из массивов
        for (int i = 0; i < 20; i++) {
            listEmployee.add(new Employee(secondName[rnd.nextInt(0, secondName.length)] + " " + firstName[rnd.nextInt(0, firstName.length)],
                                            rnd.nextInt(18,46),
                                            rnd.nextInt(30000,100001),
                                            department[rnd.nextInt(0, department.length)]));
        }
        //Я реализовал 2 способа сортировки, через stream без изменения самого списка и через Collections.sort,
        // который меняет порядок элементов в списке и печатью этого списка с помощью дополнительного метода
        System.out.println("Вывод не отсортированного списка");
        print(listEmployee);
        System.out.println("\nСтандартная сортировка по ФИО");
        //Стандартную сортировку задал по ФИО
        listEmployee.stream().sorted().forEach(System.out::println);
        System.out.println("\nСортировка по возрастанию возраста");
        //Сортировка по возрастанию возраста
        listEmployee.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
        System.out.println("\nСортировка по убыванию зарплаты");
        //Сортировка по убыванию зарплаты
        listEmployee.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("\nСортировка в алфавитном порядке по наименованию отдела");
        //Сортировка в алфавитном порядке по наименованию отдела
        listEmployee.stream().sorted(Comparator.comparing(Employee::getDepartment)).forEach(System.out::println);
        Collections.sort(listEmployee);
        System.out.println("\nСтандартная сортировка по ФИО");
        print(listEmployee);
        System.out.println("\nСортировка по возрастанию возраста");
        Collections.sort(listEmployee, Comparator.comparingInt(Employee::getAge));
        print(listEmployee);
        System.out.println("\nСортировка по убыванию зарплаты");
        Collections.sort(listEmployee, Comparator.comparingInt(Employee::getSalary).reversed());
        print(listEmployee);
        System.out.println("\nСортировка в алфавитном порядке по наименованию отдела");
        Collections.sort(listEmployee, Comparator.comparing(Employee::getDepartment));
        print(listEmployee);


    }
    private static void print(List list){
        for (Object item: list
        ) {
            System.out.println(item);
        }
    }
}