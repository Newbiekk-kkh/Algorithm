-- 코드를 입력하세요
SELECT Book_id, date_format(published_date, '%Y-%m-%d')
from book
where (published_date between '2021-01-01' and '2021-12-31') and category = '인문'
order by published_date