package rs.ac.uns.ftn.osavezbe05.service;

import rs.ac.uns.ftn.osavezbe05.model.entity.PurchaseOrder;
import rs.ac.uns.ftn.osavezbe05.model.entity.User;

public interface UserService {

    User findByUsernameAndPassword(String username, String password);

    void add(User user, PurchaseOrder order);

}
