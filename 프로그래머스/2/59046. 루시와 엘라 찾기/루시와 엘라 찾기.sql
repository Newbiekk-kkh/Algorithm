-- 코드를 입력하세요
SELECT animal_id, name, sex_upon_intake
from animal_ins
where name = 'lucy' or name = 'ella' or name = 'pickle' or name = 'rogan' or name = 'sabrina' or name = 'mitty'
order by animal_id