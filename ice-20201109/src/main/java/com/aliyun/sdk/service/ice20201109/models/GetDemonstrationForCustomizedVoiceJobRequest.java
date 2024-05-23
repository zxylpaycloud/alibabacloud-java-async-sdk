// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDemonstrationForCustomizedVoiceJobRequest} extends {@link RequestModel}
 *
 * <p>GetDemonstrationForCustomizedVoiceJobRequest</p>
 */
public class GetDemonstrationForCustomizedVoiceJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenario;

    private GetDemonstrationForCustomizedVoiceJobRequest(Builder builder) {
        super(builder);
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDemonstrationForCustomizedVoiceJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<GetDemonstrationForCustomizedVoiceJobRequest, Builder> {
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(GetDemonstrationForCustomizedVoiceJobRequest request) {
            super(request);
            this.scenario = request.scenario;
        } 

        /**
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public GetDemonstrationForCustomizedVoiceJobRequest build() {
            return new GetDemonstrationForCustomizedVoiceJobRequest(this);
        } 

    } 

}
