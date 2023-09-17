# Employee Class in Java

In Java, you need to create a class named "Employee" to represent factory employees and calculate their salaries with methods. This class will have 4 attributes and 5 methods.

## Attributes of the Class

- `name`: The name and surname of the employee.
- `salary`: The salary of the employee.
- `workHours`: Weekly working hours.
- `hireYear`: The year the employee started working.

## Methods of the Class

`Employee(name, salary, workHours, hireYear)`: Constructor method that takes 4 parameters.

### `tax()`: Calculates the tax applied to the salary.
- No tax is applied if the salary is less than 1000 TL.
- If the salary is more than 1000 TL, a tax of 3% of the salary is applied.

### `bonus()`: Calculates bonus payments for each extra hour worked if the employee has worked more than 40 hours per week.
- The bonus is calculated at a rate of 30 TL per extra hour worked.

### `raiseSalary()`: Calculates the salary increase based on the employee's years of service. The current year is assumed to be 2021.
- If the employee has worked for less than 10 years, a 5% raise is applied.
- If the employee has worked for more than 9 years and less than 20 years, a 10% raise is applied.
- If the employee has worked for more than 19 years, a 15% raise is applied.

### `toString()`: Prints the employee's information to the screen.

