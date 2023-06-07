// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCommandRequest} extends {@link RequestModel}
 *
 * <p>RunCommandRequest</p>
 */
public class RunCommandRequest extends Request {
    @Query
    @NameInMap("CommandContent")
    @Validation(required = true)
    private String commandContent;

    @Query
    @NameInMap("EnableParameter")
    private Boolean enableParameter;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("WindowsPasswordName")
    private String windowsPasswordName;

    @Query
    @NameInMap("WorkingDir")
    private String workingDir;

    @Query
    @NameInMap("WorkingUser")
    private String workingUser;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.commandContent = builder.commandContent;
        this.enableParameter = builder.enableParameter;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.timeout = builder.timeout;
        this.type = builder.type;
        this.windowsPasswordName = builder.windowsPasswordName;
        this.workingDir = builder.workingDir;
        this.workingUser = builder.workingUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return windowsPasswordName
     */
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    /**
     * @return workingUser
     */
    public String getWorkingUser() {
        return this.workingUser;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String commandContent; 
        private Boolean enableParameter; 
        private String instanceId; 
        private String name; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private Integer timeout; 
        private String type; 
        private String windowsPasswordName; 
        private String workingDir; 
        private String workingUser; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest request) {
            super(request);
            this.commandContent = request.commandContent;
            this.enableParameter = request.enableParameter;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
            this.type = request.type;
            this.windowsPasswordName = request.windowsPasswordName;
            this.workingDir = request.workingDir;
            this.workingUser = request.workingUser;
        } 

        /**
         * The content of the command. Take note of the following items:
         * <p>
         * 
         * *   When `EnableParameter` is set to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:
         * *   Define custom parameters in the {{}} format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.
         * *   The number of custom parameters cannot be greater than 20.
         * *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive.
         * *   Each custom parameter name cannot exceed 64 bytes in length.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * Specifies whether to include custom parameters in the command.
         * <p>
         * 
         * Default value: false.
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putQueryParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the command.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The custom parameters in the key-value pair format that are to be passed in when the command includes custom parameters. For example, if the command content is `echo {{name}}`, you can set the `Parameters` parameter to the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced with the paired Jack value to generate a new command. As a result, the `echo Jack` command is actually run.
         * <p>
         * 
         * Number of custom parameters ranges from 0 to 20. Take note of the following items:
         * 
         * *   The key cannot be an empty string and can be up to 64 characters in length.
         * *   The value can be an empty string.
         * *   After custom parameters and original command content are encoded in Base64, the command cannot exceed 16 KB in size.
         * *   The value of Parameters must be included in the custom parameters specified when you created the command. You can use empty strings to represent the parameters that are not passed in.
         * 
         * This parameter is empty by default. You can leave this parameter empty to disable the custom parameter feature.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies the timeout period of the command on the server.
         * <p>
         * 
         * If a task that runs the command times out, Command Assistant forcefully terminates the task process. Valid values: 10 to 86400. Unit: seconds. The period of 86400 seconds is equal to 24 hours.
         * 
         * Default value: 60.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The language type of the command. Valid values:
         * <p>
         * 
         * *   RunBatScript: batch commands (applicable to Windows servers).
         * *   RunPowerShellScript: PowerShell commands (applicable to Windows servers).
         * *   RunShellScript: shell commands (applicable to Linux servers).
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The name of the password to be used to run the command on a Windows server.
         * <p>
         * 
         * If you want to use a username other than the default "system" username to run the command on a Windows server, you must specify both the WindowsPasswordName and WorkingUser parameters. The password is hosted in plaintext in the parameter repository of Operation Orchestration Service (OOS) to reduce the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter.
         */
        public Builder windowsPasswordName(String windowsPasswordName) {
            this.putQueryParameter("WindowsPasswordName", windowsPasswordName);
            this.windowsPasswordName = windowsPasswordName;
            return this;
        }

        /**
         * The execution path of the command. You can specify a value for the parameter. Default execution paths vary based on the operating systems of the servers.
         * <p>
         * 
         * *   For Linux servers, the default execution path is the /home directory of the root user.
         * *   For Windows servers, the default execution path is C:\Windows\system32.
         */
        public Builder workingDir(String workingDir) {
            this.putQueryParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        /**
         * A user of the server who runs the command. We recommend that you run the command as a regular user to reduce security risks.
         * <p>
         * 
         * Default value:
         * 
         * *   For Linux servers, the default value is root.
         * *   For Windows servers, the default value is system.
         */
        public Builder workingUser(String workingUser) {
            this.putQueryParameter("WorkingUser", workingUser);
            this.workingUser = workingUser;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
        } 

    } 

}
