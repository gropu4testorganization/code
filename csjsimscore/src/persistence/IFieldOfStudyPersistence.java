/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistence;

import domain.FieldOfStudy;
import java.sql.SQLException;

/**
 *
 * @author ChalewT
 */
public interface IFieldOfStudyPersistence {
    boolean save(FieldOfStudy fieldOfStudy) throws SQLException;
}
