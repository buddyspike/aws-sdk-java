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
package com.amazonaws.services.directconnect.model;
import java.io.Serializable;

/**
 * <p>
 * A step in the offering order process.
 * </p>
 */
public class OfferingOrderStep  implements Serializable  {

    /**
     * Number of an order step. <p>Example: 1
     */
    private String number;

    /**
     * Name of the order step. <p>Example: Authorize cross connect
     */
    private String name;

    /**
     * More detailed description of the order step. <p>Example: "<i>AWS will
     * prepare your connection and send you an email with an LOA to provide
     * to the colocation provider</i>"
     */
    private String description;

    /**
     * The entity who owns the completion of the order step. <p>Example: AWS
     */
    private String owner;

    /**
     * Time to complete the order step in minutes. <p>Example: 60
     */
    private Integer sla;

    /**
     * Number of an order step. <p>Example: 1
     *
     * @return Number of an order step. <p>Example: 1
     */
    public String getNumber() {
        return number;
    }
    
    /**
     * Number of an order step. <p>Example: 1
     *
     * @param number Number of an order step. <p>Example: 1
     */
    public void setNumber(String number) {
        this.number = number;
    }
    
    /**
     * Number of an order step. <p>Example: 1
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param number Number of an order step. <p>Example: 1
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OfferingOrderStep withNumber(String number) {
        this.number = number;
        return this;
    }
    
    
    /**
     * Name of the order step. <p>Example: Authorize cross connect
     *
     * @return Name of the order step. <p>Example: Authorize cross connect
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of the order step. <p>Example: Authorize cross connect
     *
     * @param name Name of the order step. <p>Example: Authorize cross connect
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of the order step. <p>Example: Authorize cross connect
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Name of the order step. <p>Example: Authorize cross connect
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OfferingOrderStep withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * More detailed description of the order step. <p>Example: "<i>AWS will
     * prepare your connection and send you an email with an LOA to provide
     * to the colocation provider</i>"
     *
     * @return More detailed description of the order step. <p>Example: "<i>AWS will
     *         prepare your connection and send you an email with an LOA to provide
     *         to the colocation provider</i>"
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * More detailed description of the order step. <p>Example: "<i>AWS will
     * prepare your connection and send you an email with an LOA to provide
     * to the colocation provider</i>"
     *
     * @param description More detailed description of the order step. <p>Example: "<i>AWS will
     *         prepare your connection and send you an email with an LOA to provide
     *         to the colocation provider</i>"
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * More detailed description of the order step. <p>Example: "<i>AWS will
     * prepare your connection and send you an email with an LOA to provide
     * to the colocation provider</i>"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description More detailed description of the order step. <p>Example: "<i>AWS will
     *         prepare your connection and send you an email with an LOA to provide
     *         to the colocation provider</i>"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OfferingOrderStep withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * The entity who owns the completion of the order step. <p>Example: AWS
     *
     * @return The entity who owns the completion of the order step. <p>Example: AWS
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * The entity who owns the completion of the order step. <p>Example: AWS
     *
     * @param owner The entity who owns the completion of the order step. <p>Example: AWS
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    /**
     * The entity who owns the completion of the order step. <p>Example: AWS
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owner The entity who owns the completion of the order step. <p>Example: AWS
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OfferingOrderStep withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    
    /**
     * Time to complete the order step in minutes. <p>Example: 60
     *
     * @return Time to complete the order step in minutes. <p>Example: 60
     */
    public Integer getSla() {
        return sla;
    }
    
    /**
     * Time to complete the order step in minutes. <p>Example: 60
     *
     * @param sla Time to complete the order step in minutes. <p>Example: 60
     */
    public void setSla(Integer sla) {
        this.sla = sla;
    }
    
    /**
     * Time to complete the order step in minutes. <p>Example: 60
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sla Time to complete the order step in minutes. <p>Example: 60
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OfferingOrderStep withSla(Integer sla) {
        this.sla = sla;
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
        if (getNumber() != null) sb.append("Number: " + getNumber() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getSla() != null) sb.append("Sla: " + getSla() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNumber() == null) ? 0 : getNumber().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode()); 
        hashCode = prime * hashCode + ((getSla() == null) ? 0 : getSla().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OfferingOrderStep == false) return false;
        OfferingOrderStep other = (OfferingOrderStep)obj;
        
        if (other.getNumber() == null ^ this.getNumber() == null) return false;
        if (other.getNumber() != null && other.getNumber().equals(this.getNumber()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false; 
        if (other.getSla() == null ^ this.getSla() == null) return false;
        if (other.getSla() != null && other.getSla().equals(this.getSla()) == false) return false; 
        return true;
    }
    
}
    