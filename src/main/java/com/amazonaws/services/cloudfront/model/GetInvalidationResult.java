/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;
import java.io.Serializable;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class GetInvalidationResult  implements Serializable  {

    /**
     * The invalidation's information.
     */
    private Invalidation invalidation;

    /**
     * The invalidation's information.
     *
     * @return The invalidation's information.
     */
    public Invalidation getInvalidation() {
        return invalidation;
    }
    
    /**
     * The invalidation's information.
     *
     * @param invalidation The invalidation's information.
     */
    public void setInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
    }
    
    /**
     * The invalidation's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidation The invalidation's information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetInvalidationResult withInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInvalidation() != null) sb.append("Invalidation: " + getInvalidation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInvalidation() == null) ? 0 : getInvalidation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetInvalidationResult == false) return false;
        GetInvalidationResult other = (GetInvalidationResult)obj;
        
        if (other.getInvalidation() == null ^ this.getInvalidation() == null) return false;
        if (other.getInvalidation() != null && other.getInvalidation().equals(this.getInvalidation()) == false) return false; 
        return true;
    }
    
}
    