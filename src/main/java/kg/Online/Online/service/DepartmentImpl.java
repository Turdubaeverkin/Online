package kg.Online.Online.service;

import kg.Online.Online.model.Department;
import kg.Online.Online.model.Fillial;
import kg.Online.Online.repositotry.DepartmentRepository;
import kg.Online.Online.repositotry.FillialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }


    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }



    @Override
    public Department getDepartmentById(Long fillialId) {
        return departmentRepository.findById(fillialId).get(

        );
    }

    @Override
    public void updateDepart(Long departId) {
        departmentRepository.delete(getDepartmentById(departId));
    }


//    @Override
//    public Department deleteDepart(long departId) {
//     return departmentRepository.delete(getDepartmentById(departId));
//    }

//    @Override
//    public void updateDepart(Department department) {
//        departmentRepository.save(department);
//    }

}
