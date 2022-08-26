package application;

import java.util.List;

import modeldao.DaoFactory;
import modeldao.DepartmentDao;
import modelentities.Department;

public class App2 {
    
    public static void main(String[] args) {
        
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println("=== TEST 1: Department findById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);
        
        System.out.println("\n=== TEST 2: Department findAll ===");
        List<Department> departments = departmentDao.findAll();
        departments = departmentDao.findAll();
        
        for (Department d : departments) {
            System.out.println(d);
        }
        
        System.out.println("\n=== TEST 3: Department insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: Department update ===");
        department = departmentDao.findById(1);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update completed!");
        
        System.out.println("\n=== TEST 5: Department delete ===");
        departmentDao.deleteById(7);
        System.out.println("Delete completed!");

    }
}
