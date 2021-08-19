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
 * PutProductResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProductResultJsonUnmarshaller implements Unmarshaller<PutProductResult, JsonUnmarshallerContext> {

    public PutProductResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutProductResult putProductResult = new PutProductResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putProductResult;
        }

        while (true) {
            if (token == null)
                break;

            putProductResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return putProductResult;
    }

    private static PutProductResultJsonUnmarshaller instance;

    public static PutProductResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutProductResultJsonUnmarshaller();
        return instance;
    }
}
