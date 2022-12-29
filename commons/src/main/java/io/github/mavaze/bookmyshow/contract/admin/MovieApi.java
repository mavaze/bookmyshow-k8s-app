package io.github.mavaze.bookmyshow.contract.admin;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import reactivefeign.spring.config.ReactiveFeignClient;

@ReactiveFeignClient("admin-api")
@SecurityRequirement(name = "security_auth", scopes = { "admin" })
public interface MovieApi {

}
