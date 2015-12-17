package model;

/**
 * Created by Alin.Baicu on 12/7/2015.
 */
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper {

    public StudentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentModel student = new StudentModel();
        student.setFirstName(rs.getString("firstName"));
        student.setLastName(rs.getString("lastName"));
        student.setSchool(rs.getString("school"));
        student.setRollNumber(rs.getInt("rollNumber"));
        return student;
    }
}

