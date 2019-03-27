package com.gabara.complaintservices.repositories;

import com.gabara.complaintservices.model.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintRepository extends CrudRepository<Complaint, Long> {
}
