package org.ZGTech.EmigrantRatingWebApp.Controllers;

import lombok.RequiredArgsConstructor;
import org.ZGTech.EmigrantRatingWebApp.Models.TrackingModel;
import org.ZGTech.EmigrantRatingWebApp.Service.TrackingService;
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
    @PostMapping("RecipientMain/update/{id}")
    public String updateTracking(@PathVariable long id, TrackingModel product){
        trackingService.updateTrack(product);
        return "redirect:/RecipientMainPage/{id}";
    }
    @GetMapping("/RecipientMainPage/{id}")
    public String TrackingInfo(@PathVariable long id, Model model) {
        model.addAttribute("Track", trackingService.getTrackById(id));
        return "Order-info";
    }
}
