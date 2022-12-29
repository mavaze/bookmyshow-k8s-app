package io.github.mavaze.bookmyshow.contract.customer;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient("customer-api")
@SecurityRequirement(name = "security_auth", scopes = { "customer", "vendor", "admin" })
public interface SearchApi {

}
