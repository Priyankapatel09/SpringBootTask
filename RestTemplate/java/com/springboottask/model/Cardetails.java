
package com.springboottask.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bodytype",
    "global_n_cap_rating",
    "FIN",
    "fuel_type"
})
public class Cardetails {

    @JsonProperty("bodytype")
    private String bodytype;
    @JsonProperty("global_n_cap_rating")
    private String globalNCapRating;
    @JsonProperty("FIN")
    private String fIN;
    @JsonProperty("fuel_type")
    private String fuelType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cardetails() {
    }

    /**
     * 
     * @param fuelType
     * @param bodytype
     * @param fIN
     * @param globalNCapRating
     */
    public Cardetails(String bodytype, String globalNCapRating, String fIN, String fuelType) {
        super();
        this.bodytype = bodytype;
        this.globalNCapRating = globalNCapRating;
        this.fIN = fIN;
        this.fuelType = fuelType;
    }

    @JsonProperty("bodytype")
    public String getBodytype() {
        return bodytype;
    }

    @JsonProperty("bodytype")
    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    @JsonProperty("global_n_cap_rating")
    public String getGlobalNCapRating() {
        return globalNCapRating;
    }

    @JsonProperty("global_n_cap_rating")
    public void setGlobalNCapRating(String globalNCapRating) {
        this.globalNCapRating = globalNCapRating;
    }

    @JsonProperty("FIN")
    public String getFIN() {
        return fIN;
    }

    @JsonProperty("FIN")
    public void setFIN(String fIN) {
        this.fIN = fIN;
    }

    @JsonProperty("fuel_type")
    public String getFuelType() {
        return fuelType;
    }

    @JsonProperty("fuel_type")
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
		return "Cardetails [bodytype=" + bodytype + ", globalNCapRating=" + globalNCapRating + ", fIN=" + fIN
				+ ", fuelType=" + fuelType + ", additionalProperties=" + additionalProperties + "]";
	}

   /* @Override
    public String toString() {
        return new ToStringBuilder(this).append("bodytype", bodytype).append("globalNCapRating", globalNCapRating).append("fIN", fIN).append("fuelType", fuelType).append("additionalProperties", additionalProperties).toString();
    }*/

}
