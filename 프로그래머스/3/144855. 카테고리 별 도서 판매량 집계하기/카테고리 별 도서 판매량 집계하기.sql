select a.category, sum(b.sales) as TOTAL_SALES
from book a left join book_sales b on a.book_id = b.book_id
where sales_date between '2022-01-01' and '2022-01-31'
group by a.category
order by a.category