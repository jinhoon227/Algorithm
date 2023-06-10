-- 카테고리 별 상품 개수 구하기
SELECT left(product_code, 2) as category, count(product_id)
from product
group by 1
order by 1;