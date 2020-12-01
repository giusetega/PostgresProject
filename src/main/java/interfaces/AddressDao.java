package interfaces;

import entities.Student;

import java.util.Set;

public interface AddressDao {
    public String getNome();
    public Set<Student> getStudenti();
}
