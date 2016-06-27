/** 
1.1 Lijst alle informatie van de werknemers uit. Vervang de kolomtitels 'ENAME', 'SAL' en 'COMM' door respectievelijk 
'LASTNAME', 'SALARY' en 'COMMISSION'. De kolommen 'EMPNO' en 'MGR' mogen 5 karakters breed zijn.
**/

SELECT 
    EMPNO, MGR, ENAME LASTNAME, SAL SALARRY, COMM COMMISSION
FROM
    EMP;


/**
1.3. Selecteer alle rijen van de departementen-tabel door de inhoud van de buffer op te roepen. 
Wijzig vervolgens de tabelnaam 'EMP' in 'DEPT', en voer de gewijzigde query uit.

-- Snap vraag niet
**/


/**1.4. Vraag alle verkopers wiens naam een 'A' bevat. Enkel de volgende informatie mag in het resultaat voorkomen: 
personeelsnummer, naam en salaris + commissie.
**/

SELECT EMPNO,ENAME,SAL,COMM FROM EMP WHERE ENAME LIKE '%A%' AND UPPER(JOB) = 'SALESMAN';

/**
1.5. Vraag een lijst van alle werknemers (empno, naam, job en jaarloon) die meer dan $20000 per jaar verdienen 
en die na 31 mei 1981 bij de onderneming in dienst gekomen zijn (Opm.: het loon in tabel 'EMP' is het maandloon).
**/

SELECT e.EMPNO,e.ENAME,e.JOB,e.SAL*12,e.HIREDATE FROM EMP e 
WHERE SAL > 20000 / 12
AND e.HIREDATE >  STR_TO_DATE('1981-05-31', '%Y-%m-%d')
;


/**
1.6. Vraag alle werknemers (empno, naam, job, jaarloon) die geen manager zijn en tussen $25000 en $40000 per jaar verdienen. 
Sorteer per dalend jaarloon.
**/

SELECT e.EMPNO,E.ENAME,e.JOB,e.SAL*12 AS SALARY FROM EMP e
WHERE E.SAL BETWEEN (25000 / 12) AND (40000 / 12)
AND UPPER(e.JOB) <> 'MANAGER'
ORDER BY SALARY DESC
;


/**
1.7. Vraag alle werknemers die in dienst zijn gekomen op 3 december 1981. Druk werknemersnummer en naam af.
**/

SELECT e.EMPNO, e.ENAME, e.HIREDATE FROM EMP e WHERE e.HIREDATE = STR_TO_DATE('1981-12-03', '%Y-%m-%d');

/**
1.8. Vraag alle werknemers die in dienst zijn gekomen in januari 1982.
**/

SELECT * FROM EMP WHERE HIREDATE BETWEEN STR_TO_DATE('1982-01-01', '%Y-%m-%d') AND STR_TO_DATE('1982-01-31', '%Y-%m-%d');

/**
1.9. Geef voor alle personeelsleden nummer, naam, job en categorie. Categorie 1 bevat alle werknemers met
een salaris van 5000 of meer. In categorie 2 ligt het salaris tussen 3000 en 5000. 
In categorie 3 zitten de werknemers die minder verdienen dan 3000 maar minstens 1500, en categorie 4 bevat de overige personeelsleden.
**/

SELECT e.EMPNO,e.ENAME,e.JOB, 
	CASE WHEN e.SAL > 5000 THEN 1
		 WHEN e.SAL BETWEEN 3000 AND 4999 THEN 2
		 WHEN e.SAL BETWEEN 1500 AND 2999 THEN 3
	ELSE 4 END AS CATEGORY FROM
 EMP e;

/**
1.10. Geefvoorelkewerknemeropofhijalmeerdan20jaar,tussende10ende20jaar,ofminderdan10jaarin dienst is. 
Toon naast personeelsnummer en naam ook het jaar van aanwerving.
**/

SELECT e.EMPNO,e.ENAME, e.HIREDATE,(YEAR(NOW()) - YEAR(HIREDATE)) - (DATE_FORMAT(NOW(), '%m%d') < DATE_FORMAT(HIREDATE, '%m%d')) AS RES,
/*CASE WHEN (SYSDATE - e.HIREDATE) > */
CASE WHEN (YEAR(NOW()) - YEAR(HIREDATE)) - (DATE_FORMAT(NOW(), '%m%d') < DATE_FORMAT(HIREDATE, '%m%d')) > 20 THEN 'More then 20 years'
WHEN (YEAR(NOW()) - YEAR(HIREDATE)) - (DATE_FORMAT(NOW(), '%m%d') < DATE_FORMAT(HIREDATE, '%m%d')) > 10 THEN  'Between 10 and 20 Years'
ELSE 'Less Then 10 years' END NRYEARS
FROM EMP e ;

/**
1.11. Vraag alle departementen met de naam van hun manager.

**/

SELECT d.DNAME,e.ENAME FROM EMP e
LEFT OUTER JOIN DEPT d ON e.DEPTNO = d.DEPTNO
WHERE e.JOB = 'MANAGER'
;

/**
1.12. Vraageenlijstvanallewerknemers(empno,naam,jobenjaarloon,deptnoendepartementsnaam)diemeer
dan $20000 per jaar verdienen en die na 31 mei 1981 bij de onderneming in dienst gekomen zijn (Opm.: het
loon in tabel 'EMP' is het maandloon).
**/

SELECT e.EMPNO, e.ENAME,e.JOB, e.SAL*12, e.DEPTNO, d.DNAME
FROM EMP e
LEFT OUTER JOIN DEPT d ON e.DEPTNO = d.DEPTNO
WHERE e.SAL > (20000 / 12)
AND e.HIREDATE >  STR_TO_DATE('1981-05-31', '%Y-%m-%d')
;


/**
1.13. Specificeereenbreakperdepartement,enlaat1legelijnalsdewaardevoordepartementverandert.Druk
deptno, naam van de werknemer, job en het loon (2 decimalen) af. Sorteer binnen elk departement op
dalend loon. Text bklablablabla
**/



select deptno,ename, job, FORMAT(SAL,2) Salary from emp
order by deptno, sal desc
;


/**
1.14. Specificeer een break per departement,en laat 1 lege lijn als de waarde voor departement verandert.Druk
deptno, naam van het departement, naam van de werknemer en job af. Sorteer op naam. Het
departementsnummer wordt pas op moment van uitvoering bepaald.

-- snap vraag niet
**/

set @deptno := 10;

SELECT d.deptno, d.dname,e.ENAME,e.JOB FROM EMP e
LEFT OUTER JOIN DEPT d ON d.DEPTNO = e.DEPTNO 
WHERE d.DEPTNO = @deptno;

/**
1.15. Vraaghetdeptno,hetgemiddeldeloonenhetaantalwerknemersperdepartement.

**/
SELECT d.DEPTNO, AVG(e.SAL) AverageSalary, count(e.ENAME) AS NR FROM DEPT d
LEFT OUTER JOIN EMP e ON e.DEPTNO = d.DEPTNO
GROUP BY DEPTNO;


/**
1.16. Vraag het dept no,de departements naam,het gemiddeldeloon enhet aantalwerknemersperdepartement.
Druk enkel de departementen met meer dan drie werknemers af.
**/
SELECT d.DEPTNO, d.DNAME, AVG(e.SAL) AverageSalary, count(e.ENAME) AS NR FROM DEPT d
LEFT OUTER JOIN EMP e ON e.DEPTNO = d.DEPTNO
GROUP BY DEPTNO,DNAME
HAVING NR > 3;



/**
1.17. Vraaghetdeptno,dedepartementsnaam,hetminimumenhetmaximumloonenhetaantalverschillende
jobs per departement.
**/
SELECT d.DEPTNO, d.DNAME, MIN(e.SAL) MaximumSalary, MAX(e.SAL), count(distinct job) MinimumSalary FROM DEPT d
LEFT OUTER JOIN EMP e ON e.DEPTNO = d.DEPTNO
GROUP BY DEPTNO,DNAME;

SELECT * FROM EMP;