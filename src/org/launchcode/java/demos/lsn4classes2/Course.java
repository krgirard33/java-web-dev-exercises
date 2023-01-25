package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private int credits;

    public Course(String topic, Teacher instructor, int credits) {
        this.topic = topic;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // reference check
        if (o == null || getClass() != o.getClass()) return false; // null check
        Course course = (Course) o; // casts o as a Course object
        return topic.equals(course.topic) && instructor.equals(course.instructor); // compares the fields
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

}
