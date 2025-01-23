SELECT
    ri.rest_id,
    ri.rest_name,
    ri.food_type,
    ri.favorites,
    ri.address,
    ROUND(AVG(rr.review_score), 2) AS avg_review_score
FROM
    REST_INFO ri JOIN
    REST_REVIEW rr ON ri.rest_id = rr.rest_id
WHERE
    ri.address LIKE '서울%'
GROUP BY
    ri.rest_id, ri.rest_name, ri.food_type, ri.favorites, ri.address
ORDER BY
    avg_review_score DESC, ri.favorites DESC;