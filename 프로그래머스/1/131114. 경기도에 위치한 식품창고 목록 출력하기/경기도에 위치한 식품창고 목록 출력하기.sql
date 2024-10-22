-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, 
     ifnull(FREEZER_YN,'N') as FREEZER_YN
from food_warehouse
where address like '경기도%'
order by 1