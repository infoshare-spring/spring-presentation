package pl.infoshare.springintroduction.logging;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoggingController {

    private final LoggingService loggingService;

    @GetMapping("/log-things")
    void logThings() {
        loggingService.logThings();
    }
}
