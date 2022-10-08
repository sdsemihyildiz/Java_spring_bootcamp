package Homework.Odev3.DataAccess.jdbc;

import Homework.Odev3.DataAccess.CourseDao;
import Homework.Odev3.Entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile kurs eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("JDBC ile kurs silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("JDBC ile kurs güncellendi.");
    }
}
