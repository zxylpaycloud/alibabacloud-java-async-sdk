// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLoadBalancerListenerRequest} extends {@link RequestModel}
 *
 * <p>StartLoadBalancerListenerRequest</p>
 */
public class StartLoadBalancerListenerRequest extends Request {
    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @Query
    @NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    private StartLoadBalancerListenerRequest(Builder builder) {
        super(builder);
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalancerId = builder.loadBalancerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartLoadBalancerListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static final class Builder extends Request.Builder<StartLoadBalancerListenerRequest, Builder> {
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String loadBalancerId; 

        private Builder() {
            super();
        } 

        private Builder(StartLoadBalancerListenerRequest request) {
            super(request);
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalancerId = request.loadBalancerId;
        } 

        /**
         * The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: **1** to **65535**.
         * <p>
         * 
         * > 
         * 
         * *   You cannot specify port 250, 4789, or 4790 for UDP listeners. The preceding ports are system reserved ports.
         * 
         * *   We recommend that you use port 80 for HTTP.
         * 
         * *   We recommend that you use port 443 for HTTPS.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The frontend protocol that is used by the ELB instance. Valid values:
         * <p>
         * 
         * *   tcp
         * *   udp
         * *   http
         * *   https
         * 
         * >  This parameter is required if the same port is used by listeners that use different protocols.
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * The ID of the ELB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        @Override
        public StartLoadBalancerListenerRequest build() {
            return new StartLoadBalancerListenerRequest(this);
        } 

    } 

}
