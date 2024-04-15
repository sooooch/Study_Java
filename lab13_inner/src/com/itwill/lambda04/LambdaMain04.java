package com.itwill.lambda04;

import java.util.Arrays;
import java.util.List;

public class LambdaMain04 {

	public static void main(String[] args) {
		// 사원들의 리스트

		List<Employee> employees = Arrays.asList(new Employee(101, "박수창", "영업1팀", "사장", 1200),
				new Employee(102, "이동준", "개발2팀", "과장", 200), new Employee(103, "이승행", "개발1팀", "부장", 300),
				new Employee(104, "정윤정", "개발2팀", "대리", 500), new Employee(105, "김동환", "개발2팀", "부장", 500),
				new Employee(106, "노형진", "인사팀", "회장", 1600), new Employee(107, "김지현", "인사팀", "부장", 700));

		// Ex1. 모든 직원들의 정보를 한 줄에 한명씩 출력

		employees.forEach(System.out::println);

		// Ex2. 개발(1,2)팀에서 일하는 직원들의 급여 합계

		double sum = employees.stream().filter(x -> "개발1팀".equals(x.getDept()) || "개발2팀".equals(x.getDept()))
				.mapToDouble(Employee::getSalary).sum();

		System.out.println("개발(1,2)팀에서 일하는 직원들의 급여 합계: " + sum);

		// ex3 개발팀에서 일하는 직원들의 급여 평균

		int result = 0;

		for (int x = 0; x < employees.size(); x++) {
			boolean i = employees.get(x).getDept().contains("개발");
			if (i) {
				result++;
			}
		}

		System.out.println(sum / result);

		// ex4 직급이 부장인 직원들의 급여 합계

		sum = employees.stream().filter((e) -> e.getJobTitle().equals("부장")).mapToDouble((e) -> e.getSalary()).sum();
		
		System.out.println(sum);
		
		
		
		
		
		// ex5 부장 평균 급여

	
//		sum = 0;
//		double mean = 0.0;
//	     int count = 0;
//	     for (Employee e  : employees) {
//	    	 if(e.getJobTitle().equals("부장")) {
//	    		 sum += e.getSalary();
//	    		 count++;
//	    	 }
//	     }
//		
//		System.out.println("합계 = " + sum);
//		mean = sum / count;
//		System.out.println(mean);
		
		
		
		
		
		
		
		
		
		
		
		// ex6 급여가 1000 이상인 직원들의 정보를 한줄에 한명씩 출력
		employees.stream().filter((e) -> e.getSalary() >= 1000).forEach(System.out::println);
		

		// ex7 개발1팀 직원들의 급여를 10% 인상하고 인상된 급여의 평균
		
		sum = 0.0;
		double count = 0;
		for (Employee e :employees) {
			if (e.getDept().equals("개발1팀")) {
				sum += e.getSalary() * 1.1;
				count ++;
			}
		}
	double	mean = sum / count;
		
		System.out.println(mean);
		
		
		
		
		mean = employees.stream().filter((e) -> e.getDept().equals("개발1팀")).mapToDouble((e) -> e.getSalary() * 1.1).average().orElseThrow();
		
		
		System.out.println(mean);
		
		
		// ex8. 직원들 중 대리는 몇 명?
		int count1 = 0;
		for (Employee e : employees) {
			if (e.getJobTitle().equals("대리")) {
				count1 ++;
			}
		}
		System.out.println(count1);
		
		
		
	long empCount =	employees.stream().filter((e) -> e.getJobTitle().equals("대리")).count(); 
		System.out.println(empCount);
		
		
		
		
		
	}

}
