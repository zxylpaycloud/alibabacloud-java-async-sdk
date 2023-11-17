// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealtimeInstanceStatesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeInstanceStatesResponseBody</p>
 */
public class GetRealtimeInstanceStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetRealtimeInstanceStatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeInstanceStatesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealtimeInstanceStatesResponseBody build() {
            return new GetRealtimeInstanceStatesResponseBody(this);
        } 

    } 

    public static class BreakCodeDetailList extends TeaModel {
        @NameInMap("BreakCode")
        private String breakCode;

        @NameInMap("Count")
        private Long count;

        private BreakCodeDetailList(Builder builder) {
            this.breakCode = builder.breakCode;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BreakCodeDetailList create() {
            return builder().build();
        }

        /**
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String breakCode; 
            private Long count; 

            /**
             * BreakCode.
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public BreakCodeDetailList build() {
                return new BreakCodeDetailList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BreakCodeDetailList")
        private java.util.List < BreakCodeDetailList> breakCodeDetailList;

        @NameInMap("BreakingAgents")
        private Long breakingAgents;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InteractiveCalls")
        private Long interactiveCalls;

        @NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @NameInMap("LongestWaitingTime")
        private Long longestWaitingTime;

        @NameInMap("ReadyAgents")
        private Long readyAgents;

        @NameInMap("TalkingAgents")
        private Long talkingAgents;

        @NameInMap("TotalAgents")
        private Long totalAgents;

        @NameInMap("WaitingCalls")
        private Long waitingCalls;

        @NameInMap("WorkingAgents")
        private Long workingAgents;

        private Data(Builder builder) {
            this.breakCodeDetailList = builder.breakCodeDetailList;
            this.breakingAgents = builder.breakingAgents;
            this.instanceId = builder.instanceId;
            this.interactiveCalls = builder.interactiveCalls;
            this.loggedInAgents = builder.loggedInAgents;
            this.longestWaitingTime = builder.longestWaitingTime;
            this.readyAgents = builder.readyAgents;
            this.talkingAgents = builder.talkingAgents;
            this.totalAgents = builder.totalAgents;
            this.waitingCalls = builder.waitingCalls;
            this.workingAgents = builder.workingAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return breakCodeDetailList
         */
        public java.util.List < BreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        /**
         * @return breakingAgents
         */
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return interactiveCalls
         */
        public Long getInteractiveCalls() {
            return this.interactiveCalls;
        }

        /**
         * @return loggedInAgents
         */
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        /**
         * @return longestWaitingTime
         */
        public Long getLongestWaitingTime() {
            return this.longestWaitingTime;
        }

        /**
         * @return readyAgents
         */
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        /**
         * @return talkingAgents
         */
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        /**
         * @return totalAgents
         */
        public Long getTotalAgents() {
            return this.totalAgents;
        }

        /**
         * @return waitingCalls
         */
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        /**
         * @return workingAgents
         */
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

        public static final class Builder {
            private java.util.List < BreakCodeDetailList> breakCodeDetailList; 
            private Long breakingAgents; 
            private String instanceId; 
            private Long interactiveCalls; 
            private Long loggedInAgents; 
            private Long longestWaitingTime; 
            private Long readyAgents; 
            private Long talkingAgents; 
            private Long totalAgents; 
            private Long waitingCalls; 
            private Long workingAgents; 

            /**
             * BreakCodeDetailList.
             */
            public Builder breakCodeDetailList(java.util.List < BreakCodeDetailList> breakCodeDetailList) {
                this.breakCodeDetailList = breakCodeDetailList;
                return this;
            }

            /**
             * BreakingAgents.
             */
            public Builder breakingAgents(Long breakingAgents) {
                this.breakingAgents = breakingAgents;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InteractiveCalls.
             */
            public Builder interactiveCalls(Long interactiveCalls) {
                this.interactiveCalls = interactiveCalls;
                return this;
            }

            /**
             * LoggedInAgents.
             */
            public Builder loggedInAgents(Long loggedInAgents) {
                this.loggedInAgents = loggedInAgents;
                return this;
            }

            /**
             * LongestWaitingTime.
             */
            public Builder longestWaitingTime(Long longestWaitingTime) {
                this.longestWaitingTime = longestWaitingTime;
                return this;
            }

            /**
             * ReadyAgents.
             */
            public Builder readyAgents(Long readyAgents) {
                this.readyAgents = readyAgents;
                return this;
            }

            /**
             * TalkingAgents.
             */
            public Builder talkingAgents(Long talkingAgents) {
                this.talkingAgents = talkingAgents;
                return this;
            }

            /**
             * TotalAgents.
             */
            public Builder totalAgents(Long totalAgents) {
                this.totalAgents = totalAgents;
                return this;
            }

            /**
             * WaitingCalls.
             */
            public Builder waitingCalls(Long waitingCalls) {
                this.waitingCalls = waitingCalls;
                return this;
            }

            /**
             * WorkingAgents.
             */
            public Builder workingAgents(Long workingAgents) {
                this.workingAgents = workingAgents;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
