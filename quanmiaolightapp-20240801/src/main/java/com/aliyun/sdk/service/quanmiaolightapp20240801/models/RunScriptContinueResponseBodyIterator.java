// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunScriptContinueResponseBodyIterator extends SSEResponseIterator<RunScriptContinueResponseBody> {

    RunScriptContinueResponseBodyIterator() {
    }

    public static RunScriptContinueResponseBodyIterator create() {
        return new RunScriptContinueResponseBodyIterator();
    }

    @Override
    protected RunScriptContinueResponseBody toModel(String data) {
        RunScriptContinueResponseBody result = RunScriptContinueResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
