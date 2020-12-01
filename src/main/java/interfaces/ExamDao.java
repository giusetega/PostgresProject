package interfaces;

import entities.Student;

import java.util.Set;

public interface ExamDao {
    public String getNome();
    public Set<Student> getStudenti();
}
