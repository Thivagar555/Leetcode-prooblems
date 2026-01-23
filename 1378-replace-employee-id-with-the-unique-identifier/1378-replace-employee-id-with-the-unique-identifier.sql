
SELECT emp.name, empuni.unique_id
FROM Employees emp
LEFT JOIN EmployeeUNI empuni
ON emp.id = empuni.id