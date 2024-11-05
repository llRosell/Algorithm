-- 코드를 입력하세요
SELECT pt_name, pt_no, gend_cd, age,
      case when tlno is null then 'NONE'
           else tlno
           end as "TLNO"
from patient
where age <= 12 and gend_cd = 'w'
order by age desc, pt_name