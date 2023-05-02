package Labs.EnterpriseJavaDevelopment42.contoller.interfaces;

import Labs.EnterpriseJavaDevelopment42.enums.Status;
import Labs.EnterpriseJavaDevelopment42.model.Doctor;

import java.util.List;
import java.util.Optional;

public interface IDoctorController {
    List<Doctor> getDoctors();
    List<Doctor> getDoctorsByStatus(Optional<Status> status);
    List<Doctor> getDoctorsByDepartment(Optional<String> department);
}
