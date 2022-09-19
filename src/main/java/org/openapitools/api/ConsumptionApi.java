/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.List;
import org.openapitools.model.TimeValueObject;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-15T21:38:43.045400+02:00[Europe/Vienna]")
@Validated
@Api(value = "consumption", description = "the consumption API")
public interface ConsumptionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /consumption/saveYearValues
     * save year values in database
     *
     * @param timeValueObject  (required)
     * @return successfully saved (status code 200)
     */
    @ApiOperation(value = "", nickname = "saveYearValues", notes = "save year values in database", tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfully saved") })
    @PostMapping(
        value = "/consumption/saveYearValues",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> saveYearValues(@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<TimeValueObject> timeValueObject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
