package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student ken = new Student("Ken",1,1,4.0);
    }
    public class Course {
        private String topic;
        private int creditHours;
        private ArrayList<Student> enrolledStudents;

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public int getCreditHours() {
            return creditHours;
        }

        public void setCreditHours(int creditHours) {
            this.creditHours = creditHours;
        }

        public ArrayList<Student> getEnrolledStudents() {
            return enrolledStudents;
        }

        public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
            this.enrolledStudents = enrolledStudents;
        }
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public String getFirstName() {
            return firstName;
        }

        private void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        private void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSubject() {
            return subject;
        }

        private void setSubject(String subject) {
            this.subject = subject;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }

        private void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
    }
}
