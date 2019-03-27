package com.gabara.complaintservices.bootstrap;

import com.gabara.complaintservices.model.Complaint;
import com.gabara.complaintservices.model.Customer;
import com.gabara.complaintservices.repositories.ComplaintRepository;
import com.gabara.complaintservices.repositories.CustomerRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ComplaintRepository complaintRepository;

    private CustomerRepository customerRepository;

    public DevBootstrap(ComplaintRepository complaintRepository, CustomerRepository customerRepository) {
        this.complaintRepository = complaintRepository;
        this.customerRepository = customerRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){
        Customer cus1 = new Customer("John", "Kowalchyk");
        Complaint com1 = new Complaint(Complaint.Category.PRODUCT_CONCERNS, cus1);
        Complaint com2 = new Complaint(Complaint.Category.CONNECTION_ISSUES, cus1);
        cus1.getComplaints().add(com2);
        cus1.getComplaints().add(com1);
        customerRepository.save(cus1);
        complaintRepository.save(com1);
        complaintRepository.save(com2);

    }
}
