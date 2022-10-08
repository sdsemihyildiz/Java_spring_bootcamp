package Homework.Odev3.DataAccess.hibernate;

import Homework.Odev3.DataAccess.InstructorDao;
import Homework.Odev3.Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen güncellendi.");
    }
}
