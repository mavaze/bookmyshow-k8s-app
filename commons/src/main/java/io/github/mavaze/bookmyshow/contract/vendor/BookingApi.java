package io.github.mavaze.bookmyshow.contract.vendor;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient("vendor-api")
@SecurityRequirement(name = "security_auth", scopes = { "vendor" })
public interface BookingApi {

}
