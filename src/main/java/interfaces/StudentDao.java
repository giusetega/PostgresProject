package interfaces;

import entities.Address;
import entities.Exam;

import java.util.Set;

public interface StudentDao {
    public Integer getId();
    public String getNome();
    public String getCognome();
    public Address getIndirizzo();
    public Set<Exam> getEsami();
}
