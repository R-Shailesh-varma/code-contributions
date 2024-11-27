# Write your MySQL query statement below
SELECT c.name , c.population , c.area FROM World c
WHERE (c.population >= 25000000 or c.area >=3000000);