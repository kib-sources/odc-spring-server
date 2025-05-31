CREATE TABLE BANKNOTES
(
    bank_id     uuid not null,
    banknote_id uuid not null,
    bpk_id      uuid not null, -- bank private key id
    constraint PK_BANKNOTES primary key (banknote_id)
);

CREATE INDEX IX_BANKNOTES ON BANKNOTES (bpk_id);
