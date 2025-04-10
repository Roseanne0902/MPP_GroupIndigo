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

select r.roomNo, r.type, r.price, g.guestName
from Booking b
inner join Room r
inner join Hotel h
inner join Guest g
where h.hotelNo = r.hotelNo and
b.hotelNo = h.hotelNo and
b.dateFrom <= CURDATE() and b.dateTo >= CURDATE()
and h.hotelName = 'Grosvenor';

select *
from Booking b
where
b.dateFrom <= CURDATE() and b.dateTo >= CURDATE()


# 6.19 What is the total income from bookings for the Grosvenor Hotel today?


# 6.22 List the number of rooms in each hotel.


# 6.23 List the number of rooms in each hotel in London.


# 6.24 What is the average number of bookings for each hotel in August?
