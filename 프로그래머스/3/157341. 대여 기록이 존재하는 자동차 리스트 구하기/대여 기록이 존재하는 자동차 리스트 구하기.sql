-- 코드를 입력하세요
SELECT distinct cr.car_id
FROM car_rental_company_car cr join car_rental_company_rental_history crh on cr.car_id = crh.car_id
where cr.car_type = '세단' and crh.start_date like '2022-10%'
order by cr.car_id DESC