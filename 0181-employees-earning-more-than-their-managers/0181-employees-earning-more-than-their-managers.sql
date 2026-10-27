# Write your MySQL query statement below
select e.Name as Employee
from Employee e
join Employee m
on e.ManagerId = m.id
and e.Salary > m.Salary
