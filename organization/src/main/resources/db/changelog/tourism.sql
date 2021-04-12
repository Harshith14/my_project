CREATE TABLE tourism_data (
   tourism_id bigserial primary key,
 name_of_tourism text not null,
   number_of_members text not null,
    country text not null,
    no_of_places text not null,
    total_prize bigint not null
);