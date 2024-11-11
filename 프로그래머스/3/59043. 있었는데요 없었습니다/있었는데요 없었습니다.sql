-- 코드를 입력하세요
SELECT I.ANIMAL_ID, I.NAME
from animal_ins as I left join animal_outs as O on I.animal_id=O.animal_id
where I.datetime > O.datetime
order by I.datetime