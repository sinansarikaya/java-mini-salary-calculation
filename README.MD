# Employee Salary Calculator

This Java project contains an `Employee` class used to calculate employee salaries. The class is designed to store information about employees, such as their name, salary, working hours, and hire year, and perform calculations based on this information, including tax, bonus, and salary raise calculations.

## Contents

- [Code Description](#code-description)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [Task](#tasks-directory)

## Code Description

### Employee Class

The `Employee` class contains attributes representing employee properties and methods for calculations based on these properties.

- `name`: Employee's name and surname.
- `salary`: Employee's salary.
- `workHours`: Weekly working hours.
- `hireYear`: The year the employee started working.

#### Methods

##### `Employee(name, salary, workHours, hireYear)`

Constructor method that creates employee objects, taking name, salary, work hours, and hire year as parameters.

##### `tax(salary)`

Calculates the tax applied to the salary.
- No tax is applied if the salary is less than 1000 TL.
- If the salary is more than 1000 TL, a tax of 3% of the salary is applied.

##### `bonus(workHours)`

Calculates bonus payments for each extra hour worked if the employee has worked more than 40 hours per week.
- The bonus is calculated at a rate of 30 TL per extra hour worked.

##### `raiseSalary(hireYear, salary)`

Calculates the salary increase based on the employee's years of service. The current year is assumed to be 2021.
- If the employee has worked for less than 10 years, a 5% raise is applied.
- If the employee has worked for more than 9 years and less than 20 years, a 10% raise is applied.
- If the employee has worked for more than 19 years, a 15% raise is applied.

##### `count()`

Calculates tax, bonus, and total salary and prints them to the screen.

##### `printEmployee()`

Prints employee information to the screen.

### How to Use

Example usage is shown below:
1. Clone the repository to your local machine.
2. Open the project in your favorite Java IDE.
3. Compile and run the main application.
4. Follow the console prompts to create courses, teachers, and students.
5. Use the provided methods to interact with the system, such as adding grades, checking if a student passed, and printing information.

```java
public static void main(String[] args) {
    Employee e1 = new Employee("Kemal", 2000.0, 45, 1985);
    e1.printEmployee();
}
```

## Contributing

Contributions are welcome! If you would like to enhance the functionality of this mini project or fix any issues, please follow these steps:

1. Fork the project on GitHub.
2. Create a new branch with a descriptive name.
3. Commit your changes and push to your fork.
4. Submit a pull request, explaining the changes you've made.

### Tasks Directory

For details on tasks located in the subdirectory, please refer to the [Tasks Directory English Version](./src/main/java/EnTask.md) or [Tasks Directory Turkish Version](./src/main/java/TrTask.md) document.