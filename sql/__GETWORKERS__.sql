SELECT name, salary, birth_date, hire_date, address, city, role
FROM workers
INNER JOIN cities ON workers.city_id = cities.id
INNER JOIN roles on WORKERS.role_id = roles.id;




