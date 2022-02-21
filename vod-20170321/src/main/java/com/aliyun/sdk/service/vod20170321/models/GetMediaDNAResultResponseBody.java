// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaDNAResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaDNAResultResponseBody</p>
 */
public class GetMediaDNAResultResponseBody extends TeaModel {
    @NameInMap("DNAResult")
    private DNAResult DNAResult;

    @NameInMap("RequestId")
    private String requestId;

    private GetMediaDNAResultResponseBody(Builder builder) {
        this.DNAResult = builder.DNAResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaDNAResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return DNAResult
     */
    public DNAResult getDNAResult() {
        return this.DNAResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DNAResult DNAResult; 
        private String requestId; 

        /**
         * DNAResult.
         */
        public Builder DNAResult(DNAResult DNAResult) {
            this.DNAResult = DNAResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaDNAResultResponseBody build() {
            return new GetMediaDNAResultResponseBody(this);
        } 

    } 

    public static class Duplication extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        @NameInMap("Start")
        private String start;

        private Duplication(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Duplication create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Duplication build() {
                return new Duplication(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        @NameInMap("Start")
        private String start;

        private Input(Builder builder) {
            this.duration = builder.duration;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String start; 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("Duplication")
        private Duplication duplication;

        @NameInMap("Input")
        private Input input;

        private Detail(Builder builder) {
            this.duplication = builder.duplication;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return duplication
         */
        public Duplication getDuplication() {
            return this.duplication;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        public static final class Builder {
            private Duplication duplication; 
            private Input input; 

            /**
             * Duplication.
             */
            public Builder duplication(Duplication duplication) {
                this.duplication = duplication;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class VideoDNA extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("PrimaryKey")
        private String primaryKey;

        @NameInMap("Similarity")
        private String similarity;

        private VideoDNA(Builder builder) {
            this.detail = builder.detail;
            this.primaryKey = builder.primaryKey;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoDNA create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private String primaryKey; 
            private String similarity; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * Similarity.
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public VideoDNA build() {
                return new VideoDNA(this);
            } 

        } 

    }
    public static class DNAResult extends TeaModel {
        @NameInMap("VideoDNA")
        private java.util.List < VideoDNA> videoDNA;

        private DNAResult(Builder builder) {
            this.videoDNA = builder.videoDNA;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DNAResult create() {
            return builder().build();
        }

        /**
         * @return videoDNA
         */
        public java.util.List < VideoDNA> getVideoDNA() {
            return this.videoDNA;
        }

        public static final class Builder {
            private java.util.List < VideoDNA> videoDNA; 

            /**
             * VideoDNA.
             */
            public Builder videoDNA(java.util.List < VideoDNA> videoDNA) {
                this.videoDNA = videoDNA;
                return this;
            }

            public DNAResult build() {
                return new DNAResult(this);
            } 

        } 

    }
}
