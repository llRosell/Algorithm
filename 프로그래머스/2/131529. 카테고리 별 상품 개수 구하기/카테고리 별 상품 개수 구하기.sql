-- 코드를 입력하세요
SELECT left(product_code,2) as CATEGORY, count(product_ID) as PRODUCTS
from product
group by CATEGORY
order by 1