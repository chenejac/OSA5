package rs.ac.uns.ftn.osavezbe05.service.implementation;

import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.osavezbe05.model.dto.CreditCardDTO;
import rs.ac.uns.ftn.osavezbe05.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public boolean processCreditCard(CreditCardDTO card) {
        return true;
    }

}
