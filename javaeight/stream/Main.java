package javaeight.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        Map<String,Long> noOfMaleAndFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployee);

        //print the name of all department of the organization
        //stream - map to department
//        List<String> nameOfAllDepartment=employeeList.stream().map(Employee::getDepartment).distinct().toList();
        List<String> nameOfAllDepartment=employeeList.stream().map(x->x.getDepartment()).distinct().toList();
        System.out.println(nameOfAllDepartment);

        //average age of male and female employee
        Map<String,Double> averageAgeOfMaleAndFemaleEmployees=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(averageAgeOfMaleAndFemaleEmployees);

        //Get the details of highest paid employee in the organization?
        Employee employeeWithMaxSalary = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(employeeWithMaxSalary);

        //Get the names of all employees who have joined after 2015?
        //stream - filter - map - to list
        List<String> employeeJoinedAfter2015= employeeList.stream().filter(x->x.getYearOfJoining() >2015).map(Employee::getName).toList();
        System.out.println(employeeJoinedAfter2015);

        //Count the number of employees in each department?
        //stream - groupingBy  department - function.identity
        Map<String,Long> numberOfEmployeeInEachDepartment= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(numberOfEmployeeInEachDepartment);

        //What is the average salary of each department?
        // stream - groupingBy department - averagingDouble Salary
        Map<String,Double> departmentAvgSalary=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(departmentAvgSalary);

        //Get the details of youngest male employee in the product development department?
        // stream - min by age
        Employee youngestEmployee = employeeList.stream().filter(x->x.getGender().equals("Male" )&& x.getDepartment().equals("Product Development")).min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(youngestEmployee);
        // Who has the most working experience in the organization?
        //stream - min by yearOfJoining
        Employee mostExperiencedEmployee = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
        System.out.println(mostExperiencedEmployee);

        //How many male and female employees are there in the sales and marketing team?
        // stream - filter - grouping by counting
        Map<String,Long> noMaleAndFemaleEmpInSalesDep=employeeList.stream().filter(x-> x.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noMaleAndFemaleEmpInSalesDep);
    }
}
