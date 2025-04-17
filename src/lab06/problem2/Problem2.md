
# Normalization of Dentist/Patient Appointment Table

## a. Update Anomalies

### 🔹 Insertion Anomaly:
- Cannot insert a new dentist without assigning them to a patient and an appointment.
- Example: Adding a new dentist who hasn’t seen any patient yet.

### 🔹 Deletion Anomaly:
- Deleting the only appointment of a dentist also removes the record of their surgery.
- Example: If Robin Plevin’s appointments are deleted, we lose surgery S13.

### 🔹 Update Anomaly:
- Updating the surgery number for a dentist requires updating multiple rows.
- Example: If Tony Smith moves to a new surgery, all his records must be updated.

---

## b. Functional Dependencies

### Assumptions:
- A dentist (staffNo) has a fixed name and is assigned to one surgery per appointment day.
- Each appointment is uniquely identified by (patNo, appointmentDate, appointmentTime).
- Patients can have multiple appointments with different dentists.

### Functional Dependencies (FDs):

| Determinant                            | Dependent Attributes                   |
|----------------------------------------|----------------------------------------|
| staffNo                                | dentistName                            |
| staffNo, appointmentDate               | surgeryNo                              |
| patNo                                  | patName                                |
| patNo, appointmentDate, appointmentTime| staffNo, surgeryNo                     |

---

## c. 3NF Normalization Process

### Step 1: UNF to 1NF
- The table already conforms to 1NF (all values are atomic and rows are unique).

### Step 2: 1NF to 2NF
- Remove partial dependencies:

**1. Patient**
```
patNo (PK) | patName
```

**2. SurgeryAssignment**
```
staffNo (FK) | destistName | appointmentDate | surgeryNo
PK = (staffNo, appointmentDate)
```

**3. Appointment**
```
patNo (FK) | patName | appointmentDate | appointmentTime | surgeryNo | staffNo (FK) | dentistName
PK = (patNo, appointmentDate, appointmentTime)
```

### Step 3: 2NF to 3NF
- All transitive dependencies are removed.

**1. Patient**
```
patNo (PK) | patName
```

**2. Dentist**
```
staffNo (PK) | dentistName
```

**3. SurgeryAssignment**
```
staffNo (FK) | appointmentDate | surgeryNo
PK = (staffNo, appointmentDate)
```

**4. Appointment**
```
patNo (FK) | appointmentDate | appointmentTime | staffNo (FK)
PK = (patNo, appointmentDate, appointmentTime)
```
---

## Keys Summary

### Primary Keys:
- Patient: `patNo`
- Dentist: `staffNo`
- SurgeryAssignment: `(staffNo, appointmentDate)`
- Appointment: `(patNo, appointmentDate, appointmentTime)`

### Foreign Keys:
- `Appointment.patNo → Patient.patNo`
- `Appointment.staffNo → Dentist.staffNo`
- `SurgeryAssignment.staffNo → Dentist.staffNo`