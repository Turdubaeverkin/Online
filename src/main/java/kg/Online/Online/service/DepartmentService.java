package kg.Online.Online.service;

import kg.Online.Online.model.Department;
import kg.Online.Online.model.Fillial;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(Department department);

    List<Department> getAllDepartment();

    Department getDepartmentById(Long depatrmentId);
    void updateDepart(Long department);

}