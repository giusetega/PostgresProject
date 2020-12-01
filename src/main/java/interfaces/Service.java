package interfaces;

import entities.Address;
import entities.Exam;
import entities.Student;

import java.util.Set;

public interface Service {
    public Set<Student> getStudenti();
    public Set<Exam> getEsami();
    public Set<Address> getndirizzi();
}
