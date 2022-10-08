package Homework.Odev3;

import Homework.Odev3.Business.CategoryManager;
import Homework.Odev3.Business.CourseManager;
import Homework.Odev3.Business.InstructorManager;
import Homework.Odev3.Core.Logging.BaseLogger;
import Homework.Odev3.Core.Logging.DatabaseLogger;
import Homework.Odev3.Core.Logging.FileLogger;
import Homework.Odev3.Core.Logging.MailLogger;
import Homework.Odev3.DataAccess.hibernate.HibernateCategoryDao;
import Homework.Odev3.DataAccess.hibernate.HibernateCourseDao;
import Homework.Odev3.DataAccess.hibernate.HibernateInstructorDao;
import Homework.Odev3.DataAccess.jdbc.JdbcCategoryDao;
import Homework.Odev3.DataAccess.jdbc.JdbcCourseDao;
import Homework.Odev3.Entities.Category;
import Homework.Odev3.Entities.Course;
import Homework.Odev3.Entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseLogger[] logger = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        Category category1 = new Category(1, "Programlama", "Java 2022 Camp");

        List<Category> categoryDB = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), logger, categoryDB);
        //   CategoryManager categoryManager2 = new CategoryManager(new HibernateCategoryDao(), logger, categoryDB);
        categoryManager.add(category1);

        System.out.println("---------------");

        Course course1 = new Course(1, "Java + Spring 2022", 1500.0, "URL", "Java 2022 Camp");
        List<Course> courseDB = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), logger, courseDB);
        // CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(),logger,courseDB);
        courseManager.add(course1);

        System.out.println("---------------");

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        List<Instructor> instructorDB = new ArrayList<>();
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), logger, instructorDB);
        instructorManager.add(instructor);

    }
}
