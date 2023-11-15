package com.backend.backendapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BEController {
    @GetMapping("/")
    fun hello(): String = "Hello world newcomer"
}