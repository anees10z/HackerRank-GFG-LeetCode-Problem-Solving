# Revising the Select Query I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the **NAME** field for all American cities in the **CITY** table with populations larger than `120000`. The *CountryCode* for America is `USA`. 

The **CITY** table is described as follows:  
![CITY.jpg](https://s3.amazonaws.com/hr-challenge-images/8137/1449729804-f21d187d0f-CITY.jpg)

**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T13:09:16.737Z  

```sql
SELECT * FROM CITY
WHERE POPULATION > 100000 AND COUNTRYCODE = 'USA';

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/revising-the-select-query-2/problem)