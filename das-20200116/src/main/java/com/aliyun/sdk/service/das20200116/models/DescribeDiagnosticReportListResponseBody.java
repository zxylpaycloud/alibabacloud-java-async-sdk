// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportListResponseBody</p>
 */
public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("Synchro")
    private String synchro;

    private DescribeDiagnosticReportListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportListResponseBody create() {
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
    public String getData() {
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public String getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 
        private String synchro; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information of the diagnostics reports. Valid values:
         * <p>
         * 
         * *   **total**: the number of diagnostics reports.
         * *   **score**: the health score.
         * *   **diagnosticTime**: the time when the diagnostics report was generated. The time is displayed in UTC.
         * *   **startTime**: the start time of the query. The time is displayed in UTC.
         * *   **endTime**: the end time of the query. The time is displayed in UTC.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
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

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder synchro(String synchro) {
            this.synchro = synchro;
            return this;
        }

        public DescribeDiagnosticReportListResponseBody build() {
            return new DescribeDiagnosticReportListResponseBody(this);
        } 

    } 

}
