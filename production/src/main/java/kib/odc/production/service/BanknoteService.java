package kib.odc.production.service;

import kib.odc.production.models.dao.BanknoteEntity;
import kib.odc.production.repository.BanknoteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class BanknoteService {

    private final BanknoteRepository banknoteRepository;

    public BanknoteEntity createTestBanknote() {
        BanknoteEntity banknote = new BanknoteEntity();
        banknote.setId(UUID.randomUUID());
        banknote.setBankId(UUID.randomUUID());
        banknote.setBpkId(UUID.randomUUID());
        banknoteRepository.save(banknote);
        return banknote;
    }

}
