-- 코드를 입력하세요
SELECT I.animal_id, I.animal_type, I.name
from animal_ins I join animal_outs O on I.animal_id=O.animal_id
where I.sex_upon_intake != O.sex_upon_outcome