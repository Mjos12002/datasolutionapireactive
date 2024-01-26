package com.twofifty.datasolutionapi.model;

import com.twofifty.datasolutionapi.enums.Status;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProvided {

    @Id
    UUID id;
    String name;
    Status status;
}
