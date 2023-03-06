
    create table keyword (
       name varchar(255) not null,
        post_id bigint not null,
        primary key (name, post_id)
    ) engine=InnoDB;

    create table post (
       id bigint not null auto_increment,
        created_date datetime(6),
        title varchar(255),
        created_by bigint,
        primary key (id)
    ) engine=InnoDB;

    create table role (
       id bigint not null auto_increment,
        role_name smallint,
        primary key (id)
    ) engine=InnoDB;

    create table user (
       id bigint not null auto_increment,
        full_name varchar(255),
        password varchar(255),
        phone_number varchar(255),
        username_of_user varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table user 
       add constraint UK_9qb5yn83ptwdye6l6munajodo unique (username_of_user);

    alter table post 
       add constraint FK93o2xaw90541rp5xaf29hsgd2 
       foreign key (created_by) 
       references user (id);

    alter table user_role 
       add constraint FKa68196081fvovjhkek5m97n3y 
       foreign key (role_id) 
       references role (id);

    alter table user_role 
       add constraint FK859n2jvi8ivhui0rl0esws6o 
       foreign key (user_id) 
       references user (id);

    create table keyword (
       name varchar(255) not null,
        post_id bigint not null,
        primary key (name, post_id)
    ) engine=InnoDB;

    create table post (
       id bigint not null auto_increment,
        created_date datetime(6),
        title varchar(255),
        created_by bigint,
        primary key (id)
    ) engine=InnoDB;

    create table role (
       id bigint not null auto_increment,
        role_name smallint,
        primary key (id)
    ) engine=InnoDB;

    create table user (
       id bigint not null auto_increment,
        full_name varchar(255),
        password varchar(255),
        phone_number varchar(255),
        username_of_user varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table user 
       add constraint UK_9qb5yn83ptwdye6l6munajodo unique (username_of_user);

    alter table post 
       add constraint FK93o2xaw90541rp5xaf29hsgd2 
       foreign key (created_by) 
       references user (id);

    alter table user_role 
       add constraint FKa68196081fvovjhkek5m97n3y 
       foreign key (role_id) 
       references role (id);

    alter table user_role 
       add constraint FK859n2jvi8ivhui0rl0esws6o 
       foreign key (user_id) 
       references user (id);

    create table keyword (
       name varchar(255) not null,
        post_id bigint not null,
        primary key (name, post_id)
    ) engine=InnoDB;

    create table post (
       id bigint not null auto_increment,
        created_date datetime(6),
        title varchar(255),
        created_by bigint,
        primary key (id)
    ) engine=InnoDB;

    create table role (
       id bigint not null auto_increment,
        role_name smallint,
        primary key (id)
    ) engine=InnoDB;

    create table user (
       id bigint not null auto_increment,
        full_name varchar(255),
        password varchar(255),
        phone_number varchar(255),
        username_of_user varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table user 
       add constraint UK_9qb5yn83ptwdye6l6munajodo unique (username_of_user);

    alter table post 
       add constraint FK93o2xaw90541rp5xaf29hsgd2 
       foreign key (created_by) 
       references user (id);

    alter table user_role 
       add constraint FKa68196081fvovjhkek5m97n3y 
       foreign key (role_id) 
       references role (id);

    alter table user_role 
       add constraint FK859n2jvi8ivhui0rl0esws6o 
       foreign key (user_id) 
       references user (id);
