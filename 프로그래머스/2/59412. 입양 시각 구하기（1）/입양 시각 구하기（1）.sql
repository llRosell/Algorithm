-- 코드를 입력하세요
SELECT HOUR(DATETIME) HOUR, COUNT(ANIMAL_ID) COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) >=9 and HOUR(DATETIME) < 20
GROUP BY 1
ORDER BY 1