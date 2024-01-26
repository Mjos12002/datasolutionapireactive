package com.twofifty.datasolutionapi.service;

import com.twofifty.datasolutionapi.enums.Status;
import com.twofifty.datasolutionapi.model.ServiceProvided;
import com.twofifty.datasolutionapi.repository.ServiceProvidedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class ServiceProvidedService {

    @Autowired
    ServiceProvidedRepository serviceProvidedRepository;

    public Flux<ServiceProvided> getServiceProvidedByName(String name) {
        return serviceProvidedRepository.getServiceByName(name);
    }

    public Flux<ServiceProvided> getServiceProvidedByStatus(Status status){
        return serviceProvidedRepository.getServiceByStatus(status);
    }

    public Mono<ServiceProvided> createServiceProvided(ServiceProvided serviceProvided) {
        return serviceProvidedRepository.save(serviceProvided);
    }
    
    public Mono<ServiceProvided> getServiceByID(UUID id) {
        return serviceProvidedRepository.findById(id);
    }

    public Flux<ServiceProvided> getAllServiceProvided() {
        return serviceProvidedRepository.findAll();
    }
}
