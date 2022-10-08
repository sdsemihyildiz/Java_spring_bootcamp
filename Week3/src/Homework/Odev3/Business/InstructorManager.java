package Homework.Odev3.Business;

import Homework.Odev3.Core.Logging.BaseLogger;
import Homework.Odev3.DataAccess.InstructorDao;
import Homework.Odev3.Entities.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private BaseLogger[] loggers;
    private List<Instructor> instructors;

    public InstructorManager(InstructorDao instructorDao, BaseLogger[] loggers, List<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructors = instructors;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (BaseLogger logger : loggers) {
            logger.log(instructor.getInstructorId() + " " + instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName() + "\n" + instructor.getInstructorDetail());
        }
    }
}
