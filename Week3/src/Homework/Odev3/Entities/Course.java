package Homework.Odev3.Entities;

public class Course {
    private int courseId;
    private String courseName;
    private double coursePrice;
    private String courseImageUrl;
    private String courseDescription;

    public Course(int courseId, String courseName, double coursePrice, String courseImageUrl, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseImageUrl = courseImageUrl;
        this.courseDescription = courseDescription;
    }

    public Course(int courseId, String courseName, double coursePrice, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseDescription = courseDescription;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseImageUrl() {
        return courseImageUrl;
    }

    public void setCourseImageUrl(String courseImageUrl) {
        this.courseImageUrl = courseImageUrl;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
