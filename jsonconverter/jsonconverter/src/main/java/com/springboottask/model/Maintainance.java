
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
    "datetime",
    "task"
})
public class Maintainance {

    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("task")
    private String task;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Maintainance() {
    }

    /**
     * 
     * @param datetime
     * @param task
     */
    public Maintainance(String datetime, String task) {
        super();
        this.datetime = datetime;
        this.task = task;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    @JsonProperty("task")
    public void setTask(String task) {
        this.task = task;
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
		return "Maintainance [datetime=" + datetime + ", task=" + task + ", additionalProperties="
				+ additionalProperties + "]";
	}

   /* @Override
    public String toString() {
        return new ToStringBuilder(this).append("datetime", datetime).append("task", task).append("additionalProperties", additionalProperties).toString();
    }*/

}
