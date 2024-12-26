SELECT u.user_id, u.nickname, sub.total_sales
FROM (
    SELECT writer_id, SUM(price) AS total_sales
    FROM used_goods_board
    where status = 'DONE'
    GROUP BY writer_id
    HAVING SUM(price) >= 700000
) sub
JOIN used_goods_user u ON sub.writer_id = u.user_id
ORDER BY sub.total_sales
