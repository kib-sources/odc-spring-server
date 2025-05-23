package kib.odc.master.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/production")
@Slf4j
@RequiredArgsConstructor
public class ForProductionController {

    @PostMapping("/memorandum/create")
    public ResponseEntity<String> create(@RequestParam("file") MultipartFile file) {

        /*
        Production сервер отправляет bok ключ, список желаемых действий (эмиссия банкнот и др.)

        Функция создает
         */

        return ResponseEntity.ok("Created");
    }

    @PostMapping("/memorandum/get")
    public ResponseEntity<String> initialize(@RequestParam("file") MultipartFile file) {

        /*
        Получить меморандум, если он создан
         */

        return ResponseEntity.ok("Created");
    }

    @PostMapping("/memorandum/status")
    public ResponseEntity<String> status(@RequestParam("file") MultipartFile file) {

        /*
        Получить статус меморандума: PROCESSING, SIGNED, NOT_SIGNED, NOT_FOUND, DELETED
         */

        return ResponseEntity.ok("Created");
    }

}
