/**
 * License%3A1.0
 */
package module02.consoleApp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import module02.consoleApp.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutProductRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutProductRequestProtocolMarshaller implements Marshaller<Request<PutProductRequest>, PutProductRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY).requestUri("/test/product")
            .httpMethodName(HttpMethodName.PUT).hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("ConsoleApp").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public PutProductRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutProductRequest> marshall(PutProductRequest putProductRequest) {

        if (putProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<PutProductRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    putProductRequest);

            protocolMarshaller.startMarshalling();
            PutProductRequestMarshaller.getInstance().marshall(putProductRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
