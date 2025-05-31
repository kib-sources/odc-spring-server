package kib.odc.production.controller;


import kib.odc.production.models.dao.BanknoteEntity;
import kib.odc.production.service.BanknoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/admin")
@Slf4j
@RequiredArgsConstructor
public class AdminController {

    private final BanknoteService banknoteService;

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("");
    }

    @PostMapping("/key/create")
    public ResponseEntity<String> key() {
        return ResponseEntity.ok("key created");
    }

    @GetMapping("/key/openlist")
    public ResponseEntity<String> keyOpenList() {
        return ResponseEntity.ok("Get open key list");
    }

    // TEST METHOD
    @PostMapping("/test")
    public ResponseEntity<BanknoteEntity> test() {
        return ResponseEntity.ok(banknoteService.createTestBanknote());
    }

//    @PostMapping("/key/sign")
//    public ResponseEntity<String> approveOrder(@RequestParam("orderId") String orderId) {
//        return ResponseEntity.ok("Approved order");
//    }
}
