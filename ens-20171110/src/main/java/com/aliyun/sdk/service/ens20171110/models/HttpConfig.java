// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HttpConfig} extends {@link TeaModel}
 *
 * <p>HttpConfig</p>
 */
public class HttpConfig extends TeaModel {
    @NameInMap("Cookie")
    private String cookie;

    @NameInMap("CookieTimeout")
    @Validation(maximum = 86400, minimum = 1)
    private Integer cookieTimeout;

    @NameInMap("IdleTimeout")
    @Validation(maximum = 60, minimum = 1)
    private Integer idleTimeout;

    @NameInMap("RequestTimeout")
    @Validation(maximum = 180, minimum = 1)
    private Integer requestTimeout;

    @NameInMap("Scheduler")
    private String scheduler;

    @NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @NameInMap("StickySession")
    private String stickySession;

    @NameInMap("StickySessionType")
    private String stickySessionType;

    @NameInMap("XForwardedFor")
    private String xForwardedFor;

    private HttpConfig(Builder builder) {
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.idleTimeout = builder.idleTimeout;
        this.requestTimeout = builder.requestTimeout;
        this.scheduler = builder.scheduler;
        this.serverCertificateId = builder.serverCertificateId;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.xForwardedFor = builder.xForwardedFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpConfig create() {
        return builder().build();
    }

    /**
     * @return cookie
     */
    public String getCookie() {
        return this.cookie;
    }

    /**
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    /**
     * @return stickySession
     */
    public String getStickySession() {
        return this.stickySession;
    }

    /**
     * @return stickySessionType
     */
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    /**
     * @return xForwardedFor
     */
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

    public static final class Builder {
        private String cookie; 
        private Integer cookieTimeout; 
        private Integer idleTimeout; 
        private Integer requestTimeout; 
        private String scheduler; 
        private String serverCertificateId; 
        private String stickySession; 
        private String stickySessionType; 
        private String xForwardedFor; 

        /**
         * 服务器上配置的Cookie。 长度为1-200，只能包含ASCII英文字母和数字字符，不能包含逗号、分号或空格，也不能以$开头。 说明 当StickySession为on且StickySessionType为server时，该参数必选。
         */
        public Builder cookie(String cookie) {
            this.cookie = cookie;
            return this;
        }

        /**
         * Cookie超时时间。  取值：1~86400（秒）。   说明 当StickySession为on且StickySessionType为insert时，该参数必选。
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * 指定连接空闲超时时间，取值范围为1~60秒，默认值为15秒。  在超时时间内一直没有访问请求，负载均衡会暂时中断当前连接，直到一下次请求来临时重新建立新的连接。
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * 指定请求超时时间，取值范围为1~180秒，默认值为60秒。  在超时时间内后端服务器一直没有响应，负载均衡将放弃等待，给客户端返回 HTTP 504 错误码。
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * 调度算法。取值：  wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。 wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。 rr：按照访问顺序依次将外部请求依序分发到后端服务器。
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * 服务器证书的ID。
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * 是否开启会话保持。  取值：on | off。
         */
        public Builder stickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }

        /**
         * cookie的处理方式。取值：  insert：植入Cookie。  客户端第一次访问时，负载均衡会在返回请求中植入Cookie（即在HTTP/HTTPS响应报文中插入SERVERID），下次客户端携带此Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器上。  server：重写Cookie。  负载均衡发现用户自定义了Cookie，将会对原来的Cookie进行重写，下次客户端携带新的Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器。   说明 当StickySession的值为on时，必须指定该参数。
         */
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * 是否开启通过X-Forwarded-For头字段获取来访者真实 IP。  取值为on。
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        public HttpConfig build() {
            return new HttpConfig(this);
        } 

    } 

}
