CREATE TABLE BANK_KEYS
(
    bpk_id         uuid not null,
    bpk            text not null,
    bok            text not null,
    sign_algorithm text,
    bok_sign       text,
    constraint PK_BANK_KEYS primary key (bpk_id)
)