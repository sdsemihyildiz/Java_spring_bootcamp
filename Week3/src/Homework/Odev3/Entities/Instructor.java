package Homework.Odev3.Entities;

import java.util.List;

public class Instructor {
    private int instructorId;
    private String instructorFirstName;
    private String instructorLastName;
    private String photoUrl;
    private String instructorDetail;
    private List<Course> courses;

    public Instructor(int instructorId, String instructorFirstName, String instructorLastName) {
        this.instructorId = instructorId;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
    }

    public Instructor(int instructorId, String instructorFirstName, String instructorLastName, String photoUrl, String instructorDetail, List<Course> courses) {
        this.instructorId = instructorId;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.photoUrl = photoUrl;
        this.instructorDetail = instructorDetail;
        this.courses = courses;
    }

    public Instructor(int instructorId, String instructorFirstName, String instructorLastName, String instructorDetail, List<Course> courses) {
        this.instructorId = instructorId;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.instructorDetail = instructorDetail;
        this.courses = courses;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getInstructorDetail() {
        return instructorDetail;
    }

    public void setInstructorDetail(String instructorDetail) {
        this.instructorDetail = instructorDetail;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
