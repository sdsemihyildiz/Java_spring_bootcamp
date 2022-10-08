package Homework.Odev3.DataAccess;

import Homework.Odev3.Entities.Category;
import Homework.Odev3.Entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);

    void delete(Course course);

    void update(Course course);

}
