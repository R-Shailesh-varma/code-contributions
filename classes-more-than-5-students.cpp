# Write your MySQL query statement below
SELECT class FROM Courses
GROUP BY class
HAVING COUNT(CONCAT(student,'-',class)) >= 5