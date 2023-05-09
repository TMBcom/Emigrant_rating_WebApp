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

public class RecipientController {
    private final TrackingService trackingService;
    @GetMapping("/RecipientMain")
    public String Tracking(Model model) {
        model.addAttribute("Tracks", trackingService.listTracks());
        return "RecipientMainPage";
    }
    @PostMapping("RecipientMain/delete/{id}")
    public String deleteTracking(@PathVariable long id, TrackingModel product){
        trackingService.deleteTrack(id);
        return "redirect:/RecipientMain";
    }
    @GetMapping("/RecipientMainPage/{id}")
    public String TrackingInfo(@PathVariable long id, Model model) {
        model.addAttribute("Track", trackingService.getTrackById(id));
        return "Order-info";
    }
}
