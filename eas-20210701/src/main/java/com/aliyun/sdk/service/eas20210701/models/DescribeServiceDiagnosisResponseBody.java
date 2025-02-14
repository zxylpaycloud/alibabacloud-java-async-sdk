// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceDiagnosisResponseBody</p>
 */
public class DescribeServiceDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosisList")
    private java.util.List < DiagnosisList> diagnosisList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceDiagnosisResponseBody(Builder builder) {
        this.diagnosisList = builder.diagnosisList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceDiagnosisResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnosisList
     */
    public java.util.List < DiagnosisList> getDiagnosisList() {
        return this.diagnosisList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DiagnosisList> diagnosisList; 
        private String requestId; 

        /**
         * The diagnostics list.
         */
        public Builder diagnosisList(java.util.List < DiagnosisList> diagnosisList) {
            this.diagnosisList = diagnosisList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceDiagnosisResponseBody build() {
            return new DescribeServiceDiagnosisResponseBody(this);
        } 

    } 

    public static class DiagnosisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advices")
        private java.util.List < String > advices;

        @com.aliyun.core.annotation.NameInMap("Causes")
        private java.util.List < String > causes;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        private DiagnosisList(Builder builder) {
            this.advices = builder.advices;
            this.causes = builder.causes;
            this.error = builder.error;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosisList create() {
            return builder().build();
        }

        /**
         * @return advices
         */
        public java.util.List < String > getAdvices() {
            return this.advices;
        }

        /**
         * @return causes
         */
        public java.util.List < String > getCauses() {
            return this.causes;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        public static final class Builder {
            private java.util.List < String > advices; 
            private java.util.List < String > causes; 
            private String error; 

            /**
             * The suggestions about how to handle the errors.
             */
            public Builder advices(java.util.List < String > advices) {
                this.advices = advices;
                return this;
            }

            /**
             * The causes of the errors.
             */
            public Builder causes(java.util.List < String > causes) {
                this.causes = causes;
                return this;
            }

            /**
             * The error message.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            public DiagnosisList build() {
                return new DiagnosisList(this);
            } 

        } 

    }
}
