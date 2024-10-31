-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(animal_id) 'count'
from animal_ins
group by 1
order by 1 