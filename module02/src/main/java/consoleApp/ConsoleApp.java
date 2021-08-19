/**
 * License%3A1.0
 */
package module02.consoleApp;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import module02.consoleApp.model.*;

/**
 * Interface for accessing ConsoleApp.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface ConsoleApp {

    /**
     * @param postProductRequest
     * @return Result of the PostProduct operation returned by the service.
     * @sample ConsoleApp.PostProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xledk0qkpg-2021-08-11T16:15:52Z/PostProduct"
     *      target="_top">AWS API Documentation</a>
     */
    PostProductResult postProduct(PostProductRequest postProductRequest);

    /**
     * @param putProductRequest
     * @return Result of the PutProduct operation returned by the service.
     * @sample ConsoleApp.PutProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xledk0qkpg-2021-08-11T16:15:52Z/PutProduct"
     *      target="_top">AWS API Documentation</a>
     */
    PutProductResult putProduct(PutProductRequest putProductRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static ConsoleAppClientBuilder builder() {
        return new ConsoleAppClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
