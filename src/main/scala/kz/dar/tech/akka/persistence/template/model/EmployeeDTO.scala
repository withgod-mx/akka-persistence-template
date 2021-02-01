package kz.dar.tech.akka.persistence.template.model

import org.joda.time.DateTime


case class EmployeeDTO(employeeId: String,
                       firstName: String,
                       lastName: String,
                       middleName: String,
                       birthDate: DateTime,
                       position: String,
                       family: Map[String, Family] = Map.empty)