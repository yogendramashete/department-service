package poc.yogendra.department.controller

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import poc.yogendra.department.entity.Department
import poc.yogendra.department.service.DepartmentService

@RestController
@RequestMapping("/departments")
class DepartmentController {


    @Autowired
    lateinit var departmentService: DepartmentService


    @PostMapping("/")
    fun saveDepartment(@RequestBody department: Department): Department =
        departmentService.saveDepartment(department)


    @GetMapping("/{id}")
    fun getDepartment(@PathVariable("id") id: Long): Department =
        departmentService.findByDepartmentId(id)

}