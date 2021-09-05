/**
 * License%3A1.0
 */
package module02.consoleApp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import module02.consoleApp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostProductResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostProductResultJsonUnmarshaller implements Unmarshaller<PostProductResult, JsonUnmarshallerContext> {

    public PostProductResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostProductResult postProductResult = new PostProductResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postProductResult;
        }

        while (true) {
            if (token == null)
                break;

            postProductResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postProductResult;
    }

    private static PostProductResultJsonUnmarshaller instance;

    public static PostProductResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostProductResultJsonUnmarshaller();
        return instance;
    }
}
