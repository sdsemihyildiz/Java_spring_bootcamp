package Homework.Odev3.DataAccess.hibernate;

import Homework.Odev3.DataAccess.CourseDao;
import Homework.Odev3.Entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile kurs silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile kurs güncellendi.");
    }
}
