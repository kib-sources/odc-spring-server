package kib.odc.master.controller;


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

    @GetMapping("/status/{serverName}")
    public ResponseEntity<String> status(@RequestParam String serverName) {
        // статус сервера по имени serverName
        // если servername == ALL, то выводим список инициализированных серверов
        return ResponseEntity.ok("Not initialized");
    }

    @PostMapping("/master/initialize")
    public ResponseEntity<String> initialize(@RequestParam("file") MultipartFile file) {

        // 1. validation
        //

        return ResponseEntity.ok("Initialized");
    }

    // Заявки - Orders
    @PostMapping("/order/create")
    public ResponseEntity<String> order() {
        //
        return ResponseEntity.ok("Order created");
    }

    @GetMapping("/order/list")
    public ResponseEntity<String> getOrders() {
        // с фильтрацией
        return ResponseEntity.ok("Get orders");
    }

    @PostMapping("/order/approve")
    public ResponseEntity<String> approveOrder(@RequestParam("orderId") String orderId) {
        return ResponseEntity.ok("Approved order");
    }

    @PostMapping("/order/deny")
    public ResponseEntity<String> denyOrder(@RequestParam("orderId") String orderId) {
        return ResponseEntity.ok("Deny order");
    }
}
