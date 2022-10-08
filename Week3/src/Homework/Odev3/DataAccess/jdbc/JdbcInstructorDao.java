package Homework.Odev3.DataAccess.jdbc;

import Homework.Odev3.DataAccess.InstructorDao;
import Homework.Odev3.Entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eğitmen eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile eğitmen silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile eğitmen güncellendi.");
    }
}
