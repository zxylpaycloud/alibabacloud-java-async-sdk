// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListApiDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiDestinationsResponseBody</p>
 */
public class ListApiDestinationsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListApiDestinationsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiDestinationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The returned response code. The value Success indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message. If the request is successful, success is returned. If the request failed, an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApiDestinationsResponseBody build() {
            return new ListApiDestinationsResponseBody(this);
        } 

    } 

    public static class HttpApiParameters extends TeaModel {
        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Method")
        private String method;

        private HttpApiParameters(Builder builder) {
            this.endpoint = builder.endpoint;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpApiParameters create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private String endpoint; 
            private String method; 

            /**
             * The endpoint of the API destination.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * - POST
             * 
             * - GET
             * 
             * - DELETE
             * 
             * - PUT
             * 
             * - HEAD
             * 
             * - TRACE
             * 
             * - PATCH
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public HttpApiParameters build() {
                return new HttpApiParameters(this);
            } 

        } 

    }
    public static class ApiDestinations extends TeaModel {
        @NameInMap("ApiDestinationName")
        private String apiDestinationName;

        @NameInMap("ConnectionName")
        private String connectionName;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("HttpApiParameters")
        private HttpApiParameters httpApiParameters;

        private ApiDestinations(Builder builder) {
            this.apiDestinationName = builder.apiDestinationName;
            this.connectionName = builder.connectionName;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.httpApiParameters = builder.httpApiParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiDestinations create() {
            return builder().build();
        }

        /**
         * @return apiDestinationName
         */
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return httpApiParameters
         */
        public HttpApiParameters getHttpApiParameters() {
            return this.httpApiParameters;
        }

        public static final class Builder {
            private String apiDestinationName; 
            private String connectionName; 
            private String description; 
            private Long gmtCreate; 
            private HttpApiParameters httpApiParameters; 

            /**
             * The name of the API destination.
             */
            public Builder apiDestinationName(String apiDestinationName) {
                this.apiDestinationName = apiDestinationName;
                return this;
            }

            /**
             * The connection name.
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * The description of the connection.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the API destination was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The request parameters that are configured for the API destination.
             */
            public Builder httpApiParameters(HttpApiParameters httpApiParameters) {
                this.httpApiParameters = httpApiParameters;
                return this;
            }

            public ApiDestinations build() {
                return new ApiDestinations(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApiDestinations")
        private java.util.List < ApiDestinations> apiDestinations;

        @NameInMap("MaxResults")
        private Float maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("Total")
        private Float total;

        private Data(Builder builder) {
            this.apiDestinations = builder.apiDestinations;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiDestinations
         */
        public java.util.List < ApiDestinations> getApiDestinations() {
            return this.apiDestinations;
        }

        /**
         * @return maxResults
         */
        public Float getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return total
         */
        public Float getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < ApiDestinations> apiDestinations; 
            private Float maxResults; 
            private String nextToken; 
            private Float total; 

            /**
             * The API destinations.
             */
            public Builder apiDestinations(java.util.List < ApiDestinations> apiDestinations) {
                this.apiDestinations = apiDestinations;
                return this;
            }

            /**
             * The maximum number of entries returned per page.
             */
            public Builder maxResults(Float maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * If excess return values exist, this parameter is returned.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Float total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
