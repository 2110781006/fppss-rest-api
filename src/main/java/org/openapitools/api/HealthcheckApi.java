/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T17:22:04.931921+02:00[Europe/Vienna]")
@Validated
@Api(value = "healthcheck", description = "the healthcheck API")
public interface HealthcheckApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /healthcheck
     * healthcheck
     *
     * @return healthcheck (status code 200)
     */
    @ApiOperation(value = "", nickname = "healthcheck", notes = "healthcheck", tags={ "status", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "healthcheck") })
    @GetMapping(
        value = "/healthcheck"
    )
    default ResponseEntity<Void> healthcheck()
    {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
