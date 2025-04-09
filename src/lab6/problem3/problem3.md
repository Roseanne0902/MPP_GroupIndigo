## 1. Anomalies
### a. Insert anomaly
-	Add a new hotel like H1 location in Fairfield but doesn’t have any employee to the table. But table requirement employee information and contract Number.

### b)	Update anomaly
-	Update H4 location require update both rows contain NIN = 1068 and NIN = 1135. In case 1 row miss update, table data become inconsistent.

### c)	Delete anomaly
-	Delete contract C1025 also remove working history of employee Smith J at H4 Glasgow

## 2. Model relation 

### Attributes in the table:
    
- NIN: National Insurance Number (unique for each staff member)
- contractNo: Contract number for the staff member
- hours: Hours worked by the staff member
- eNAME: Employee name
- hNo: Hotel number
- hLoc: Hotel location


### Function Dependencies:

-	NIN → eNAME
     Since NIN is unique for each staff member, it determines the staff member’s name (eNAME)
-	hNo → hLoc
     Each hotel (hNo) has a single location (hLoc). H25 is always in East Kilbride.
-	NIN, contractNo → hours
     From NIN and contract Number can determine Hours. 1135 and C1024  get 16

### Assumptions:
- NIN is unique for each staff member.
- eNAME is the name of the staff member, which is determined by their NIN.
- hNo uniquely identifies a hotel, and each hotel has a single location (hLoc).
- contractNo and hours are specific to the staff member’s work at a particular hotel.


## 3.	Normalize to 3NF

### a. 1NF: 
    Each column contains atomic values
    Each column has unique values
      
#### This table in 1NF

### b. 2NF:
    1NF
    No partial dependency exists.
    

#### Primary Key: (NIN, contractNo)


#### Covert to 2NF

Employee Table: Primary key: NIN

| NIN  | eName    |
|------|----------|
| 1057 | Hocine D |
| 1068 | White T  |
| 1135 | Smith J  |

Employee and Contract

| NIN   | contractNo | hours | 	hNo  | 	hLOC         |
|-------|------------|-------|-------|---------------|
| 1135  | C1024      | 16    | H25   | East Kilbride |
| 1057  | C1024      | 24    | H25   | East Kilbride |
| 1068  | C1025      | 28    | H4    | Glasgow       |
| 1135  | C1025      | 15    | H4    | Glasgow       |


### c. 3NF: 
    2NF 
    No transitive dependency exists

Hotel table: Primary key: hNo

| hNo   | hLOC          |
|-------|---------------|
| H25   | East Kilbride |
| H4    | Glasgow       |

Employee table: Primary key: NIN

| NIN   | eName      |
|-------|------------|
| 1057  | Hocine D   |
| 1068  | White T    |
| 1135  | Smith J    |

Employee Contract table: Primary key: (NIN, contractNo) 

Foreign key: hNo

| NIN   | contractNo   |hours| 	hNo | 
|-------|--------------|-----|------|
| 1135  | C1024        | 16  | H25  |
| 1057  | C1024        | 24  | H25  |
| 1068  | C1025        | 28  | H4   |
| 1135  | C1025        | 15  | H4   |

