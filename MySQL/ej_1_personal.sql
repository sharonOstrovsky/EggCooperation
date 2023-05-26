-- 1. Obtener los datos completos de los empleados.
SELECT * FROM empleado;

-- 2. Obtener los datos completos de los departamentos.
SELECT * FROM departamento;

-- 3. Listar el nombre de los departamentos.
SELECT distinct nombre_depto FROM departamento;

-- 4. Obtener el nombre y salario de todos los empleados.
SELECT nombre, salario FROM empleado;

-- 5. Listar todas las comisiones.
select comision from empleado;

-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
select * from empleado where cargo = "Secretaria";

-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
select * from empleado where cargo = "vendedor"ORDER BY nombre ASC;

-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
select nombre, cargo from empleado order by salario ASC;

-- 9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ 
-- para las respectivas tablas de empleados.

select nombre as Nombre, cargo as Cargo from empleado;

-- 10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
-- por comisión de menor a mayor.
select salario, comision from empleado where id_depto = 2000 order by comision asc;

-- 11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los
-- empleados del departamento 3000 una bonificación de 500, en orden alfabético del
-- empleado.
select if(id_depto = 3000, (salario + comision + 500), (salario + comision)) from empleado;
select nombre, id_depto from empleado where id_depto = 3000;
select nombre, id_depto, salario, comision, (salario + comision + 500) as total from empleado where id_depto = 3000 order by nombre asc;

-- 12. Muestra los empleados cuyo nombre empiece con la letra J.
select * from empleado where nombre like "J%";

-- 13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
-- empleados que tienen comisión superior a 1000.
select salario, comision, (salario + comision) as "Salario Total", nombre from empleado where comision > 1000;

-- 14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
-- comisión.
select nombre, comision from empleado;
select salario, comision, (salario + comision) as "Salario Total", nombre 
from empleado where comision = 0;

-- 15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
select * from empleado where comision > salario;

-- 16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
select nombre, salario, comision from empleado where comision <= (0.3*salario);

-- 17. Hallar los empleados cuyo nombre no contiene la cadena “MA”
select nombre from empleado where nombre not like "%MA%";

-- 18. Obtener los nombres de los departamentos que sean “Ventas” ni “Investigación” ni
-- ‘Mantenimiento.
select distinct nombre_depto from departamento 
where nombre_depto not like "Investigacion" and nombre_depto not like "Mantenimiento" 
and nombre_depto like "Ventas";

-- 19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni
-- “Investigación” ni ‘Mantenimiento.
select distinct nombre_depto from departamento 
where nombre_depto NOT IN ("Ventas", "Investigacion", "Mantenimiento");

select distinct nombre_depto from departamento where nombre_depto
 not like "Investigacion" and nombre_depto not like "Mantenimiento" 
 and nombre_depto not like "Ventas";

-- 20. Mostrar el salario más alto de la empresa.
select max(salario) from empleado;

-- 21. Mostrar el nombre del último empleado de la lista por orden alfabético.
select max(nombre) from empleado;

-- 22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
select max(salario), min(salario), (max(salario) - min(salario)) from empleado;
select max(salario) from empleado;
select min(salario) from empleado;
select (max(salario) - min(salario)) from empleado;

-- 23. Hallar el salario promedio por departamento.
select avg(salario), id_depto from empleado group by id_depto; 

-- 24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
-- empleados de esos departamentos.
select count(id_empleado), id_depto from empleado 
group by id_depto having count(id_empleado) > 3;

-- 25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige.
-- Solo los que tengan más de dos empleados (2 incluido).
select cod_jefe, count(id_empleado) from empleado 
group by cod_jefe having count(id_empleado) >= 2;

select e.cod_jefe, e.nombre, count(e.id_empleado) from empleado e
where e.cargo like "Jefe%"
group by e.nombre, e.cod_jefe
order by e.nombre;

-- 26. Hallar los departamentos que no tienen empleados

-- 27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
-- empresa. Ordenarlo por departamento.
select nombre, salario, id_depto from empleado 
where salario >= (select avg(salario) from empleado)
order by id_depto asc;

