package rs.ac.uns.ftn.osavezbe05.service;

import rs.ac.uns.ftn.osavezbe05.model.dto.CreditCardDTO;

public interface PaymentService {

    boolean processCreditCard(CreditCardDTO card);
    
}
