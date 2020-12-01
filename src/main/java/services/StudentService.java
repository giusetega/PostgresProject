package services;

import entities.Address;
import entities.Exam;
import interfaces.StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Set;

public class StudentService implements StudentDao {

    
    private static String selectNames = "SELECT name FROM students";

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getCognome() {
        return null;
    }

    @Override
    public Address getIndirizzo() {
        return null;
    }

    @Override
    public Set<Exam> getEsami() {
        return null;
    }
}
