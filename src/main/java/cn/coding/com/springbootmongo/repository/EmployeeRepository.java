package cn.coding.com.springbootmongo.repository;

import cn.coding.com.springbootmongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
/*@Author JosephCrypto
 *@Create 2021-12-01 1:51 PM
 */
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
}
