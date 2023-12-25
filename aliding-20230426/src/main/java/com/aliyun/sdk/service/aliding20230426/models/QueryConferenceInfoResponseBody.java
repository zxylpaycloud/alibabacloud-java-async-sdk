// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConferenceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConferenceInfoResponseBody</p>
 */
public class QueryConferenceInfoResponseBody extends TeaModel {
    @NameInMap("confInfo")
    private ConfInfo confInfo;

    @NameInMap("requestId")
    private String requestId;

    private QueryConferenceInfoResponseBody(Builder builder) {
        this.confInfo = builder.confInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConferenceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return confInfo
     */
    public ConfInfo getConfInfo() {
        return this.confInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfInfo confInfo; 
        private String requestId; 

        /**
         * confInfo.
         */
        public Builder confInfo(ConfInfo confInfo) {
            this.confInfo = confInfo;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryConferenceInfoResponseBody build() {
            return new QueryConferenceInfoResponseBody(this);
        } 

    } 

    public static class ConfInfo extends TeaModel {
        @NameInMap("ActiveNum")
        private Integer activeNum;

        @NameInMap("AttendNum")
        private Integer attendNum;

        @NameInMap("ConfDuration")
        private Long confDuration;

        @NameInMap("ConferenceId")
        private String conferenceId;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CreatorNick")
        private String creatorNick;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExternalLinkUrl")
        private String externalLinkUrl;

        @NameInMap("InvitedNum")
        private Integer invitedNum;

        @NameInMap("RoomCode")
        private String roomCode;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        private ConfInfo(Builder builder) {
            this.activeNum = builder.activeNum;
            this.attendNum = builder.attendNum;
            this.confDuration = builder.confDuration;
            this.conferenceId = builder.conferenceId;
            this.creatorId = builder.creatorId;
            this.creatorNick = builder.creatorNick;
            this.endTime = builder.endTime;
            this.externalLinkUrl = builder.externalLinkUrl;
            this.invitedNum = builder.invitedNum;
            this.roomCode = builder.roomCode;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfInfo create() {
            return builder().build();
        }

        /**
         * @return activeNum
         */
        public Integer getActiveNum() {
            return this.activeNum;
        }

        /**
         * @return attendNum
         */
        public Integer getAttendNum() {
            return this.attendNum;
        }

        /**
         * @return confDuration
         */
        public Long getConfDuration() {
            return this.confDuration;
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNick
         */
        public String getCreatorNick() {
            return this.creatorNick;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return externalLinkUrl
         */
        public String getExternalLinkUrl() {
            return this.externalLinkUrl;
        }

        /**
         * @return invitedNum
         */
        public Integer getInvitedNum() {
            return this.invitedNum;
        }

        /**
         * @return roomCode
         */
        public String getRoomCode() {
            return this.roomCode;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer activeNum; 
            private Integer attendNum; 
            private Long confDuration; 
            private String conferenceId; 
            private String creatorId; 
            private String creatorNick; 
            private Long endTime; 
            private String externalLinkUrl; 
            private Integer invitedNum; 
            private String roomCode; 
            private Long startTime; 
            private Integer status; 
            private String title; 

            /**
             * ActiveNum.
             */
            public Builder activeNum(Integer activeNum) {
                this.activeNum = activeNum;
                return this;
            }

            /**
             * AttendNum.
             */
            public Builder attendNum(Integer attendNum) {
                this.attendNum = attendNum;
                return this;
            }

            /**
             * ConfDuration.
             */
            public Builder confDuration(Long confDuration) {
                this.confDuration = confDuration;
                return this;
            }

            /**
             * ConferenceId.
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * CreatorNick.
             */
            public Builder creatorNick(String creatorNick) {
                this.creatorNick = creatorNick;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExternalLinkUrl.
             */
            public Builder externalLinkUrl(String externalLinkUrl) {
                this.externalLinkUrl = externalLinkUrl;
                return this;
            }

            /**
             * InvitedNum.
             */
            public Builder invitedNum(Integer invitedNum) {
                this.invitedNum = invitedNum;
                return this;
            }

            /**
             * RoomCode.
             */
            public Builder roomCode(String roomCode) {
                this.roomCode = roomCode;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ConfInfo build() {
                return new ConfInfo(this);
            } 

        } 

    }
}
