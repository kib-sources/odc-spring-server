CREATE TABLE BANKNOTES_HEADERS
(
    bank_id                           uuid       not null,
    banknote_id                       uuid       not null,
    bok                               text       not null,
    code                              varchar(4) not null,
    amount                            bigint,
    applicability                     varchar(20),
    count_append_applicability_blocks int,
    sign_algorithm                    text,
    hash_algorithm                    text,
    salt                              text,
    hash                              text,
    bank_sign                         text,
    constraint PK_BANKNOTES_HEADERS primary key (banknote_id)
)