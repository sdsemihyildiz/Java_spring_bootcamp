package Homework.Odev3.Business;

import Homework.Odev3.Core.Logging.BaseLogger;
import Homework.Odev3.DataAccess.CourseDao;
import Homework.Odev3.Entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("kurs fiyatı 0 dan küçük olamaz");

        }
        for (Course c : courses) {
            if (c.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs adı daha önce kullanılmış, başka bir isim seçiniz.");
            }
        }
        courseDao.add(course);
        courses.add(course);
        for (BaseLogger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }
}
