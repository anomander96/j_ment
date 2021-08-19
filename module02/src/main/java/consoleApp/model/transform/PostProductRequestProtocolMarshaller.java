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
 * PostProductRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostProductRequestProtocolMarshaller implements Marshaller<Request<PostProductRequest>, PostProductRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.API_GATEWAY).requestUri("/test/product")
            .httpMethodName(HttpMethodName.POST).hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("ConsoleApp").build();

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory;

    public PostProductRequestProtocolMarshaller(com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PostProductRequest> marshall(PostProductRequest postProductRequest) {

        if (postProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<PostProductRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    postProductRequest);

            protocolMarshaller.startMarshalling();
            PostProductRequestMarshaller.getInstance().marshall(postProductRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
