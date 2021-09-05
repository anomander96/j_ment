/**
 * License%3A1.0
 */
package module02.consoleApp;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link module02.consoleApp.ConsoleApp}.
 * 
 * @see module02.consoleApp.ConsoleApp#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class ConsoleAppClientBuilder extends SdkSyncClientBuilder<ConsoleAppClientBuilder, ConsoleApp> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("xledk0qkpg.execute-api.eu-central-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-central-1";

    /**
     * Package private constructor - builder should be created via {@link ConsoleApp#builder()}
     */
    ConsoleAppClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of ConsoleApp using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of ConsoleApp.
     */
    @Override
    protected ConsoleApp build(AwsSyncClientParams params) {
        return new ConsoleAppClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
