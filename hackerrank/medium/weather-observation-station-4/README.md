# Weather Observation Station 4

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Find the difference between the total number of **CITY** entries in the table and the number of distinct **CITY** entries in the table.  
The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where **LAT\_N** is the northern latitude and **LONG\_W** is the western longitude.

For example, if there are three records in the table with **CITY** values 'New York', 'New York', 'Bengalaru', there are 2 different city names: 'New York' and 'Bengalaru'.  The query returns $1$, because $\text{total number of records} - \text{number of unique city names} = 3 - 2 = 1$.

**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T13:54:56.326Z  

```sql
/*
Enter your query here.
*/
SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-4/problem)