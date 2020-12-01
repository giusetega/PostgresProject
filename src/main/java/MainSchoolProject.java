import entities.Student;

import java.sql.*;

public class MainSchoolProject {
   /*
    Studenti(id, nome,cognome)
    Info(telefono)
    Indirizzi(id,nome)
    Esami(nome,data)
    */

    private static String crTableStudents = "CREATE TABLE students (id_student SERIAL PRIMARY KEY, firstname TEXT NOT NULL, lastname TEXT NOT NULL)";
    private static String crTableInfo = "CREATE TABLE info (id_info SERIAL PRIMARY KEY, telefono TEXT NOT NULL)";
    private static String crTableAddresses = "CREATE TABLE addresses (id_address SERIAL PRIMARY KEY, name TEXT NOT NULL)";
    private static String crTableExams = "CREATE TABLE exams (id_exam SERIAL PRIMARY KEY, name TEXT NOT NULL, date DATE)";

    public static void main(String[] args) {
        Connection db = null;
        try {
            //Class.forName("org.postgresql.Driver");
            db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school_project", "postgres", "0000");

            Statement st = db.createStatement();

//            Student.

            st.execute(crTableStudents);
            st.execute(crTableInfo);
            st.execute(crTableAddresses);
            st.execute(crTableExams);


//            ResultSet resultSet = st.executeQuery(crTableStudents);
//            while(resultSet.next()) {
//                System.out.println(resultSet.getString("country"));
//            }

            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.print("Hello!");
    }

}
