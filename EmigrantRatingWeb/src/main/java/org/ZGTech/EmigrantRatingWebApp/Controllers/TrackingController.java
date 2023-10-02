package org.ZGTech.EmigrantRatingWebApp.Controllers;

import lombok.RequiredArgsConstructor;
import org.ZGTech.EmigrantRatingWebApp.Service.TrackingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class TrackingController {
    private final TrackingService trackingService;

    @GetMapping("/")
    public String IndexPage() {
        return "Index";
    }


}
