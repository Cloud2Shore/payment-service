package paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import paymentservice.model.PaymentDetails;

@RestController
@RequestMapping("/payment")
public class PaymentServiceController {

    @PostMapping("/process")
    public boolean processPayment(@RequestBody PaymentDetails paymentDetails) {
        // Placeholder for real payment processing logic
        return true;
    }
}
