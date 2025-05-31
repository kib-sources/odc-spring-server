package kib.odc.production.models.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "banknotes_headers")
public class BanknotesHeaderEntity {
    @Id
    @Column(name = "banknote_id", nullable = false)
    private UUID id;

    @Column(name = "bank_id", nullable = false)
    private UUID bankId;

    @Column(name = "bok", nullable = false, length = Integer.MAX_VALUE)
    private String bok;

    @Column(name = "code", nullable = false, length = 4)
    private String code;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "applicability", length = 20)
    private String applicability;

    @Column(name = "count_append_applicability_blocks")
    private Integer countAppendApplicabilityBlocks;

    @Column(name = "sign_algorithm", length = Integer.MAX_VALUE)
    private String signAlgorithm;

    @Column(name = "hash_algorithm", length = Integer.MAX_VALUE)
    private String hashAlgorithm;

    @Column(name = "salt", length = Integer.MAX_VALUE)
    private String salt;

    @Column(name = "hash", length = Integer.MAX_VALUE)
    private String hash;

    @Column(name = "bank_sign", length = Integer.MAX_VALUE)
    private String bankSign;

}