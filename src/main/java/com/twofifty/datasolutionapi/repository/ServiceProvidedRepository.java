package com.twofifty.datasolutionapi.repository;

import com.twofifty.datasolutionapi.enums.Status;
import com.twofifty.datasolutionapi.model.ServiceProvided;
import jakarta.persistence.ManyToOne;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface ServiceProvidedRepository extends R2dbcRepository<ServiceProvided, UUID> {
    Flux<ServiceProvided> getServiceByName(String name);
    Flux<ServiceProvided> getServiceByStatus(Status status);
}
