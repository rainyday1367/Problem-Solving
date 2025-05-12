SELECT
    USER_ID,
    PRODUCT_ID
FROM (
    SELECT
        USER_ID,
        PRODUCT_ID,
        COUNT(*) AS purchase_count  -- 각 회원-상품 조합의 구매 횟수를 계산합니다.
    FROM
        ONLINE_SALE
    GROUP BY
        USER_ID, PRODUCT_ID
    HAVING
        COUNT(*) > 1  -- 재구매한 회원을 찾기 위해 구매 횟수가 2 이상인 경우를 선택합니다.
) AS subquery
ORDER BY
    USER_ID ASC, PRODUCT_ID DESC;  -- 결과는 회원 ID를 기준으로 오름차순, 회원 ID가 같으면 상품 ID를 기준으로 내림차순 정렬합니다.