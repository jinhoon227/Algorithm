-- 오랜 기간 보호한 동물(2)
SELECT i.animal_id, i.name
from animal_ins i
         join animal_outs o on i.animal_id = o.animal_id
order by (o.datetime - i.datetime) desc
    limit 2;