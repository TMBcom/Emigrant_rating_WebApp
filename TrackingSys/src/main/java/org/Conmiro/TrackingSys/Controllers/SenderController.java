package org.Conmiro.TrackingSys.Controllers;

import lombok.RequiredArgsConstructor;
import org.Conmiro.TrackingSys.Models.TrackingModel;
import org.Conmiro.TrackingSys.Service.TrackingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
