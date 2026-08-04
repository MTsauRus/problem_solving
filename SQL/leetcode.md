## 175. Combine Two Tables

```sql
# Write your MySQL query statement below

select P.firstName, P.lastName, nullIf(A.city, 'Null') as city, nullIf(A.state, 'Null') as state
from Person P
left join Address A
on P.personId = A.personId
;
```

# 181. Employees Earning More Than Their Managers

```sql
# 서브쿼리
select name as Employee
from Employee A
where salary > (
    select salary
    from Employee B
    where B.id = A.managerId
);


# 효율적
SELECT E.name AS Employee
FROM Employee E
JOIN Employee M ON E.managerId = M.id
WHERE E.salary > M.salary;
```
