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
@Table(name = "banknotes")
public class BanknoteEntity {
    @Id
    @Column(name = "banknote_id", nullable = false)
    private UUID id;

    @Column(name = "bank_id", nullable = false)
    private UUID bankId;

    @Column(name = "bpk_id", nullable = false)
    private UUID bpkId;

}