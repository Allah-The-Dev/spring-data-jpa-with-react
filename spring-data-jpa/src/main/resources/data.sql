insert into users (id, initials, user_name, home_addr_street, home_addr_city, home_addr_state, home_addr_pincode) 
    values 
        (1, 'Mr.', 'Neelesh Kumar Pandey', 'street1', 'city1', 'state1', 'pin1'),
        (2, 'Mr.', 'Lalji Pandey', 'street2', 'city2', 'state2', 'pin2'),
        (3, 'Mr.', 'Abhishek Pandey', 'street3', 'city3', 'state3', 'pin3');

insert into vehicle (id, registration_no, user_id) 
    values 
        (1, 'KA015CP241', 1),
        (2, 'KA015CP242', 1),
        (3, 'KA015CP243', 2),
        (4, 'KA015CP244', 3);
