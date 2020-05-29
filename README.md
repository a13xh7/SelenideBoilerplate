#SelenideBoilerplate (Java + Selenide + TestNG + Allure)

Simple template for automated end-to-end testing.

Article - https://habr.com/ru/post/504408/

Run test - `mvn test -Dbrowser=chrome -Dheadless=1` or just `mvn test`

**parameters:**

- `browser` - chrome or firefox. default - chrome 
- `headless` - 0 or 1. default - 0

Generate allure report  - `allure serve target/allure-results`
