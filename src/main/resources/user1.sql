INSERT INTO tb_users (user_id, username, email, password, full_name, user_status,
                      user_type, phone_number, creation_date, last_update_date)
VALUES ('b015c717-5fa3-43fb-93f6-ac07904a956f',
        'darthvader',
        'darth.vader@darkside.com',
        'Ab123456#',
        'Darth Vader',
        'ACTIVE',
        'USER',
        '11985963214',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP);


insert into tb_users (user_id, username, email, password, full_name, user_status,
                      user_type, phone_number, creation_date, last_update_date)
values (gen_random_uuid(),
        'lukeskywalker',
        'lukeskywalker@force.com',
        'Dd111333#',
        'Luke Skywalker',
        'ACTIVE',
        'USER',
        '15963256985',
        CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP
       );