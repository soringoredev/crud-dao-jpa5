package pixel.academy.crud_app.dao;

import pixel.academy.crud_app.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);
    // comment
    Student findById(Integer id);
    // comm 2
    List<Student> findAll();
    //comm 3
}
