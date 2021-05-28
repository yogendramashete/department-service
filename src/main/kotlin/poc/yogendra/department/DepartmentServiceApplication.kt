package poc.yogendra.department

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class DepartmentServiceApplication

fun main(args: Array<String>) {
	runApplication<DepartmentServiceApplication>(*args)
}
