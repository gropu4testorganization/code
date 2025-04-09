/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import domain.FieldOfStudy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ChalewT
 */
public class FieldOfStudyPersistence implements IFieldOfStudyPersistence {

    @Override
    public boolean save(FieldOfStudy fieldOfStudy) throws SQLException {
        int affectedRow;
        String query = "Insert into field_of_study (name, departmentid) Values(?,?)";
        
        // Establish connection and execute query
        try (Connection conn = DbConnection.getConnection()) {
            try (PreparedStatement prepare = conn.prepareStatement(query)) {
                prepare.setString(1, fieldOfStudy.getName());
                prepare.setInt(2, fieldOfStudy.getDepartmentId());
                affectedRow = prepare.executeUpdate();
            }
        }
        
        // Return true if at least one row was affected (insert successful)
        return affectedRow > 0;
    }

}

