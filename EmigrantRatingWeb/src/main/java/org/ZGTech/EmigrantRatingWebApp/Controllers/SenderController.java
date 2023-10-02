package org.ZGTech.EmigrantRatingWebApp.Controllers;

import lombok.RequiredArgsConstructor;
import org.ZGTech.EmigrantRatingWebApp.Models.TrackingModel;
import org.ZGTech.EmigrantRatingWebApp.Service.TrackingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor

public class SenderController {
    private final TrackingService trackingService;
    @GetMapping("/SenderMain")
    public String Tracking(Model model) {
        model.addAttribute("Tracks", trackingService.listTracks());
        return "SenderMainPage";
    }
    @PostMapping("/SenderMain/create")
    public String createTracking(TrackingModel track) {
        trackingService.saveTrack(track);
        return "redirect:/SenderMain";
    }
}
