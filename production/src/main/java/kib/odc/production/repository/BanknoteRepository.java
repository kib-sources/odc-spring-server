package kib.odc.production.repository;


import kib.odc.production.models.dao.BanknoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanknoteRepository extends JpaRepository<BanknoteEntity, Long> {
}
