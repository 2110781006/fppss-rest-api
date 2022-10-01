package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-01T11:28:46.991179+02:00[Europe/Vienna]")
@Controller
@RequestMapping("${openapi.fPPSSEnergyREST.base-path:/api/v1}")
public class ValuesApiController implements ValuesApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ValuesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
