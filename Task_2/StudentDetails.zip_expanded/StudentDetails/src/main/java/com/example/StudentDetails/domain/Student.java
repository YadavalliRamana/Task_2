package com.example.StudentDetails.domain;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity

public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String studentname;
    private int Marks;
    private double Percentage;
public Student() {
 
}
public Student(Long id, String studentname, String course, int fee) {
this.id = id;
this.studentname = studentname;
this.Marks = Marks;
this.Percentage = Percentage;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getStudentname() {
return studentname;
}
public void setStudentname(String studentname) {
this.studentname = studentname;
}
public int getMarks() {
return Marks;
}
public void setMarks(int Marks) {
this.Marks = Marks;
}
public double getPercentage() {
return Percentage;
}
public void setPercentage(double Percentage) {
this.Percentage = Percentage;
}

}
