package poc.yogendra.department.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import poc.yogendra.department.entity.Department

@Repository
interface DepartmentRepository: JpaRepository<Department, Long> {
}