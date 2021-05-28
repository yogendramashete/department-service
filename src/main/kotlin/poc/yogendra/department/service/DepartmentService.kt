package poc.yogendra.department.service

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import poc.yogendra.department.entity.Department
import poc.yogendra.department.repository.DepartmentRepository

@Service
class DepartmentService {
    private val log = KotlinLogging.logger {}
    @Autowired
    lateinit var departmentRepository: DepartmentRepository

    fun saveDepartment(department: Department): Department {
        log.info("Inside saveDepartment of DepartmentService")
        return departmentRepository.save(department)
    }


    fun findByDepartmentId(id: Long): Department {
        log.info("Inside findByDepartmentId of DepartmentService")
        return departmentRepository.findById(id).get()
    }

}