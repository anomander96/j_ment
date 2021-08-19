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
public class PostProductResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Empty empty;

    /**
     * @param empty
     */

    public void setEmpty(Empty empty) {
        this.empty = empty;
    }

    /**
     * @return
     */

    public Empty getEmpty() {
        return this.empty;
    }

    /**
     * @param empty
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostProductResult empty(Empty empty) {
        setEmpty(empty);
        return this;
    }

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
        if (getEmpty() != null)
            sb.append("Empty: ").append(getEmpty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostProductResult == false)
            return false;
        PostProductResult other = (PostProductResult) obj;
        if (other.getEmpty() == null ^ this.getEmpty() == null)
            return false;
        if (other.getEmpty() != null && other.getEmpty().equals(this.getEmpty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmpty() == null) ? 0 : getEmpty().hashCode());
        return hashCode;
    }

    @Override
    public PostProductResult clone() {
        try {
            return (PostProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
