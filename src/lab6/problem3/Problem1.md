
# Wellmeadows Hospital Normalization to 3NF

## a. Assumptions and Functional Dependencies

### Assumptions:
- One patient can be prescribed multiple drugs.
- Each drug has a fixed description and dosage.
- Each patient can have the same drug prescribed more than once (different dates).
- A prescription is uniquely identified by the combination of PatientNumber, DrugNumber, StartDate.

### Functional Dependencies (FDs):

| Primary Key | Functional Dependencies |
|-------------|--------------------------|
| PatientNumber | FullName, BedNumber, WardNumber, WardName |
| WardNumber | WardName |
| DrugNumber | DrugName, Description, Dosage |
| PatientNumber, DrugNumber, StartDate | MethodOfAdmin, UnitsPerDay, FinishDate |

---

## b. Procedure of Normalizing to 3NF

### 🔹 Step 1: UNF to 1NF
**UNF** (with repeating groups):

```
PatientNumber | FullName        | DrugNumbers     | DrugNames         | StartDates            | FinishDate            | Dosage          | Method Of Admin | Description           | BedNumber | WardNumber | WardName
P10034        | Robert MacDonald| 10223, 10334    | Morphine, Tetra.  | 24/03/13, ..., 25/04/14| 24/04/14, ..., 02/05/15| 10mg/ml,...     | Oral, IV        | PainKiller, Antibiotic| 84        | Ward 11     | Orthopaedic
```

**1NF** (atomic values per row):

```
PatientNumber | FullName        | DrugNumber | DrugName     | StartDate | FinishDate | Dosage | MethodOfAdmin | Description | BedNumber | WardNumber | WardName
P10034        | Robert MacDonald| 10223      | Morphine     | 24/03/13  | 24/04/14   | 10     | Oral          | PainKiller  | 84        | Ward 11     | Orthopaedic
P10034        | Robert MacDonald| 10334      | Tetracycline | 24/03/13  | 17/04/13   | 0.5    | IV            | Antibiotic  | 84        | Ward 11     | Orthopaedic
P10034        | Robert MacDonald| 10223      | Morphine     | 25/04/14  | 02/05/15   | 10     | Oral          | PainKiller  | 84        | Ward 11     | Orthopaedic
```

---

### 🔹 Step 2: 1NF to 2NF
**Remove partial dependencies** — separate into different tables:

**1. Patient**
```
PatientNumber (PK) | FullName | BedNumber | WardNumber | WardName
```

**2. Drug**
```
DrugNumber (PK) | Name | Description | Dosage
```

**3. Prescription**
```
PatientNumber (FK) | DrugNumber (FK) | StartDate | MethodOfAdmin | UnitsPerDay | FinishDate
PK = (PatientNumber, DrugNumber, StartDate)
```

---

### 🔹 Step 3: 2NF to 3NF
- No transitive dependencies remain.
- All non-key attributes are fully dependent only on the primary key.

**1. Patient**
```
PatientNumber (PK) | FullName | BedNumber | WardNumber
```

**2. Ward**
```
WardNumber (PK) | WardName
```

**3. Drug**
```
DrugNumber (PK) | Name | Description | Dosage
```

**4. Prescription**
```
PatientNumber (FK) | DrugNumber (FK) | StartDate | MethodOfAdmin | UnitsPerDay | FinishDate
PK = (PatientNumber, DrugNumber, StartDate)
```
---

## Keys Summary

### Primary Keys (PK):
- `Patient`: PatientNumber
- `Ward`: WardNumber
- `Drug`: DrugNumber
- `Prescription`: (PatientNumber, DrugNumber, StartDate)

### Foreign Keys (FK):
- `Patient.WardNumber → Ward.WardNumber`
- `Prescription.PatientNumber → Patient.PatientNumber`
- `Prescription.DrugNumber → Drug.DrugNumber`

### Alternate Keys:
- `Drug.Name` could be a candidate key (if unique)

---
