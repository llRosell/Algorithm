-- 코드를 입력하세요
SELECT mcdp_cd 진료과코드, count(*) "5월예약건수"
from appointment
where MONTH(APNT_YMD)='05'
group by mcdp_cd
order by 2,1