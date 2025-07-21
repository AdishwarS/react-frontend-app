package reactfrontendapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "react-frontend-app");
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "name", "react-frontend-app",
            "version", "1.0.0",
            "description", "&quot;Create a React dashboard with TypeScript, Material-UI, and Chart.js for displaying sales analytics&quot;",
            "owner", "backstage-user"
        );
    }
}