/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.FieldOfStudy;
import java.sql.SQLException;
import persistence.FieldOfStudyPersistence;
import persistence.IFieldOfStudyPersistence;

/**
 * Service layer that handles the business logic for field of study operations.
 */
public class FieldOfStudyService implements IFieldOfStudyService {

    private final IFieldOfStudyPersistence fieldOfStudyPersistence;

    // Constructor injection (Dependency Injection)
    public FieldOfStudyService(IFieldOfStudyPersistence fieldOfStudyPersistence) {
        this.fieldOfStudyPersistence = fieldOfStudyPersistence;
    }

    /**
     * Registers a new field of study.
     * 
     * @param fieldOfStudy The field of study to register.
     * @return boolean indicating success or failure.
     * @throws SQLException If an error occurs during the database operation.
     */
    @Override
    public boolean register(FieldOfStudy fieldOfStudy) throws SQLException {
        try {
            // Attempt to save the field of study in the persistence layer
            return fieldOfStudyPersistence.save(fieldOfStudy);
        } catch (SQLException e) {
            // Log the exception (this could be done via a logger)
            System.err.println("Error registering field of study: " + e.getMessage());
            throw e; // Re-throw or handle as needed
        }
    }
}




 

