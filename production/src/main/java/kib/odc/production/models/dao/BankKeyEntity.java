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
@Table(name = "bank_keys")
public class BankKeyEntity {
    @Id
    @Column(name = "bpk_id", nullable = false)
    private UUID id;

    @Column(name = "bpk", nullable = false, length = Integer.MAX_VALUE)
    private String bpk;

    @Column(name = "bok", nullable = false, length = Integer.MAX_VALUE)
    private String bok;

    @Column(name = "sign_algorithm", length = Integer.MAX_VALUE)
    private String signAlgorithm;

    @Column(name = "bok_sign", length = Integer.MAX_VALUE)
    private String bokSign;

}