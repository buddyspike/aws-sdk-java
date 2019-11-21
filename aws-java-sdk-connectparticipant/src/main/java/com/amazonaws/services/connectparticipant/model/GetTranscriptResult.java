/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetTranscript" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTranscriptResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     */
    private String initialContactId;
    /**
     * <p>
     * The list of messages in the session.
     * </p>
     */
    private java.util.List<Item> transcript;
    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * 
     * @param initialContactId
     *        The initial contact ID for the contact.
     */

    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * 
     * @return The initial contact ID for the contact.
     */

    public String getInitialContactId() {
        return this.initialContactId;
    }

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * 
     * @param initialContactId
     *        The initial contact ID for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptResult withInitialContactId(String initialContactId) {
        setInitialContactId(initialContactId);
        return this;
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     * 
     * @return The list of messages in the session.
     */

    public java.util.List<Item> getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     * 
     * @param transcript
     *        The list of messages in the session.
     */

    public void setTranscript(java.util.Collection<Item> transcript) {
        if (transcript == null) {
            this.transcript = null;
            return;
        }

        this.transcript = new java.util.ArrayList<Item>(transcript);
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTranscript(java.util.Collection)} or {@link #withTranscript(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param transcript
     *        The list of messages in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptResult withTranscript(Item... transcript) {
        if (this.transcript == null) {
            setTranscript(new java.util.ArrayList<Item>(transcript.length));
        }
        for (Item ele : transcript) {
            this.transcript.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     * 
     * @param transcript
     *        The list of messages in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptResult withTranscript(java.util.Collection<Item> transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Use the value returned previously in the next subsequent request to retrieve the
     *        next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     * 
     * @return The pagination token. Use the value returned previously in the next subsequent request to retrieve the
     *         next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Use the value returned previously in the next subsequent request to retrieve the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: ").append(getInitialContactId()).append(",");
        if (getTranscript() != null)
            sb.append("Transcript: ").append(getTranscript()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTranscriptResult == false)
            return false;
        GetTranscriptResult other = (GetTranscriptResult) obj;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTranscriptResult clone() {
        try {
            return (GetTranscriptResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
