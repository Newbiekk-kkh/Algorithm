-- 코드를 입력하세요
SELECT f.category, f.price, f.product_name
from (select category, price, product_name, ROW_NUMBER() OVER(PARTITION BY category ORDER BY price DESC) AS fp
     from food_product) f
where category = '과자' or category = '국' or category = '김치' or category = '식용유'
group by category
order by price desc
