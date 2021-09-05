/**
 * License%3A1.0
 */
package module02.consoleApp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import module02.consoleApp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutProductRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutProductRequestMarshaller {

    private static final PutProductRequestMarshaller instance = new PutProductRequestMarshaller();

    public static PutProductRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutProductRequest putProductRequest, ProtocolMarshaller protocolMarshaller) {

        if (putProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
