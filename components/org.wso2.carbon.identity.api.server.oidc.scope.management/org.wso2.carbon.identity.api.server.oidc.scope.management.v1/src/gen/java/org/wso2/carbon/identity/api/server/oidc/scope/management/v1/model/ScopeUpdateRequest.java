/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.api.server.oidc.scope.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ScopeUpdateRequest  {
  
    private String displayName;
    private String description;
    private List<String> claims = new ArrayList<>();


    /**
    **/
    public ScopeUpdateRequest displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }
    
    @ApiModelProperty(example = "scopeOne", required = true, value = "")
    @JsonProperty("displayName")
    @Valid
    @NotNull(message = "Property displayName cannot be null.")

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
    **/
    public ScopeUpdateRequest description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "Sample updated scope one", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    **/
    public ScopeUpdateRequest claims(List<String> claims) {

        this.claims = claims;
        return this;
    }
    
    @ApiModelProperty(example = "[\"birthdate\",\"gender\",\"age\"]", required = true, value = "")
    @JsonProperty("claims")
    @Valid
    @NotNull(message = "Property claims cannot be null.")

    public List<String> getClaims() {
        return claims;
    }
    public void setClaims(List<String> claims) {
        this.claims = claims;
    }

    public ScopeUpdateRequest addClaimsItem(String claimsItem) {
        this.claims.add(claimsItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScopeUpdateRequest scopeUpdateRequest = (ScopeUpdateRequest) o;
        return Objects.equals(this.displayName, scopeUpdateRequest.displayName) &&
            Objects.equals(this.description, scopeUpdateRequest.description) &&
            Objects.equals(this.claims, scopeUpdateRequest.claims);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, description, claims);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ScopeUpdateRequest {\n");
        
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

