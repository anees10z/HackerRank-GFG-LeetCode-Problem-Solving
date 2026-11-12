# Weather Observation Station 5

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the two cities in **STATION** with the shortest and longest *CITY* names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.  
The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where **LAT\_N** is the northern latitude and **LONG\_W** is the western longitude.


**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T14:25:57.865Z  

```sql
/*
Enter your query here.
*/
(SELECT CITY, LENGTH(CITY) AS LENGTHS
FROM STATION
ORDER BY LENGTH(CITY) ASC, CITY ASC
LIMIT 1)
UNION ALL
(SELECT CITY, LENGTH(CITY) AS LENGTHS
FROM STATION
ORDER BY LENGTH(CITY) DESC, CITY ASC
LIMIT 1);


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-5/problem)