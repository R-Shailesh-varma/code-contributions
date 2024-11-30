-- # Write your MySQL query statement below
-- SELECT num FROM MyNumbers
-- GROUP BY num
-- HAVING COUNT(num) = 1
-- ORDER BY num DESC
-- LIMIT 1;


-- SELECT NULL
-- WHERE NOT EXISTS (
--   SELECT 1
--   FROM MyNumbers
--   GROUP BY num
--   HAVING COUNT(num) = 1
-- );

SELECT IFNULL(MAX(num), NULL) AS num
FROM (
  SELECT num
  FROM MyNumbers
  GROUP BY num
  HAVING COUNT(num) = 1
  ORDER BY num DESC
  LIMIT 1
) AS result;
