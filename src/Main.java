public class Main {
    public static void main(String[] args) {
        TeacherRepository teacherRepository = new TeacherGroup();
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView, teacherRepository);

        // Создание учителей
        Teacher teacher1 = new Teacher("John Doe", 35, "Math");
        Teacher teacher2 = new Teacher("Jane Smith", 40, "English");
        Teacher teacher3 = new Teacher("David Johnson", 30, "Science");

        // Добавление учителей в группу
        teacherController.createTeacher(teacher1.getName(), teacher1.getAge(), teacher1.getSubject());
        teacherController.createTeacher(teacher2.getName(), teacher2.getAge(), teacher2.getSubject());
        teacherController.createTeacher(teacher3.getName(), teacher3.getAge(), teacher3.getSubject());

        // Отображение списка учителей в группе
        teacherController.displayTeachers();

        // Создание и отображение нового учителя
        teacherController.createTeacher("Bob Williams", 45, "History");

        // Редактирование учителя и отображение изменений
        teacherController.editTeacher(teacher1, "John Doe Jr.", 36, "Mathematics");
    }
}