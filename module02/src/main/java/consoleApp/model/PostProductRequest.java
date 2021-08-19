/**
 * License%3A1.0
 */
package module02.consoleApp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xledk0qkpg-2021-08-11T16:15:52Z/PostProduct" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostProductRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostProductRequest == false)
            return false;
        PostProductRequest other = (PostProductRequest) obj;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public PostProductRequest clone() {
        return (PostProductRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostProductRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
