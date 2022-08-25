package modeldao;

import java.util.List;

import modelentities.Department;

public interface DepartmentDao {
    
    void insert(Department obj);
    void update(Department obj);
    void deletebyId(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}