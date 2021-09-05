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
 * PostProductRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostProductRequestMarshaller {

    private static final PostProductRequestMarshaller instance = new PostProductRequestMarshaller();

    public static PostProductRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostProductRequest postProductRequest, ProtocolMarshaller protocolMarshaller) {

        if (postProductRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
