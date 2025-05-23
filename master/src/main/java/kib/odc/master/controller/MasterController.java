package kib.odc.master.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/master")
@Slf4j
@RequiredArgsConstructor
public class MasterController {

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        // статус текущего сервера
        return ResponseEntity.ok("Not initialized");
    }

    @PostMapping("/initialize")
    public ResponseEntity<String> initialize(@RequestParam("file") MultipartFile file) {



        // 1. validation
        //

        return ResponseEntity.ok("Initialized");
    }

}
