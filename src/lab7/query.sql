# 6.7 List full details of all hotels.
SELECT *
FROM Hotel;

# 6.8 List full details of all hotels in London.
SELECT *
FROM Hotel
WHERE city = 'London';

# 6.9 List the names and addresses of all guests living in London,
# alphabetically ordered by name.
SELECT guestName, guestAddress
FROM Guest
WHERE guestAddress like '%London%';

# 6.10 List all double or family rooms with a price below £40.00 per night,
# in ascending order of price.
SELECT *
FROM Room
where type in ('Double', 'Family')
  and price < 40
order by price asc;


# 6.11 List the bookings for which no dateTo has been specified.
SELECT *
from Booking
where dateTo is null;


# Aggregate functions
# 6.12 How many hotels are there?
SELECT count(hotelNo) as hotelCount
FROM Hotel;

# 6.13 What is the average price of a room?
SELECT avg(price)
from Room;

# 6.14 What is the total revenue per night from all double rooms?
SELECT sum(price)
from Room
where type = 'Double';

# 6.15 How many different guests have made bookings for August?
#
SELECT *
from Booking
where dateFrom >= '2025-08-01'
  and dateFrom < '2025-09-01';

# Subqueries and joins
# 6.16 List the price and type of all rooms at the Grosvenor Hotel.
Select distinct r.type, r.price
from Room r
         inner join Hotel h
where r.hotelNo = h.hotelNo
  and h.hotelName = 'Grosvenor';


# 6.17 List all guests currently staying at the Grosvenor Hotel.
select distinct g.guestNo, g.guestName, g.guestAddress
from Guest g
         join Hotel h
         join Booking b
where b.hotelNo = h.hotelNo
  and h.hotelName = 'Grosvenor'
  and b.guestNo = g.guestNo;



# 6.18 List the details of all rooms at the Grosvenor Hotel,
# including the name of the guest staying in the room, if the room is occupied.

SELECT r.*, g.guestName
FROM Room r
         JOIN Hotel h ON r.hotelNo = h.hotelNo
         LEFT JOIN Booking b ON r.roomNo = b.roomNo
    AND r.hotelNo = b.hotelNo
    AND CURDATE() BETWEEN b.dateFrom AND b.dateTo
         LEFT JOIN Guest g ON b.guestNo = g.guestNo
WHERE h.hotelName = 'Grosvenor';


# 6.19 What is the total income from bookings for the Grosvenor Hotel today?
SELECT *
from Room r
         join Hotel h on r.hotelNo = h.hotelNo
         inner join Booking b
                    on b.roomNo = r.roomNo
                        and b.hotelNo = r.hotelNo
                        and CURDATE() BETWEEN b.dateFrom and b.dateTo
where h.hotelName = 'Grosvenor';


# 6.22 List the number of rooms in each hotel.
SELECT r.hotelNo, h.hotelName, COUNT(roomNo) AS count
FROM Room r
         LEFT JOIN Hotel h
                   on r.hotelNo = h.hotelNo
GROUP BY r.hotelNo;

# 6.23 List the number of rooms in each hotel in London.
SELECT r.hotelNo, h.hotelName, h.city, COUNT(roomNo) AS count
FROM Room r
         LEFT JOIN Hotel h on r.hotelNo = h.hotelNo
where city = 'London'
GROUP BY r.hotelNo;

# 6.24 What is the average number of bookings for each hotel in August?
SELECT hotelno, y / 31
FROM (SELECT hotelno, COUNT(hotelno) AS y
      FROM Booking
      WHERE (datefrom <= '2025-08-31' AND
             dateto >= '2025-08-01')
      GROUP BY hotelno) as hc;
