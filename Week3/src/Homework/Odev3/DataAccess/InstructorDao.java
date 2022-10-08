package Homework.Odev3.DataAccess;

import Homework.Odev3.Entities.Category;
import Homework.Odev3.Entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);

    void delete(Instructor instructor);

    void update(Instructor instructor);

}
