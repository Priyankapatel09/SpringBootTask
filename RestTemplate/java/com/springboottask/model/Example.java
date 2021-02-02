
package com.springboottask.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardetails",
    "maintainance"
})
public class Example {

    @JsonProperty("cardetails")
    private Cardetails cardetails;
    @JsonProperty("maintainance")
    private List<Maintainance> maintainance = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param maintainance
     * @param cardetails
     */
    public Example(Cardetails cardetails, List<Maintainance> maintainance) {
        super();
        this.cardetails = cardetails;
        this.maintainance = maintainance;
    }

    @JsonProperty("cardetails")
    public Cardetails getCardetails() {
        return cardetails;
    }

    @JsonProperty("cardetails")
    public void setCardetails(Cardetails cardetails) {
        this.cardetails = cardetails;
    }

    @JsonProperty("maintainance")
    public List<Maintainance> getMaintainance() {
        return maintainance;
    }

    @JsonProperty("maintainance")
    public void setMaintainance(List<Maintainance> maintainance) {
        this.maintainance = maintainance;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Example [cardetails=" + cardetails + ", maintainance=" + maintainance + ", additionalProperties="
				+ additionalProperties + "]";
	}

    /*@Override
    public String toString() {
        return new ToStringBuilder(this).append("cardetails", cardetails).append("maintainance", maintainance).append("additionalProperties", additionalProperties).toString();
    }*/

}
