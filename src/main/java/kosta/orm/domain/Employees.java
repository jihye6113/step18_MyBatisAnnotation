package kosta.orm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 만들기
@ToString
public class Employees {
	
	private int employeeId; // employee_id
	private String lastName;
	private String email;
	private String hireDate;
	private String jobId;
	private int salary;
	
	private String phoneNumber;
	
	
}
