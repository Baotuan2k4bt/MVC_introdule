package MVC.Service.Student;
import MVC.Model.Student;

import java.util.List;

public interface InterfaceStudentService {
    List<Student> findAll();

    void addStudent(Student student);

    void updateStudent(Student student);

    Student findStudentByCode(String code);

    void deleteStudent(Student student);

}
